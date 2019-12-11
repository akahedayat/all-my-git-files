package Coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {
	public static WebDriver driver;
	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hedayat\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.navigate().to("https://www.walmart.com");
		// driver.findElement(By.xpath("(//*[text()='Sign In'])[1]")).click();
		 driver.findElement(By.id("global-search-input")).sendKeys("beuty");
		 driver.findElement(By.xpath("(//*[@class='g_a g_f'])[2]")).click();
		 
		 
		
	}

}
