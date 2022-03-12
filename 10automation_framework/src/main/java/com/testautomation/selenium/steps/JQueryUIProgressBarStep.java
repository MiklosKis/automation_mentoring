package com.testautomation.selenium.steps;

import com.testautomation.selenium.hooks.Hooks;
import com.testautomation.selenium.pages.JQueryUIProgressBar;
import org.junit.jupiter.api.Assertions;

public class JQueryUIProgressBarStep {

    JQueryUIProgressBar jQueryUIProgressBar = new JQueryUIProgressBar(Hooks.getDriver());

    public void openPage(String url) {
        jQueryUIProgressBar.getPage(url);
    }

    public void correctWebpageIsLoaded(String pageTitle) {
        Assertions.assertEquals(pageTitle, jQueryUIProgressBar.getPageTitle());
    }

    public void clickOnDownloadButton() {
        jQueryUIProgressBar.clickDownload();
    }

    public void isSuccessfulDownloadMsgDisplayed(String msg) {
        Assertions.assertTrue(jQueryUIProgressBar.downloadIsFinished(msg), "Download is not finished!");
    }

    public void isDownloadSuccessfullyFinished(String msg) {
        Assertions.assertEquals(msg, jQueryUIProgressBar.getsuccessfulDownloadText());
    }
}
