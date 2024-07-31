import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.StaleElementReferenceException;

public class HandleExceptions {
    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            // Set the path to the ChromeDriver executable
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

            // Initialize ChromeDriver
            driver = new ChromeDriver();

            // Open a website
            driver.get("https://www.example.com");

            // Create WebDriverWait instance
            WebDriverWait wait = new WebDriverWait(driver, 10); // 10 seconds timeout

            // Example of handling TimeoutException
            try {
                WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("someElementId")));
                element.click();
            } catch (TimeoutException e) {
                System.err.println("TimeoutException: Element was not found within the timeout period.");
                e.printStackTrace();
            }

            // Example of handling NoSuchElementException
            try {
                WebElement element = driver.findElement(By.id("nonExistentElementId"));
                element.click();
            } catch (NoSuchElementException e) {
                System.err.println("NoSuchElementException: Element not found in the DOM.");
                e.printStackTrace();
            }

            // Example of handling ElementNotSelectableException
            try {
                WebElement element = driver.findElement(By.id("someSelectableElementId"));
                element.click(); // Assuming it's supposed to be selectable
            } catch (ElementNotSelectableException e) {
                System.err.println("ElementNotSelectableException: Element cannot be selected.");
                e.printStackTrace();
            }

            // Example of handling InvalidSelectorException
            try {
                WebElement element = driver.findElement(By.xpath("invalidXPath"));
                element.click();
            } catch (InvalidSelectorException e) {
                System.err.println("InvalidSelectorException: The provided selector is invalid.");
                e.printStackTrace();
            }

            // Example of handling ElementNotVisibleException
            try {
                WebElement element = driver.findElement(By.id("hiddenElementId"));
                element.click(); // Assuming the element is supposed to be visible
            } catch (ElementNotVisibleException e) {
                System.err.println("ElementNotVisibleException: The element is not visible.");
                e.printStackTrace();
            }

            // Example of handling StaleElementReferenceException
            try {
                WebElement element = driver.findElement(By.id("someElementId"));
                driver.navigate().refresh(); // Refresh the page to make the element stale
                element.click(); // This will throw StaleElementReferenceException
            } catch (StaleElementReferenceException e) {
                System.err.println("StaleElementReferenceException: The element reference is stale.");
                e.printStackTrace();
            }

        } catch (Exception e) {
            // Handle any other unexpected exceptions
            System.err.println("An unexpected exception occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Clean up and close the browser
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
