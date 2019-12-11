package com.amazon.amazon1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	WebDriver driver;

	@FindBy(id = "homeval")
	WebElement homevaluetext;
	@FindBy(id = "downpayment")
	WebElement downpaymentoption;
	@FindBy(id = "loanmat")
	WebElement loanfl;
	@FindBy(id = "intrstsrate")
	WebElement intrest;
	@FindBy(name = "ratebutton")
	WebElement clbutton;
	@FindBy(id= "nextbtn")
	WebElement nextoption;

	public Home_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

 

	public void homevalue(String digits) {
		homevaluetext.sendKeys(digits);

	}

	public void downpayment(String depayment) {
		downpaymentoption.sendKeys(depayment);

	}
	public void loanmat(String payloan) {
		loanfl.sendKeys(payloan);
		
	}
	public void intrstsrate(String payintret) {
		intrest.sendKeys(payintret);
		
	}
	public void ratebutton() {
		clbutton.click();
		
	}
	public void nextpage(String otherone) {
		nextoption.click();
		
		
	}


		
	}
