package com.testautomation.selenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiters {

    WebDriverWait webDriverWait;

    public Waiters(WebDriver driver, int timeOut) {
        this.webDriverWait = new WebDriverWait(driver,timeOut);
    }
    public Boolean waitingForTextToBePresent(By selector, String waitingForThisMsg) {
        return webDriverWait.until(ExpectedConditions.textToBePresentInElementLocated(selector, waitingForThisMsg));
    }
}

