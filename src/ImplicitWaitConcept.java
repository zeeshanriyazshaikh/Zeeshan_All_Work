
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Thread.sleep is static wait time and Implicit Wait is dynamic
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Faiz Riyaz\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //if not loaded web early we ask to wait max 40 sec for system to give error
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  //letting all elements to load all properly
		
		//Above implicit wait and pageload timeout is deprecated available for selenium 3 only but for selenium 4 we have as below,but working fine in Test n g.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		   driver.findElement(By.xpath("//label[text()='Custom']")).click(); //custom xpath
	}
}
//Theory:

//Synchronization

/* the process of matching execution speed of Selenium with the execution Speed of Application is called synchronization */

/*1:Implicitly wait:
Implicit wait will wait for all that fields which we are automating for a particular period of time.*/
/*1.a: Above implicit wait and pageload timeout is deprecated available for selenium 3 only but for selenium 4 we have as below:driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); */
/*1.b: implicit wait once written applied for entire script.
/*2:Explicit wait:
it will wait for any one field for a particular period of time */

/*2.b: we also have FLUENT WAIT basically similar to explicit but have frequency or polling check if total check is of 30 sec it will poll check every 5 sec till 30 sec*/
/* 3: Drawbacks of Thread.sleep

it reduces the performance of automation as it waits for the complete specified amount of time even after the field is loaded.
Need to be applied on every line of code and hence that will make the code lengthy. */

/* 4: API:  Collection of Jars
Jars:       Collection of classes 
class:      Collection of codes or methods or objects
*/