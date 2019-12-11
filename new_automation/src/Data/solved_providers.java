package Data;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class solved_providers {
	static WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  driver.findElement(By.id("email")).sendKeys(n);
	  driver.findElement(By.id("pass")).sendKeys(s);
	  driver.findElement(By.xpath("//*[@aria-label='Log In']")).click();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "abc@gmail.com", "a" },
      new Object[] { "kdjs@gmail.com", "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\hedayat\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
  }

  @AfterClass
  public void afterClass() {
  }

}
