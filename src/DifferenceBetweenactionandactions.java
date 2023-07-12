import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferenceBetweenactionandactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		
		Actions act = new Actions(driver);
		
		Action action=act.keyDown(searchBox,Keys.SHIFT)
		.sendKeys("selenium")
		.keyUp(searchBox, Keys.SHIFT)
		.keyDown(searchBox,Keys.CONTROL)
		.sendKeys("a")       //highlighting like ctrl+a keyboard keys
		.build();           //method of actions class to collect all actions in one build
		//perform();       //this perform is of Actions class
		action.perform(); //this perform is only method of Action interface
	}

}
