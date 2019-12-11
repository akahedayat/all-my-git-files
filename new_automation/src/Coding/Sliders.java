package Coding;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sliders {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hedayat\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
				 
		 
		driver.navigate().to("https://jqueryui.com/droppable/");

	}

}
