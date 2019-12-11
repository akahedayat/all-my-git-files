package Ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory; 

public class Singup {
	public WebDriver driver;
	
	@FindBy(id="firstname")
	WebElement Firstnameoption;
	@FindBy(id="lastname")
	WebElement lastnameoption;
	@FindBy(id="email")
	WebElement emailoption;
	@FindBy(id="password")
	WebElement passwordoption;
	@FindBy(id="PPaFormSbtBtn")
	WebElement submitoption;
	
	public Singup (WebDriver driver) { // this is the constructor of the class.
	    this.driver=driver;	
	    PageFactory.initElements(driver, this);
		}
	public void firstname (String fname) { 
		Firstnameoption.sendKeys(fname);
	}
	public void lastname (String lname) {
		lastnameoption.sendKeys(lname);
	}
	public void email(String EmName) {
		emailoption.sendKeys(EmName);
	}
	public void pswd (String pwd) {
		passwordoption.sendKeys(pwd);
	}
	public void submitbotton() {
		submitoption.clear();
	
	
	
	
	}

}
