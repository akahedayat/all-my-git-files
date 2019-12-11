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

public class login_ {
	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hedayat\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://facebook.com");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.close();
	}

	@Before
	public void setUp() throws Exception {
		Thread.sleep(1000);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(1000);
	}

	@Test
	public void test() {
		driver.findElement(By.id("email")).sendKeys("aka@hotmail.com");
		  driver.findElement(By.id("pass")).sendKeys("akajan");
		  driver.findElement(By.id("loginbutton")).click();
	
		
	}

}
