import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Faiz Riyaz\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/b/Books-Magazines/267/bn_1854946");
		//1.Get the total count of links
		
		//2.All the links are represented by <a> HTML tag i.e:anchor tag
		List <WebElement> links =driver.findElements(By.tagName("a"));   //however we can get buttons,inputs etc count as well,WebElement in list bracket <> is return type.
		//3.size of links
		int linkSize = links.size();
		System.out.println(linkSize);
		
		//4.Get the text of each links on the page
		
		
		for(int i=0; i<linkSize;i++)   //
		{
		String linkText  = links.get(i).getText();
                System.out.println(linktext);
		}
	}

}
/* CLICK PARTICULAR LINK ONLY

1.Enhanced for loop or for each loop

for(WebElement link : links ){
if(link.getText().equals("Zeeshan")){
link.click();
break;
}

2.Regular or traditional for loop

for(int i=0;i<linkSize;i++){
String linkText = links.get(i).getText();
if(linkText.equals("Zeeshan")){

links.get(i).click();
break;
}




*/
