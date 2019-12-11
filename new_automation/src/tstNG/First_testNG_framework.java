package tstNG;

import org.testng.annotations.Test;

import POM.Home;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class First_testNG_framework {
	public WebDriver driver;
  @Test
  public void f() {
	  //Going to click for forgot account link
	  Home home=new Home(driver);
	  home.clickforgotlink();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\hedayat\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://facebook.com");
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(6000);
	  driver.close();
  }

}
