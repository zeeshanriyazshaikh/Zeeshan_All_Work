import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		                                             //#//Pop Ups\\#\\
		//1. alerts---java script pop up---Alert API(accept,dismiss)
		//File upload pop up---Browse button (type=file, send keys (path)
		//browser window pop up---advertisement pop up (window handler API -get window handles() )
                                           
		                     //HERE WE ARE CLOSING 3 POP UP WINDOWS
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Faiz Riyaz\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.dummysoftware.com/popupdummy_testpage.html");
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//input[@type='button']")).click();
		
		Thread.sleep(2000);
		
		Set<String> handler = driver.getWindowHandles();  //to get windows(child+parent) id's driver.getWindowHandles(); ,handler variable has set of all unique window id's both of child and parent windows.Set is Interface to provide output in set of string as id what we will get is set of strings.
		
		//Set does not store values like (Array list) index basis like 0,1,2.... ,so how to iterate the value from set object,
		
		//if we want to assume how values is stored in Set object (object name is handler) assume a page divide by 2 first window id stored in first half second in second half,this is for example 2 values.
		
		Iterator<String> it = handler.iterator();  //to get the value from set object we use iterator (object name it) ,IF WE WANT TO FETCH VALUES FROM ARRAY OR ARRAY LIST WE USE # FOR LOOP # as fetches based on indexes i starts from 0...,similarly from Set we use iterator to fetch values.
		
		//initially iterator is pointing above the Set object in memory.
		
		String ParentWindowId = it.next();  //it.next() method makes iterator to shift to first value of Set object (parent window id location address in memory)
		System.out.println("Parent Window Id: "+ParentWindowId); //Parent window id is fetched above from Set object hence now we will print.
		
		String childWindowId1 = it.next(); //Now iterator will move to second value of object (child window id location address in memory)
		System.out.println("Child Window Id: "+childWindowId1); // child window id is fetched above from Set object hence now we will print.
		
		driver.switchTo().window(childWindowId1);// hence now we have already fetched child id so we can switch to child using child id.
		System.out.println("Child1 Window pop up: "+driver.getTitle()); 
		driver.close();
		Thread.sleep(2000);
		String childWindowId2 = it.next();
		System.out.println("Child Window Id: "+childWindowId2);
		driver.switchTo().window(childWindowId2);
		System.out.println("Child2 Window pop up: "+driver.getTitle()); 
		driver.close();
		Thread.sleep(2000);
		String childWindowId3 = it.next();
		System.out.println("Child Window Id: "+childWindowId3);
		driver.switchTo().window(childWindowId3);
		System.out.println("Chil3 Window pop up: "+driver.getTitle()); 
		driver.close();
		Thread.sleep(2000);
		
		//System.out.println("Child Window pop up: "+driver.getTitle()); //printing this assures that we are on child pop up window
		
	//	driver.close(); //if we use quit method all window gets closed,so use close method to close current window i.e: child 
		
		driver.switchTo().window(ParentWindowId); //once child closed move control to parent.
		
		Thread.sleep(2000);
		
		System.out.println("Parent Window pop up: "+driver.getTitle()); // assures that we are now on parent window
		
		//NOTE:- no other method is there to get window id. 
		
		
		
		
		
		
		
		
			
	}

}
