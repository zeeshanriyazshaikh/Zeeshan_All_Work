package UtilityLayer.Implementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonDriver {

	WebDriver driver;
	int pageLoadTimeOut;
	int elementDetectionTimeOut; 
	
	public CommonDriver(String browser) throws Exception {
		pageLoadTimeOut = 20;
		elementDetectionTimeOut = 20;
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("FF")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			throw new Exception("invalid request");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	public void navigateToUrl(String url) {
		driver.manage().timeouts().pageLoadTimeout(pageLoadTimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(elementDetectionTimeOut, TimeUnit.SECONDS);
		driver.get(url);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setPageLoadTimeOut(int pageLoadTimeOut) {
		this.pageLoadTimeOut = pageLoadTimeOut;
	}
	public void setElementDetectionTimeOut(int elementDetectionTimeOut) {
		this.elementDetectionTimeOut = elementDetectionTimeOut;
	}
	public String titleOfPage() {
		return driver.getTitle();
	}
	public void closeBrowsers() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}