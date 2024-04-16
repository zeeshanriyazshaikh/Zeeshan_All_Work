import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
 
public class WebTableValidator {
 
        //Locate table by id
        WebElement table = driver.findElement(By.xpath("//table[@id='your_table_id']"));
 
        // Find all rows in the table
        List<WebElement> rows = table.findElements(By.tagName("tr"));
 
        // Nested for-each loop to Iterate cells through each row [As in one row there are lot of cells]
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
    }
}
