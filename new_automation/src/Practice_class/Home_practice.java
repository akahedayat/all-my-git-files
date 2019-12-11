package Practice_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_practice {
	static WebDriver driver;

	
	@FindBy(xpath = "//*[@class='nav-line-2 ']") 
	WebElement Primeclick;

	public Home_practice(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void prime() {
		Primeclick.click();

	}
}
