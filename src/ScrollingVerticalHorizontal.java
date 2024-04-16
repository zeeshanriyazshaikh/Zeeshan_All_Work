import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingVerticalHorizontal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Faiz Riyaz\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		JavascriptExecutor Js = (JavascriptExecutor)driver; //type casting concept
		Js.executeScript("window.scrollBy(0,800)");   //800 here is pixels scrolled y axis (vertical downward direction),0 is of x axis,blank "" is like if need to element can pass here
/*		
#TO-SCROLL TO THE LAST HEIGHT [ BOTTOM OF THE PAGE ]
Js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
#TO-SCROLL TO THE LAST RIGHT [ RIGHTEST SIDE OF THE PAGE ]
Js.executeScript("window.scrollTo(document.body.scrollWidth, 0)"); 
*/
	}

}
