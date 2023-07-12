package capgseleniumScripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {//pascal coding in java first letter capital

	ChromeDriver driver; //ctrl+space for to get import options and shift+ctrl+O for if import statement is not auto populated
	                     //chrome driver class has code to interact with chrome browser.
	                    //we have to give this chrome driver chrome driver executable i.e: chromedriver.exe file path to execute
	String url = "http://demo.guru99.com/v4";
	public void invokeBrowser() {//Camel case coding in java first letter not capital
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Faiz Riyaz\\Desktop\\chromedriver.exe");//webdriver.chrome.driver is key or variable that helps chromedriver class to interact with chromedriver executable file
		driver = new ChromeDriver();//here chromedriver is constructor to set chrome driver default value and new is to instantiate object
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	
	public void getTitle() {
		String titleOfThePage=driver.getTitle();
		System.out.println("Title of the page "+ titleOfThePage);//write syso and ctrl+space bar to import full statement.
		
	}
	public void closeBrowser() {
		//driver.close();
		driver.quit();
	}
	
	public static void main(String[] args) {
		WorkingWithChrome wc = new WorkingWithChrome();
		wc.invokeBrowser();
		wc.getTitle();
		wc.closeBrowser();
	}
	
	
	
}
