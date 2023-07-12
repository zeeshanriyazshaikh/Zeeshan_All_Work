import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropertyFile {
	static WebDriver driver;          //global variable for WebDriver interface
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		

		Properties prop = new Properties();   //To read properties from file we have one  class that is Properties.
		FileInputStream ip = new FileInputStream("C:\\Users\\Faiz Riyaz\\eclipse-workspace\\1Selenium\\config.properties"); //file input stream class connect to file location
		prop.load(ip);  //method to load file 
		System.out.println(prop.getProperty("name")); //prop.getproperty method is to get value of its key that in config.property file
		System.out.println(prop.getProperty("age"));
	String browserName =	prop.getProperty("browser");
		String url = prop.getProperty("URL");
		
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Faiz Riyaz\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(browserName.equals("FF"))
				{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Faiz Riyaz\\Downloads\\geckodriver.exe");
			driver=new FirefoxDriver(); 
				}
		 driver.get(url);
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstname"));
	}
}
//THEORY
/*               FRAME WORK          */

/*
1.Its a structural way of converting manual steps into automation test.

2.In the project create firstly an excel file with a name 'lead suit ' which consists of manual steps that needs to be auto mated as shown below.

3.NOTE: CAPTCHA and OTP cannot be automated

 */

