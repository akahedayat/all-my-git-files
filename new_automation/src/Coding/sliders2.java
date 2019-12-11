package Coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sliders2 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hedayat\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 Actions hamid = new Actions(driver);
		 driver.get("https://jqueryui.com/slider/");
		 driver.switchTo().frame(0);
		 Thread.sleep(3000);
		 hamid.dragAndDropBy(driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']")), 511, 0).perform();

}
}