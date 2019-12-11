package Coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocators {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\hedayat\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.walmart.com"); // opens walmart webseite.
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]/div/div[3]/div/div/form/button[1]/span/span[2]")).click();// all departments.
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]/div/div[3]/div/div/form/div[1]/div[3]/div[1]/button[3]")).click();// baby section.
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]/div/div[3]/div/div/form/button[3]/span/span")).click();// search button.
		driver.findElement(By.xpath("Britax Advocate Clicktight ARB Convertible Car Seat - Circa")).click();
		Thread.sleep(6000);
		driver.manage().window().maximize();// why it didn't maximize my window?
		

	}

}
