package Coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Code1 {
public static WebDriver driver; // this is driver interface.

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hedayat\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver(); // this is constructor of chrome driver, it helps to operate the browser.
	// two ways to open the site in the browser.
	driver.get("https://www.facebook.com");// first way.
	//driver.navigate ().to("https://facebook.com");// second way.
/*	Thread.sleep( 6000);// it refreshes after 6 seconds.
	driver.navigate().refresh();
	Thread.sleep (6000);
	driver.navigate().back();// it takes you to pervious after 6 seconds.
	Thread.sleep (6000);
	driver.navigate().forward();
	
	Thread.sleep (6000);
	driver.manage().window().maximize();// it makes maximize your page after 6 seconds.
	Thread.sleep (6000);
	driver.close(); // It is used to close the current browser window having focus.
	driver.quit();   //It is used to quit the whole browser session along with all the associated browser windows, tabs and pop-ups.
	*/
	// driver.findElement(By.id("email")).sendKeys("");
	//driver.findElement(By.id("pass")).sendKeys("");
//	driver.findElement(By.id("loginbutton")).click();
  //  driver.findElement(By.linkText("Data Policy")).click();
  // driver.findElement(By.partialLinkText("Data ")).click();// 6 partial is for the short copy of all link.
	driver.findElement(By.name("firstname")).sendKeys("Hedayat");
	driver.findElement(By.name("lastname")).sendKeys("aka jan");
	driver.findElement(By.name("reg_passwd__")).sendKeys("abcd12345");
	driver.findElement(By.className("reg_email__")).sendKeys("abcd@gmail.com");
  driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/input")).sendKeys("myusername");
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("mypassowrd");
	//driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/label/input")).click();
	
	
	
	}
	

}
