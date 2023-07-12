package Testng;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testngTestUtilDataProvider.TestUtilDataProvider;

public class EbayTestDataProvider { //this is not perfect program just idea or understanding
WebDriver driver;
String a;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData(){//as we want return in iterator return type kept here is Iterator<Object[]>
		ArrayList<Object[]> testData=TestUtilDataProvider.getDatafromExcel(); //calling method directly like class.method as method we kept static,getDatafromExcel() returning ArrayList<Object[]> so storing method return type in ArrayList<Object[]> testData,we can see return type by mouse overing on getDatafromExcel. 
		return testData.iterator();  //iterate array list object testData each and every element in proper sequence,it will iterate whatever array list is available because array list stores value in form of sequence so iterator returns all the value in proper sequence one by one example first name,last name etc.
	}
	
		 //as TestUtilDataprovider method getDataFromExcel is static we can call directly by class name.method
		
	
	
	

	@Test(dataProvider="getTestData") //dataProvider = @DataProvider method i.e:"getTestData"
	public void EbayRegTest(String firstName,String lastName,String Email,String Password) {//defining variables for each column in excel
		//enter data
		driver.findElement(By.xpath("//*[@id='firstname']")).clear();
		//Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(firstName);
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"lastname\"]")).clear();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(lastName);
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(Email);
		//	Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).clear(); 
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Password);
	}
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
