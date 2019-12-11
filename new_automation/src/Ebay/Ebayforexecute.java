package Ebay;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Ebayforexecute {
	public WebDriver driver;
  @Test
  public void f() {
	  Home obj =new Home(driver);
	  Singup obj2 =new Singup(driver);
	  CreatAccount obj1 = new CreatAccount(driver);
	  obj.singin();
	  obj1.CreatAcc();
	  obj2.firstname("hedayat");
	  obj2.lastname("aka");
	  obj2.email("aka@gmail.com");
	  obj2.pswd("njihnjnk");
	  obj2.submitbotton();
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\hedayat\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.navigate().to("https://ebay.com");
  }

  @AfterClass
  public void afterClass() {
  }

}
