package OPPS_Inheritance;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hedayat\\eclipse-workspace\\new_automation\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		takeScreenshot("Facebook_LoginPage");

	}
	
	public static void takeScreenshot(String fileName) throws IOException {
		//1. take screenshot and store it as file name
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//2. now copy the screenshot to desired location copy file method:
		FileUtils.copyFile(file, new File("C:\\Users\\hedayat\\eclipse-workspace\\new_automation\\src\\OPPS_Inheritance\\"+fileName+".jpg"));
		
	}

}