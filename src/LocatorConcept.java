import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Disadvantage of absolute x path is is any change in between all x path lost
		                  //BEST PRIORITY LOCATOR ID ,NAME AND XPATH IF NOT HIERARCHY BASED//
		                  //BEST FOR LINK IS LINK TEXT//
		                  //CSS SELECTOR ALSO GOOD AS ID USED//
		                  //here's a list of locators in Selenium:
/*
                                     1.ID
                                     2.Name
                                     3.Class Name
                                     4.Tag Name
                                     5.Link Text
                                     6.Partial Link Text
                                     7.CSS Selector
                                     8.XPath
*/

		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Faiz Riyaz\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
		driver.manage().window().maximize();
		//1. 1st locator is by XPATH (there are all 8 locators used depending upon priority)
		
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("tom");     //* in x path means all HTML tag selected
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("peter");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("zee.shaikhcool786@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Dongaz@1994");               
		
		//2. by ID //some times id not present then we have to use XPATH
	/*	driver.findElement(By.id("firstname")).sendKeys("tom");
		driver.findElement(By.id("lastname")).sendKeys("peter");
		driver.findElement(By.id("Email")).sendKeys("zee.shaikhcool786@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Dongaz@1994");                               */
		
		//3. by Name ,if while we type By.name or By.id we gets suggestios so only 8 locators are there
		 
	/*	driver.findElement(By.name("firstname")).sendKeys("tom");      */
		
		//4.link text ,only for links,x path not recommended mostly
		
	/*	driver.findElement(By.linkText("User Agreement")).click();    */
		
		//5.partial link text,we don't normally use it,not use full
		
/*		driver.findElement(By.linkText("Rules and")).click();          */                 //if there is big sentence no need write partially
		
		//6.by CSS selector ,inspect-mouse over-right click-copy css selector
		
/*		driver.findElement(By.cssSelector("#firstname")).sendKeys("tom");    */   //or we can write #and id name//https://www.w3schools.com/cssref/css_selectors.asp
		
		//7.class name ,not useful as many things come under class
		

		
	}

}
