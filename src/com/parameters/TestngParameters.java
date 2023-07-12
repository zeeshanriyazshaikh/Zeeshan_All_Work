package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

                             //DATA DRIVEN METHOD FROM PARAMETERS ANNOTATION IN TESTNG
//Used to store environmental variables as below that are generic and can be used repeatedly
//similarly @Dataprovider annotation fetching data concept from excel
public class TestngParameters {

	WebDriver driver;
@Test
@Parameters({"url","firstname","lastname","password","email"}) //parameters annotation in testng is like config.properties file where we pass key and value
public void ebayLogintest(String url,String password,String firstname,String lastname,String email)//parameterized method
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Faiz Riyaz\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get(url);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("firstname");
	driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("lastname");
	driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("email");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");        
}
	
	
	
	
	
	
	
	
	
}
