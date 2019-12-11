package Coding;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class gmail_account {
	
	public static WebDriver driver;

		public static void main(String[] args)  {
			
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hedayat\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		//driver.findElement(By.id("//input[@type='email']")).click();
		}
		
}
