package com.testautomation.selenium.pages;

import com.testautomation.selenium.utils.PageObject;
import com.testautomation.selenium.utils.Waiters;
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

    public void getPage(String url) {
        driver.get(url);
    }

    //Page Elements

    @FindBy (css = "#downloadButton")
    WebElement dropdownMenu;

    @FindBy (css = ".progress-label")
    WebElement successfulDownloadText;

    //Page methods

    public String getPageTitle() {
        return driver.getTitle();
    }

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