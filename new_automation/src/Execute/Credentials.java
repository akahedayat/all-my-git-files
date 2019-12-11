package Execute;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Home;

public class Credentials {
	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hedayat\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://facebook.com");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test// we create the object of homepage class here.
	public void test() {
		Home exec = new Home (driver);
		exec.enteremail();
		exec.enterpasswd();
		exec.clickloginbutton();
		 
	}

}
