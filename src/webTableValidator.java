import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
 
public class WebTableValidator {
 
    private WebDriver driver;
 
    public WebTableValidator(WebDriver driver) {
        this.driver = driver;
    }
 
    public boolean isRecordExists(String expectedData) {
        // Locate the table element
        WebElement table = driver.findElement(By.xpath("//table[@id='your_table_id']"));
 
        // Find all rows in the table
        List<WebElement> rows = table.findElements(By.tagName("tr"));
 
        // Iterate through each row
        for (WebElement row : rows) {
            // Find all columns (cells) in the row
            List<WebElement> cells = row.findElements(By.tagName("td"));
 
            // Iterate through each cell in the row
            for (WebElement cell : cells) {
                // Check if the cell text contains the expected data
                if (cell.getText().equals(expectedData)) {
                    return true; // Record found
                }
            }
        }
 
        return false; // Record not found
    }
 
    // Example usage:
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("your_web_page_url");
 
        WebTableValidator validator = new WebTableValidator(driver);
        boolean isRecordFound = validator.isRecordExists("Your Expected Data");
 
        if (isRecordFound) {
            System.out.println("Record exists!");
        } else {
            System.out.println("Record does not exist!");
        }
 
        driver.quit();
    }
}
