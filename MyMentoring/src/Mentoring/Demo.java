package Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hedayat\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
//		//public static WebDriver driver;
//
//		public static void main(String[] args) throws InterruptedException {
//			System.setProperty("webdriver.chrome.driver","C:\\Users\\hedayat\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//			driver = new ChromeDriver();
//			driver.get("https://www.facebook.com");
//			driver.findElement(By.id("email")).sendKeys("nabi@gmail.com");
//			driver.findElement(By.id("pass")).sendKeys("mypassword");
//			driver.findElement(By.id("u_0_f")).sendKeys("First Name");
//			driver.findElement(By.id("u_0_h")).sendKeys("Last Name");
//			driver.findElement(By.id("u_0_k")).sendKeys("389283748");
//			driver.findElement(By.id("u_0_p")).sendKeys("mypassword");
//			//driver.findElement(By.id("month")).sendKeys("Mar");
//			driver.findElement(By.id("u_0_a")).click();
//			Thread.sleep(2000);
//			//driver.findElement(By.id("u_0_w")).click();
//			//System.out.println(driver.getCurrentUrl()); // why it didnt show me the right url?
//			driver.close();
//			



	
		 
	}

