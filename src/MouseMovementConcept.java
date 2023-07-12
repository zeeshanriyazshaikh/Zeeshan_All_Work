import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Faiz Riyaz\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); //maximize chrome window size
		driver.manage().deleteAllCookies();
		driver.get("https://msbte.org.in/"); 
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("About Us"))).build().perform(); //build().perform() should present in last when ever using action class
		Thread.sleep(4000);
		driver.findElement(By.linkText("Core Values")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
