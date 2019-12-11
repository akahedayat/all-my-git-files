package Frame;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	static WebDriver driver;

	@BeforeClass
	
		public static void setUpBeforeClass() throws Exception {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hedayat\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.navigate().to("https://amazon.com");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//driver.close();
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("ap_email")).sendKeys("amazon@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("afghanistan");
		driver.findElement(By.id("auth-signin-button")).click();
	
	}
	

}
