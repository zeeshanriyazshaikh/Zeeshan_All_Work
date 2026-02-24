Wait<WebDriver> wait = new FluentWait<>(driver)
  .withTimeout(Duration.ofSeconds(30))
  .pollingEvery(Duration.ofSecond(2))                   //"or"  .pollingEvery(Duration.ofMillis(500))
  .ignoring(NoSuchElementException.class);              //"or"  .ignoring(StaleElementReferenceException.class)
WebElement element = wait.until(ExpectedConditons.elementToBeClickable(By.id("id")));
element.click();
