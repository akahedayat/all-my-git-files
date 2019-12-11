package com.amazon.amazon1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class margagetestng {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		Home_page obj1 = new Home_page(driver);

		obj1.homevalue("95000");
		obj1.downpayment("40000");
		Thread.sleep(2000);
		//obj1.loanmat("1000");
		obj1.intrstsrate("2.50");
		obj1.ratebutton();
	//	obj1.nextpage();

	}
	@BeforeClass
	public void beforeClass() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hedayat\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.navigate().to("https://www.mortgagecalculator.org");
	}

	@AfterClass
	public void afterClass() {
	}

}
