
import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class PracticeSelenium {
	
	public static void main(String[] args) throws InterruptedException {

WebDriverManager.firefoxdriver().setup();
//ChromeOptions opt = new ChromeOptions();
//opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
//WebDriver driver = new ChromeDriver(opt);
WebDriver driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
driver.get("https://www.demo.guru99.com/V4/");
WebElement userName = driver.findElement(By.name("uid"));
userName.sendKeys("mngr444777");
WebElement pwd = driver.findElement(By.name("password"));
pwd.sendKeys("sagusut");
WebElement loginButton= driver.findElement(By.name("btnLogin"));	
loginButton.click();
WebElement newCustomer=	driver.findElement(By.xpath("//a[@href='addcustomerpage.php']"));
newCustomer.click();

	List<WebElement> radio = driver.findElements(By.name("rad1"));
		radio.get(1).click();
		radio.get(0).click();
		
	}
		
}		

