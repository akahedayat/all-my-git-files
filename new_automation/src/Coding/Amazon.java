package Coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Amazon {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		//Write to script which navigate to amazon.com search for iphone and click on the iphone which displays in the result.
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hedayat\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
        Thread.sleep(2000);
       driver.findElement(By.className("nav-input")).click();
       Thread.sleep(2000);
      driver.findElement(By.linkText("Apple iPhone 6S, 32GB, Rose Gold - For AT&T / T-Mobile (Renewed)")).click();
      Thread.sleep(2000);
      driver.close();
      
   /* what is different between close and quit? 
      1- The driver.close() command is used to close the current browser window having focus.
     2- The driver.quit() is used to quit the whole browser session along with all the associated browser windows, tabs and pop-ups.*/
      driver.close();
      
	}

}
