import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.util.List;

public class Tests {

     private static WebDriver driver;

     @BeforeAll
     public static void getChromeDriver() throws Exception {
          driver = new RemoteWebDriver(new URL("http://localhost:4444/"), new ChromeOptions());
     }

     @Test
     @DisplayName("Single Input Field test")
     public void openSingleInputFieldWebpageAndCheckTest() {
          // Open the webpage and check if the page has the expected title
          driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
          Assertions.assertEquals("Selenium Easy Demo - Simple Form to Automate using Selenium", driver.getTitle());

          //Typing the message and assert if the message is displayed
          WebElement userMessage = driver.findElement(By.cssSelector("#user-message"));
          userMessage.click();
          userMessage.sendKeys("Best test message!");

          WebElement showMessageButton = driver.findElement(By.cssSelector(".btn.btn-default"));
          showMessageButton.click();

          WebElement typedMessage = driver.findElement(By.cssSelector("#display"));
          String displayedTypedMessage = typedMessage.getText();

          Assertions.assertEquals("Best test message!", displayedTypedMessage);
     }

     @Test
     @DisplayName("Two Input Fields - Error Check test")
     public void openTwoInputFieldsAndErrorCheckTest() {
          // Open the webpage and check if the page has the expected title
          driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
          Assertions.assertEquals("Selenium Easy Demo - Simple Form to Automate using Selenium", driver.getTitle());

          //Explicitly wait for the popup to open then close it
          new WebDriverWait(driver, 10).until(
                  ExpectedConditions.visibilityOfElementLocated(
                          By.cssSelector("#at-cv-lightbox")));
          WebElement noButton = driver.findElement(By.cssSelector(".at-cv-button.at-cv-lightbox-yesno.at-cm-no-button"));
          noButton.click();

          //Enter one numeric and one non-numeric value and check if the total is NaN
          WebElement fieldOne = driver.findElement(By.cssSelector("#sum1"));
          fieldOne.click();
          fieldOne.sendKeys(String.valueOf(10));
          WebElement fieldTwo = driver.findElement(By.cssSelector("#sum2"));
          fieldTwo.click();
          fieldTwo.sendKeys("Duck");

          WebElement getTotal = driver.findElement(By.cssSelector("#gettotal .btn.btn-default"));
          getTotal.click();

          WebElement resultValue = driver.findElement(By.cssSelector("#displayvalue"));
          String displayedResultValue = resultValue.getText();

          Assertions.assertEquals("NaN", displayedResultValue);

     }

     @Test
     @DisplayName("Multiple Checkbox Demo test")
     public void multipleCheckboxTest() {
          // Open the webpage and check if the page has the expected title
          driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
          Assertions.assertEquals("Selenium Easy - Checkbox demo for automation using selenium", driver.getTitle());

          //Select all checkboxes then check if all of them is open
          WebElement checkboxOne = driver.findElement(By.cssSelector(".panel-body .cb1-element"));
          WebElement checkboxTwo = driver.findElement(By.cssSelector(".panel-body .cb1-element"));
          WebElement checkboxThree = driver.findElement(By.cssSelector(".panel-body .cb1-element"));
          WebElement checkboxFour = driver.findElement(By.cssSelector(".panel-body .cb1-element"));
          checkboxOne.click();
          checkboxTwo.click();
          checkboxThree.click();
          checkboxFour.click();

          Assertions.assertTrue(checkboxOne.isSelected());
          Assertions.assertTrue(checkboxTwo.isSelected());
          Assertions.assertTrue(checkboxThree.isSelected());
          Assertions.assertTrue(checkboxFour.isSelected());

          WebElement checkAllButton = driver.findElement(By.cssSelector(".btn.btn-primary"));
          String buttonValue = checkAllButton.getAttribute("value");

          Assertions.assertEquals("Uncheck All", buttonValue);

          //Uncheck the first button and check if it is unselected
          checkboxOne.click();
          Assertions.assertFalse(checkboxOne.isSelected());

          String changedButtonValue = checkAllButton.getAttribute("value");

          Assertions.assertEquals("Check All", changedButtonValue);
     }

     @Test
     @DisplayName("Group Radio Buttons Demo test")
     public void groupRadioButtonsTest() {
          // Open the webpage and check if the page has the expected title
          driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
          Assertions.assertEquals("Selenium Easy Demo - Radio buttons demo for Automation", driver.getTitle());

          // Select the "Female" and "15 to 50" radio buttons and check if they are selected
          List<WebElement> genderOptions = driver.findElements(new ByIdOrName("gender"));
          Assertions.assertEquals(2, genderOptions.size());
          genderOptions.get(1).click();

          List<WebElement> ageOptions = driver.findElements(new ByIdOrName("ageGroup"));
          Assertions.assertEquals(3, ageOptions.size());
          ageOptions.get(2).click();

          Assertions.assertTrue(genderOptions.get(1).isSelected());
          Assertions.assertTrue(ageOptions.get(2).isSelected());

          // Click on "Get values" button and check the displayed text
          List<WebElement> buttonsByClass = driver.findElements(By.cssSelector(".btn.btn-default"));
          Assertions.assertEquals(2, buttonsByClass.size());
          buttonsByClass.get(1).click();

          WebElement displayedValues = driver.findElement(By.cssSelector(".groupradiobutton"));
          String sexAndAgeDisplayedValues = displayedValues.getText();

          Assertions.assertEquals("Sex : Female\n" +
                  "Age group: 15 - 50", sexAndAgeDisplayedValues);
     }
     @Test
     @DisplayName("Select List Demo test")
     public void selectListDemoTest() {
          // Open the webpage and check if the page has the expected title
          driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
          Assertions.assertEquals("Selenium Easy Demo - Automate All Scenarios", driver.getTitle());

          // Select "Tuesday" from the list and verify that the day is selected
          WebElement dropdownMenu = driver.findElement(By.cssSelector("#select-demo"));
          final Select select = new Select(dropdownMenu);
          select.selectByVisibleText("Tuesday");

          Assertions.assertEquals("Tuesday", select.getFirstSelectedOption().getAttribute("value"));

          // Verify that the message shows the selected day item
          WebElement selectedValue = driver.findElement(By.cssSelector(".selected-value"));
          String displayedSelectedValue = selectedValue.getText();

          Assertions.assertEquals("Day selected :- Tuesday", displayedSelectedValue);
     }

     @Test
     @DisplayName("JQuery UI Progress bar - Download Dialog test")
     public void jqueryUiProgressBarTest() {
          // Open the webpage and check if the page has the expected title
          driver.get("https://demo.seleniumeasy.com/jquery-download-progress-bar-demo.html");
          Assertions.assertEquals("Selenium Easy - JQuery Download Progress bar demo", driver.getTitle());

          // Click on "Start Download" button and Verify that the download has completed
          WebElement dropdownMenu = driver.findElement(By.cssSelector("#downloadButton"));
          dropdownMenu.click();

          new WebDriverWait(driver, 10).until(ExpectedConditions.textToBe(By.cssSelector(".ui-dialog-buttonset button"), "Close"));

          WebElement successfulDownloadText = driver.findElement(By.cssSelector(".progress-label"));
          String displayedText = successfulDownloadText.getText();
          Assertions.assertEquals("Complete!", displayedText);
     }

     @AfterAll
     public static void tearDown() throws Exception {
          if (driver != null) {
               driver.quit();
          }
     }

}
