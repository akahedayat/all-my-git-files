package POM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestNGexcute {// testNG execution class.
	public WebDriver driver;
  @Test
  public void f() {
	  AmazonTestNG myamazon = new AmazonTestNG(driver); 
	  
	  myamazon.clickloginfield();
	//  myamazon.clickfindgift();
	  //myamazon.clickonbaby();
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\hedayat\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://amazon.com");
  }

  @AfterClass
  public void afterClass() {
  }

}
