package Coding;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// we use contain to write some of the text instead of writing all text.
public class Contains {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hedayat\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.navigate().to("https://");

	
	}
}
