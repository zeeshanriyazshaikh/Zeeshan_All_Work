import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//----->WEBDRIVER MANAGER is dependency added in pom.xml that update chrome and other drivers periodically,auto download basically,when we run driver executable files of drivers get store in maven local repo .m2,and when ever we run we will get new versions.
		// WebDriverManager.chromedriver().setup();---> when we use this no need of System.setProperty("webdriver.chrome.driver", "C:\\Users\\Faiz Riyaz\\Desktop\\chrome driver\\chromedriver.exe");
		
		
//		//1.FF
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Faiz Riyaz\\Downloads\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();        //launch FF browser,FF Driver is class in selenium that implements Web driver class or interface in selenium
	                                                  //new FirefoxDriver() is object of this particular class referred by driver ,and driver is object reference variable of WebDriver interface.
driver.get("https://www.google.com");             //get method for enter url in FF
	
	//1.A :for safari browser no need of setproperty

	//2.CHROME

/*	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Faiz Riyaz\\Desktop\\chrome driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();              //launch google chrome, we are launching replica not original,ChromeDriver is class in selenium that implements WebDriver interface in selenium to use all elements of WebDriver interface
	driver.get("https://www.google.com");             //enter url, .get is method or element in WebDriver interface to get url in browser used by ChromeDriver class or "new ChromeDriver" object. 
	
	String title = driver.getTitle();               //driver.getTitle(); ---> getTitle(); method present in webdriver interface to get title of url eg:google,and as it return type output is in string value we define String data type and store in title variable
	
	System.out.println(title);
	
	  if(title.equals("Google"))                   //verifying or validating title name ,as software testing is all about expected vs actual value
	  {
	  System.out.println("correct title");     //validation point;test case is in complete without validation point 
	  }
	  else
	  {
		  System.out.println("in correct");
	  }   */
	  	
       System.out.println(driver.getCurrentUrl());  //method in webdriver to know current url i.e: driver.getCurrentUrl()
	
//  System.out.println(driver.getPageSource()); //view page source(html) //not impt
	
	driver.quit();                                  //to close browser what we opened
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
