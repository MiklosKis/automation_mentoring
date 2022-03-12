package com.testautomation.cucumber.pages;

import com.testautomation.cucumber.utils.PageObject;
import com.testautomation.cucumber.utils.Waiters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JQueryUIProgressBar extends PageObject {

    WebDriver driver;

    public JQueryUIProgressBar(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    //Page Elements

    @FindBy (css = "#downloadButton")
    WebElement dropdownMenu;

    @FindBy (css = ".progress-label")
    WebElement successfulDownloadText;

    //Page methods

    public void clickDownload() {
        dropdownMenu.click();
    }

    public String getsuccessfulDownloadText() {
        return successfulDownloadText.getText();
    }

    public boolean downloadIsFinished(String msg) {
        Waiters waiters = new Waiters(driver,10);
        return  waiters.waitingForTextToBePresent(By.cssSelector(".ui-dialog-buttonset button"), msg);
    }

}