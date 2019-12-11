package Morgage_Calculator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Mor_Cal {
	static int i;
	static String Homevalue, DownPay, IntRate, LoanTerm, PropTax, PMI, HomeIns, MnthHOA;

	public static WebDriver driver; // globle refrence variable

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hedayat\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mortgagecalculator.org");
for (i = 01; i <=5; i++) {
			
			
		if (i==1) {
		Homevalue = "520000";
		DownPay = "170000";
			IntRate = "4.50";
		LoanTerm = "30";
		PropTax = "7000";
		PMI = "1.0";
		HomeIns = "600";
		MnthHOA = "104";

		} else if (i==2) {
		
		Homevalue = "620000";		DownPay = "270000";			IntRate = "4.75";
			LoanTerm = "35";
		PropTax = "10000";
			PMI = "2.0";
			HomeIns = "800";	MnthHOA = "120";	
	
		}else if (i==3) {
			Homevalue = "650000";
			DownPay = "290000";
			IntRate = "4.50";
			LoanTerm = "30";
			PropTax = "15000";
			PMI = "3.0";
			HomeIns = "8000";
			MnthHOA = "150";	
			}else if (i==4) {
			Homevalue = "550000";
		DownPay = "120000";
		IntRate = "4.75";
		LoanTerm = "30";
			PropTax = "1500";
			PMI = "3.0";
			HomeIns = "10000";
			MnthHOA = "250";	
		} else if (i==5) {
			
			Homevalue = "540000";
			DownPay = "90000";
			IntRate = "5";
			LoanTerm = "30";
			PropTax = "70000";
			PMI = "2.0";
			HomeIns = "1100";
			MnthHOA = "145";			
		}				
		
		
		
		// driver.manage().window().maximize();

//			Create a Test Script that iterates at least 4 times with the help of for loop 
//
//			2.Follow below steps for the assignment.
//			a.	 go to https://www.mortgagecalculator.org/ , and create an automation script that will iterate atleast 4 times with different sets of data. 

		
		// b. All data must be stored in variables.
//			c. 	You must use implicit and explicit wait wherever needed.
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); // it gives you wait time for all your test
																		// steps.
//			d.	Get Current window ID, and url for the mortgage calculator homepage and print it on console.
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
//			e. 	Check if you are on "Mortagecalculator page", if yes, then print the boolean value (true or false).
//			f.	Capture the "Morgage calculator" title and save it to a string variable  and print it on console.
//			g.	enter the Home Value
		driver.findElement(By.id("homeval")).sendKeys("500000");
//			h.	Enter down payments
		driver.findElement(By.id("downpayment")).sendKeys("80000");
//			i.	enter interest rate
		driver.findElement(By.id("intrstsrate")).sendKeys("0.5");
//			j.	enter loan term
		driver.findElement(By.cssSelector("input[id='loanterm']")).sendKeys("10");
//			k.	select start month
		Select drp = new Select(driver.findElement(By.xpath("//*[@name='param[start_month]']")));
		drp.selectByVisibleText("May");
//			l.	enter start year
		driver.findElement(By.id("start_year")).sendKeys("2020");
//			m.	enter property tax
		driver.findElement(By.id("pptytax")).sendKeys("3500");
//			n.  enter pmi
		driver.findElement(By.id("pmi")).sendKeys("0");
//			o.	enter home ins
		driver.findElement(By.xpath("//*[@class='right-cell' and @name='param[hoi]']")).sendKeys("1200");
//			p.	enter monthly HOA
		driver.findElement(By.xpath("//*[@class='right-cell' and @name='param[hoa]']")).sendKeys("105");
//			q.	select loan type
		Select drp1 = new Select(driver.findElement(By.name("param[milserve]")));
		drp1.selectByVisibleText("VA");
//			r.	click on Cmpare Loan Types
		driver.findElement(By.name("loantypebutton")).click();
//			s.	get the window id for the page.
		Thread.sleep(5000);
		driver.switchTo().frame(1);
		System.out.println("FHA Loan window ID: " + driver.getWindowHandle());
//			t.  Capture FHA Loan and print it on console.
		
		String capturFHA = driver.findElement(By.xpath("//h1[text()='FHA Loan']")).getText();
		System.out.println("FHA captured: " + capturFHA);
		
//			u.	verify and compare the Minimum Down Payment:3.5%
		String expectedMessege = "Minimum Down Payment: 3.5%";
		
		Thread.sleep(5000);
		String capMDP = driver.findElement(By.xpath("//li[text()='Minimum Down Payment: 3.5%']")).getText();
		System.out.println("MDP is catured: " + capMDP);
//			v.	The expected value  is : "Minimum Down Payment: 3.5%"
		try {
		
		Assert.assertEquals(capMDP, expectedMessege);
		} catch( AssertionError errorMessege) {
			System.out.println("assertion compariosn : the compariosn was  not succefull, they are not the same");
			throw errorMessege;
		}
		System.out.println("assertion compariosn, the compariosn was succefull, they are the same");
		

//					hint: capture the actual value "Minimum Down Payment: 3.5%",and save it in a string variable then compare it with the expected value "Minimum Down Payment: 3.5%", use Assertions and if statements. Make sure to print on console.
					
//			w.	Close the FHA Loan Page
		driver.switchTo().defaultContent();
		driver.findElement(By.id("cboxClose")).click();
		
//			x.	Select Buy or Refi.
		Select drp2 = new Select(driver.findElement(By.name("param[refiorbuy]")));
		drp2.selectByVisibleText("Buy");
		
//			y.	Select Credit Rating
		Select drp3 = new Select(driver.findElement(By.id("credit_rating")));
		drp3.selectByVisibleText("Good (620 - 719)");
		
//			z.	Click on show Amortization Tables
		driver.findElement(By.xpath("//a[contains(text(),'Show Amortization Tables')]")).click();
		
//			aa.	create a script that will toggle or select  "Draw Charts", "Show annual amortization table", and "Show monthly amortization table"
//					--->if its toggled already then don't click on it, if not
		//		then click on it and mark it.--> use conditional statements if needed.
		WebElement drawcharts =driver.findElement(By.xpath("//label[contains(text(),'Draw charts')]"));
		if(!drawcharts.isSelected()) {
			drawcharts.click();
		}
			
		WebElement monthly = driver.findElement(By.xpath("//label[contains(text(),'Monthly vs bi-weekly payments')]"));
		if (!monthly.isSelected()) {
		monthly.click();
		}
		
		WebElement showAnwal = driver.findElement(By.xpath("//*[@for='show_annual_i']"));
		if(!showAnwal.isSelected()) {
			showAnwal.click();
		}
		WebElement showmonthly = driver.findElement(By.xpath("//label[text()= 'Show monthly amortization table']"));
		if (!showmonthly.isSelected()) {
			showmonthly.click();
		}
		
//			ab.	Click on Calculate button
		driver.findElement(By.xpath("//input[@type='submit' and @class='styled-button']")).click();
		
//			ac.	Capture Total Monthly Payment from the "Mortgage Repayments Summary"
			String TMP =driver.findElement(By.xpath("(//div[@class='left-cell'])[1]")).getText();
			System.out.println("Monthly payment is captured: " + TMP );
		System.out.println("-------------------------------------------------");
//			ad. From Yearly Amortization Schedule capture the interest for any year based on your loan term(2019 to 2050)
			String intrest=driver.findElement(By.xpath("//*[@id=\"schedule\"]/div[4]/div[2]")).getText();
			System.out.println("print me the interest: " +intrest);
			
//			ae.	From Monthly Amortization Schedule capture the Principle for the month of Oct, 2020.
			String monthOct=driver.findElement(By.xpath("(//div[@class='col4 right'])[56]")).getText();
			System.out.println("Principle of Oct 2020: " +monthOct);
			
//			ad. Print a meaningful text for each iteration.
			//System.out.println("");

	}
	}
}
