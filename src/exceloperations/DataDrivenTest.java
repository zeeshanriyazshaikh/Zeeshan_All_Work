package exceloperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// GET TEST DATA FROM EXCEL ,data driven from different resources: 1)excel ,2)properties file,3)testng.xml,4)Xml files,5)JSON files,6)DB, first 3 are popular.
		//1.excel file--we store test data
		//2.properties file--environment variables OR test data
		//3.testng.xml--environment variables,@test,@parameter annotation is available in testng.
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Faiz Riyaz\\eclipse-workspace\\1Selenium\\EbayRegisterTestData.xlsx");
		String firstname =reader.getCellData("RegTestData", "firstname", 2); //press control and click getcelldata to get to see xls_reader code for reading
System.out.print(" "+firstname);
String lastname =reader.getCellData("RegTestData", "lastname", 2);
System.out.print(" |"+lastname);
String email =reader.getCellData("RegTestData", "email", 2);
System.out.print("| "+email);	
String password =reader.getCellData("RegTestData", "password", 2);
	
	System.out.print("| "+password);
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Faiz Riyaz\\Desktop\\chrome driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
	driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(firstname);
	driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(lastname);
	driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(email);
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);               
	
	
	
	
	
	
	
	
	
	
	}
	

}
