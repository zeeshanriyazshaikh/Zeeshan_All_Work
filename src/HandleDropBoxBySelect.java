import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBoxBySelect {

	public static void main(String[] args) {
		
                System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Faiz Riyaz\\\\Desktop\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
		driver.findElement(By.id("businessaccount-radio")).click();
		driver.findElement(By.id("businessName")).sendKeys("zeeshan");
		driver.findElement(By.id("businessEmail")).sendKeys("zee.shaikcool786@gmail.com");
		
	        //Handle Drop Down
		WebElement selectElement = driver.findElement(By.id("businessCountry"));
		Select select = new Select(selectElement);   //select is class used for drop down ,and in object we are passing find element by id.
		select.selectByVisibleText("Austria");
		
		
		
		//LIST OF ALL OPTIONS IN DROP DOWN 
		
		List<WebElement> lists = select.getOptions(); //get all options in list
		int listSize = lists.size();
		System.out.println(listSize);
		
                //for loop
                for(int i=0;i<listSize;i++){
                String elementText = lists.get(i).getText();
                if(elementText.equals("Zeeshan")){

                select.selectByVisibleText("Zeeshan");
                break;
}

}
		
	}

}

/*
//for each
for(WebElement element : elements ){
if(element.getText().equals("Zeeshan")){
select.selectByVisibleText("Zeeshan");
break;
}
}
/*

/*
SELECT CLASS METHODS for interacting with dropdowns:
#SELECT OPTIONS
1>selectByIndex(int index):         Selects the option at the given index in a dropdown.

2>selectByValue(String value):      Selects the option with the given value attribute in a dropdown.

3>selectByVisibleText(String text): Selects the option with the given visible text in a dropdown.

4>getFirstSelectedOption():         Returns the first selected option in a dropdown.

5>getAllSelectedOptions():          Returns a list of all selected options in a multi-select dropdown.

6>getOptions():                     Returns a list of all options in a dropdown.

#DE-SELECT OPTIONS
deselectAll(): Deselects all options in a multi-select dropdown.
deselectByIndex(int index): Deselects the option at the given index in a multi-select dropdown.
deselectByValue(String value): Deselects the option with the given value attribute in a multi-select dropdown.
deselectByVisibleText(String text): Deselects the option with the given visible text in a multi-select dropdown.

	*/
