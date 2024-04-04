# TO FIND HIDDEN ELEMENT

// Execute JavaScript to make the hidden element visible

       ((JavascriptExecutor) driver).executeScript("document.getElementById('hiddenElement').style.display='block';");

# SECOND METHOD

WebElement Element = driver.findElement(By.id("ElementId"));
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].style.display = 'block';"  , Element);

// "block" --> It means block level element [To make element visible]
// "none"  --> If it is none that means element is hidden
