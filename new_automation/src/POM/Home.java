package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Home {
	
	public WebDriver driver;
	
	@FindBy(id="email")
	WebElement emailfield;
	@FindBy(id="pass")
	WebElement passwd;
	@FindBy(id="loginbutton")
	WebElement loginbutton;
	@FindBy(linkText = "Forgot account?")
	WebElement forgotlink;
	
	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enteremail() {
		emailfield.sendKeys("omid@gamil.com");
	}
	public void enterpasswd() {
		passwd.sendKeys("small");
	}
	public void clickloginbutton() {
		loginbutton.click();
	}
	public void clickforgotlink() {
		forgotlink.click();
  	}

}
