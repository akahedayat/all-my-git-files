package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonTestNG {
	
	public WebDriver driver;  // this is out interface.
	
	@FindBy(xpath="(//*[@class='nav-a nav-a-2'])[1]") // we initialize the elements by locators.
	WebElement loginfield;
	@FindBy(className = "nav-text")
	WebElement findagift;
	@FindBy(className = "rsqc7f-0 iKCwjs")
	WebElement babies;
	
	public AmazonTestNG(WebDriver driver) {// when we call the construtor it asks you to put driver here.
		this.driver = driver;
		PageFactory.initElements(driver, this); //
		// pagefactory helps you to intialize your elements.
	}
	
	public void clickloginfield () {
		loginfield.click();
	}
	public void clickfindgift () { 
		findagift.click();
	}
	 public void clickonbaby () {
		 babies.click();
	 }
	
	
	
	

}
