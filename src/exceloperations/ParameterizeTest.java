package exceloperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParameterizeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//web driver code
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Faiz Riyaz\\Desktop\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //launch not in for loop as we have to open one site and test different data
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
		//Data Driven approach--data driven means driving data from other source ex: here is excel ,used to create data driven framework,data driven is also called parameterization
		//get test data from excel
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Faiz Riyaz\\eclipse-workspace\\1Selenium\\EbayRegisterTestData.xlsx");
	int rowcount =	reader.getRowCount("RegTestData");
		
		for(int rownum=2;rownum<=rowcount;rownum++)
		{
			String firstname =reader.getCellData("RegTestData", "firstname", rownum);
			System.out.print(" "+firstname);
			String lastname =reader.getCellData("RegTestData", "lastname", rownum);
			System.out.print(" |"+lastname);
			String email =reader.getCellData("RegTestData", "email", rownum);
			System.out.print("| "+email);	
			String password =reader.getCellData("RegTestData", "password", rownum);
				System.out.println();
			//enter data
			driver.findElement(By.xpath("//*[@id='firstname']")).clear();
			Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(firstname);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"lastname\"]")).clear();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(lastname);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(email);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"password\"]")).clear(); 
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);               
				
		}
			
	}

}
