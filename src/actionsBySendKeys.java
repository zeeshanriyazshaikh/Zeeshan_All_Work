import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTabExample {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Open a new tab using keyboard shortcut (Ctrl + T)
        driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL + "t");

        // Close the browser
        // driver.quit();
    }
}
/*
        #OPEN LINK IN NEW TAB

        WebElement link = driver.findElement(By.linkText("Link Text"));

        // Open the link in a new tab using keyboard shortcut (CTRL + click)
        link.sendKeys(Keys.CONTROL, Keys.RETURN);
*/
