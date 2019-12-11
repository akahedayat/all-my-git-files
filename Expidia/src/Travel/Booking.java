package Travel; // how to open 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hedayat\\Downloads\\chromedriver_win32 (78)\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.expedia.com/");
		driver.findElement(By.xpath("//*[@id=\"traveler-selector-hp-package\"]/div/ul/li/button")).click();
		for (int o = 1; o < 5; o++) {
			driver.findElement(By.xpath("(//*[@fill='#000000'])[26]")).click();
			
		
		
			

		}

		// System.out.println(driver.getCurrentUrl()); // it showes the right url.
		System.out.println(driver.getCurrentUrl());

	}

}
//if we use our selenium in elcips, we need to confiqure selenium jars to our current project.
//how to confiqure? go to project+rightclick+properties+javabuilt path+libraries+addexternal jars+go to the specific tool tdo configure.
//syntax for xpath: //tagName[@attribute='value']
//syntax for containsxpath: //tagName[contains(@attribute,'value')] i need to watch youtube.
