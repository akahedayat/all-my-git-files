package Coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
// we 
public class drag_drop {
public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hedayat\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 Actions point = new Actions(driver);
		 driver.get("https://jqueryui.com/droppable/");
		 Thread.sleep(5000);
		 driver.switchTo().frame(0);
		 Thread.sleep(5000);
		 point.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).perform();
		 

}
}