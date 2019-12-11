package Coding;

 

import java.awt.Point;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


// why use actions class? it basically controls our keyboard and mouse.
public class ActionsClass {
static WebDriver driver;
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hedayat\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://facebook.com");
		
		String currentwindow=driver.getWindowHandle(); // what is the different.
		System.out.println(currentwindow);
		
Actions point=new Actions(driver);// how did it come?
	WebElement forgot= driver.findElement(By.linkText("Forgot account?"));// how  did it  come?
		//forgot.click();  // how did it come?
		
		point.keyDown(Keys.SHIFT).click(forgot).build().perform(); // how did it come?
		Set <String> ids=driver.getWindowHandles();
		System.out.println(ids);
		
		for (String hedayat:ids) {                                           
			if (hedayat != currentwindow) {
				driver.switchTo().window(hedayat);
			}
			
		}
		
		driver.findElement(By.className("did_submit")).click();
	}

}
		
