package Coding;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pointer {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hedayat\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
	   driver = new ChromeDriver(); 
	   driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
	   Actions hovr=new Actions(driver);
	   
	   driver.navigate().to("https://www.walmart.com");
	   driver.manage().window().maximize();
	   

	}

}
