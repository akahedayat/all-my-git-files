package Coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Relative_xpath {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hedayat\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.navigate().to("https://facebook.com");
		//driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("hamid@gmail.com");// basic relative xpath
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("mypassord1");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();
	//	Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("myname");
		//driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("my last name");
		//driver.findElement(By.xpath("//input[contains(@aria-label, 'Mobile')][1]")).sendKeys("2028489626");// contains relative xpath
		//driver.findElement(By.xpath("//*[starts-with(@aria-label,'New')][1]")).sendKeys("my facebook");// starts-with relative xpath
    // Select optional=new Select(driver.findElement(By.id("month")));
     //optional.selectByVisibleText("Oct");
     //Select optional1=new Select(driver.findElement(By.name("birthday_day")));
     //optional1.selectByVisibleText("9");
    Select optional2=new Select(driver.findElement(By.id("year")));
    optional2.selectByIndex(2);// how did it work?
  driver.findElement(By.id("u_0_b")).click();
     
     
     

	}

}
