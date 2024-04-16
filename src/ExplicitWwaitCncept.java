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
		
		/* EXPLICIT WAIT CODE AS PER SELENIUM 4
		
1. WebDriverWait: It's is a class.
                  It's like a special timer that waits for a certain condition to be true before continuing.
                  It's like waiting for a green light before crossing the road.
2. wait.until:    This is the command to start waiting. It waits until a specific condition is met.
3. ExpectedConditions: This is a collection of conditions that the WebDriverWait can wait for.
                       It's like a menu of options for what to wait for.
4.Here are the names of some commonly used conditions available in the ExpectedConditions class:

alertIsPresent()
elementToBeClickable()
elementToBeSelected()
elementSelectionStateToBe()
frameToBeAvailableAndSwitchToIt()
invisibilityOf()
presenceOfAllElementsLocatedBy()
presenceOfElementLocated()
textToBePresentInElement()
titleContains()
titleIs()
visibilityOf()
*/
		
}
}
