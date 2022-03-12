package com.testautomation.selenium.pages;

import com.testautomation.selenium.utils.PageObject;
import com.testautomation.selenium.utils.Waiters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputField extends PageObject {

    WebDriver driver;

    public InputField(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void getPage(String url) {
        driver.get(url);
    }

    //Page elements

    @FindBy(css = ".at-cv-button.at-cv-lightbox-yesno.at-cm-no-button")
    WebElement notThanksButton;

    @FindBy(css = "#user-message")
    WebElement userMessage;

    @FindBy(css = ".btn.btn-default")
    WebElement showMessageButton;

    @FindBy(css = "#display")
    WebElement typedMessage;

    @FindBy(css = "#sum1")
    WebElement fieldOne;

    @FindBy(css = "#sum2")
    WebElement fieldTwo;

    @FindBy(css = "#gettotal .btn.btn-default")
    WebElement getTotal;

    @FindBy(css = "#displayvalue")
    WebElement resultValue;

    //Page methods
    public String getPageTitle() {
        return driver.getTitle();
    }

    public boolean popupIsOpened(String msg) {
        Waiters waiters = new Waiters(driver,10);
        return  waiters.waitingForTextToBePresent(By.cssSelector(".at-cv-button.at-cv-lightbox-yesno.at-cm-no-button"), msg);
    }

    public void closePopup() {
        notThanksButton.click();
    }

    public void sendText(String msg) {
        userMessage.sendKeys(msg);
    }

    public void clickFirstButton() {
        showMessageButton.click();
    }

    public String getFirstDisplayedMessage() {
        return typedMessage.getText();
    }

    public void sendValueOne(int num) {
        fieldOne.sendKeys(String.valueOf(num));
    }

    public void sendValueTwo(String msg) {
        fieldTwo.sendKeys(msg);
    }

    public void clickSecondButton() {
        getTotal.click();
    }

    public String getSecondDisplayedMessage() {
        return resultValue.getText();
    }
}
