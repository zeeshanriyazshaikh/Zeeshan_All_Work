import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AlertPopupHandle {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rediff.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> elements = driver.findElements(By.xpath("//input[@class='newsrchbtn']"));
        Thread.sleep(2000);                     //after click on search it will wait for 3sec and then handle or accept pop up
        if (elements.size() >= 2) {
            // Select the second element (index 1, since indexing is zero-based)
            WebElement secondElement = elements.get(1);

            // Perform actions on the second element
            // For example, you can click it
            secondElement.click();
        } else {
            System.out.println("Less than two elements found with the given XPath.");
        }

        Alert alert = driver.switchTo().alert(); // Alert is class in Selenium for pop ups,alert is variable to store,switchTo().alert() are methods in Alert class
        String text = alert.getText();

        System.out.println(text);    //Validation of Alert pop up.

        if (text.equals("Please enter search keywords")) {
            System.out.println("correct");
            alert.accept();
        } else {
            System.out.println("in correct");
        }
        driver.quit();


    }

}
