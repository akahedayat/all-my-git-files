package Practice_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Prime_practice {
	static WebDriver driver;
	
	@FindBy(xpath = "//*[@value='Try Prime']")[2])
			WebElement tryclick;
			
			public Prime_practice(WebDriver driver) {
				this.driver = driver;
				PageFactory.initElements(driver, this);
			}
			public void ajmal() {
				tryclick.click();
			}
}
