import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExConcept {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//THEORY JAVA SCRIPT EXECUTOR
// It Boost Selenium script,can be used when dom is complex,id also dynamic in nature,can highligth element,scroll bar scrolling up-down.
//Click actions
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.freecrm.com");
	




	
JavascriptExecutor jsExecutor = (JavascriptExecutor) driver; 

WebElement login=driver.findElement(By.linkText("Login"));
jsExecutor.executeScript("arguments[0].click()", login);

WebElement email=driver.findElement(By.name("email"));
jsExecutor.executeScript("arguments[0].value='zee.shaikhcool786@gmail.com'", email);

WebElement password =driver.findElement(By.name("password"));
jsExecutor.executeScript("arguments[0].value='Khansabaig@1994'", password);

WebElement loginbtn=driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[3]")); 
// Execute JavaScript to make the HIDDEN ELEMENT VISIBLE
       ((JavascriptExecutor) driver).executeScript("document.getElementById('hiddenElement').style.display='block';");
	//BORDER WEB ELEMENT USING JAVASCRIPTEXECUTOR
	 
	jsExecutor.executeScript("arguments[0].style.border='2px solid red'", loginbtn);
	
	//HIGH LIGHT WEB ELEMENT USING JAVASCRIPTEXECUTOR  
	  jsExecutor.executeScript("arguments[0].style.background='yellow'", loginbtn);  

	//BORDER AND HIGH LIGHT WEB ELEMENT USING JAVASCRIPTEXECUTOR  
	/*  
	jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", loginbtn); 
	*/
	  
	//MAKE ALERT AND ACCEPT USING JAVASCRIPTEXECUTOR 
	jsExecutor.executeScript("alert('Welcome to ZEESHAN AUTOMATION');");
	
	Thread.sleep(2000);
	
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	
	//CLICK USING JAVASCRIPT EXECUTOR
	
	jsExecutor.executeScript("arguments[0].click();", loginbtn);
	Thread.sleep(4000);
	
	//RELOAD OR REFRESH USING JAVASCRIPT EXECUTOR
	
	jsExecutor.executeScript("history.go(0)");
	

	//GET TITLE USING JAVASCRIPT EXECUTOR
	String text = jsExecutor.executeScript("return document.title;").toString();
	System.out.println(text);
	}	
}
/*
#SOME MORE JAVA-SCRIPT-EXECUTOR COMMANDS
document.getElementById('elementId')  :Retrieves the element with the specified ID from the DOM.
document.querySelector('selector')    :Retrieves the first element that matches the specified CSS selector from the DOM.
document.querySelectorAll('selector') :Retrieves all elements that match the specified CSS selector from the DOM.
element.click()                       :Simulates a click on the specified element.
element.value = 'text'                :Sets the value of the specified input element.
element.removeAttribute('attribute')  :Removes the specified attribute from the element.
window.scrollTo(x, y)                 :Scrolls the window to the specified coordinates (x, y).
window.scrollBy(x, y)                 :Scrolls the window by the specified number of pixels (x, y).
console.log('message')                :Logs a message to the browser console.
alert('message')                      :Displays an alert dialog box with the specified message.
confirm('message')                    :Displays a confirmation dialog box with the specified message.

/*
#BENEFITS OF JAVA-SCRIPT-EXECUTOR
1.Interacting with Hidden Elements
2.Setting Attribute Values
3.Performance
4.Cross-Browser Compatibility
5.Flexibility
6.Debugging and Troubleshooting
JavaScriptExecutor is a powerful tool that complements WebDriver's capabilities and provides additional flexibility and control over testing automation tasks.
It should be used judiciously to enhance test automation scripts effectively.
*/











