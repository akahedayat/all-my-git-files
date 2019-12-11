package tstNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class data_provider {
	static WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  driver.findElement(By.id("email")).sendKeys(n);
	  driver.findElement(By.id("pass")).sendKeys(s);
	  driver.findElement(By.xpath("//*[@aria-label='Log In']")).click();
	  Thread.sleep(5000);
	  driver.navigate().back();
	  Thread.sleep(5000);
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("pass")).clear();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"abcW@gmail.com", "a" },
      new Object[] {"abcdf@hotmail.com", "b" },
    };
  }
  @Parameters("browser")
  
  @BeforeClass
  public void beforeClass(String browsers) {
	 if (browsers.equalsIgnoreCase("chrome")) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\hedayat\\eclipse-workspace\\new_automation\\Drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.navigate().to("https://www.facebook.com");
	 driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	 } else if(browsers.equalsIgnoreCase("firefox")) {
	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\hedayat\\eclipse-workspace\\new_automation\\Drivers\\geckodriver.exe"); 
	 driver=new FirefoxDriver();
	 driver.get("https://www.facebook.com");
	  
  }else {
	  System.out.println("the browser is not found");
  }
  }
  @AfterClass
  public void afterClass() {
  }

}
