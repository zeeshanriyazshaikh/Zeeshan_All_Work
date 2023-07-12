package KhansaCommonLibs.Implementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonDriver {
WebDriver driver;
int	pageLoadTimeout;
int  elementDetectTimeout;
	
	public CommonDriver(String browser) throws Exception {
		pageLoadTimeout = 20;
		elementDetectTimeout = 20;
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			}
		else if(browser.equalsIgnoreCase("FF")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			throw new Exception("invalid" + browser);
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	public void navigateToUrl(String url) {
		driver.manage().timeouts().pageLoadTimeout(pageLoadTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(elementDetectTimeout, TimeUnit.SECONDS);
		driver.get(url);
	}
	public String getTitleOfThePage() {
		return driver.getTitle();
	}
	public void closeBrowsers() {
		driver.quit();
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setPageLoadTimeout(int pageLoadTimeout) {
		this.pageLoadTimeout = pageLoadTimeout;
	}
	public void setElementDetectTimeout(int elementDetectTimeout) {
		this.elementDetectTimeout = elementDetectTimeout;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
