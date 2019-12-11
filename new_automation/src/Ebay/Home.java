package Ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public WebDriver driver;    // this is interface.
	@FindBy(linkText ="Sign in")  // locating the element.
	WebElement signinlink; // we store 
	
	public Home(WebDriver driver) { // this is the constructor of the class.
    this.driver=driver;	// we said driver is equal to driver.
    PageFactory.initElements(driver, this);
	}
	public void singin () {
		signinlink.click();
	}

}
