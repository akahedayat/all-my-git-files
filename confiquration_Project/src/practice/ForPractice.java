package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForPractice {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "C:\\\\Users\\\\hedayat\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Hedaayat@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("mypassords");
		//driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
		driver.findElement(By.id("u_0_f")).sendKeys("my first name");
		driver.findElement(By.id("u_0_h")).sendKeys("my last name");
		driver.findElement(By.id("u_0_k")).sendKeys("myEmail@gmail.com");
		
	}
	 
	
	}


