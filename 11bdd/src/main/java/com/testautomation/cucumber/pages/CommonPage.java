package com.testautomation.cucumber.pages;

import com.testautomation.cucumber.hooks.Hooks;
import com.testautomation.cucumber.utils.PageObject;
import com.testautomation.cucumber.utils.Waiters;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class CommonPage extends PageObject {

    public CommonPage(WebDriver driver) {
        super(driver);
    }

    public void openPage(String url) {
        Hooks.getDriver().get(url);
    }

    //To close the popup if it is displayed

    @FindBy(css = ".at-cv-button.at-cv-lightbox-yesno.at-cm-no-button")
    WebElement notThanksButton;

    public boolean popupIsOpened(String msg) {
        WebDriver driver = Hooks.getDriver();
        Waiters waiters = new Waiters(driver,5);
        return  waiters.waitingForTextToBePresent(By.cssSelector(".at-cv-button.at-cv-lightbox-yesno.at-cm-no-button"), msg);
    }

    public void closePopup() {
        notThanksButton.click();
    }
}
