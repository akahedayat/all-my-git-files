package Ebay;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class points {
	public WebDriver driver;   // assert is used to varify our result.
  @Test(priority = 3)
  public void f() { 
	  int a=20;
	  int b=50;
	  int c=a+b;
	  System.out.println(c);
	  SoftAssert ui = new SoftAssert();
	  ui.assertEquals(c, 70);
	  System.out.println("This of after assertion");
	  ui.assertAll();
  }
  @Test(priority = 0)
  public void bi() {
	  System.out.println("This is frist method");
  }
  @Test(priority = 1)
  public void bu() {
	  System.out.println("This is second method");
  }
  @Test(priority = 2)
  public void ux() {
  System.out.println("This is third method");
  }
  

}
