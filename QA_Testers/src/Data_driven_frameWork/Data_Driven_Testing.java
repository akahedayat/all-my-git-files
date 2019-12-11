package Data_driven_frameWork;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Data_Driven_Testing {
	public WebDriver driver;
	@Test(dataProvider = "testdata")
	public void login(String username,String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hedayat\\eclipse-workspace\\QA_Testers\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.gcrit.com/build3/admin/");
	
	Thread.sleep(5000);
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.id("tdb1")).click();
	//Assert.assertEquals("http://www.gcrit.com/build3/admin/index.php", driver.getCurrentUrl());
	driver.close();
	
	}
	
	
	
	
	
	@DataProvider(name = "testdata")

	public  Object[][] akaexcel () throws BiffException, IOException {
		File excel = new File("C:\\Users\\hedayat\\Desktop\\my excell project.xls");
		System.out.println("excel located"+excel);
		Workbook wkbk =Workbook.getWorkbook(excel);
		System.out.println("workbook located" + wkbk);
		Sheet sht = wkbk.getSheet("Sheet1");
		int rows= sht.getRows();
		int colums= sht.getColumns();
		String input_data [][] = new String [rows][colums];
		for (int i = 0; i<rows; i++) {
			for (int j =0;j<colums; j++) {
				Cell cl =sht.getCell(j, i);
				 
				input_data [i][j] = cl.getContents();
				System.out.println(input_data[i][j]);
				
			}
		}
		return input_data;
	}

}
