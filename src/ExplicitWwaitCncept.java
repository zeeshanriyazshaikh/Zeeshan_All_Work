import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.ExpectedConditions;
public class ExplicitWwaitCncept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();//cookies means small piece of info that stored in text file on users hard drive by web server
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); //if not loaded web early we ask to wait max 40 second for system to give error
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //letting all elements to load all properly
		

		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("john");
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='gLFyf gsfi']")));
    	
    	
    		driver.quit();
		/*// EXPLICIT WAIT CODE AS PER SELENIUM 4
		
// some times we write code to click something that is not loaded or click able
		
*/
		
}
}
