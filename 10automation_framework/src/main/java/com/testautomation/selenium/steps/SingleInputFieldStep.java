package com.testautomation.selenium.steps;

import com.testautomation.selenium.hooks.Hooks;
import com.testautomation.selenium.pages.InputField;
import org.junit.jupiter.api.Assertions;

public class SingleInputFieldStep {

    InputField inputField = new InputField(Hooks.getDriver());

    public void openPage(String url) {
        inputField.getPage(url);
    }

    public void correctWebpageIsLoaded(String pageTitle) {
        Assertions.assertEquals(pageTitle, inputField.getPageTitle());
    }

    public void canClosePopup(String msg) {
        Assertions.assertTrue(inputField.popupIsOpened(msg), "Popup is not displayed!");
    }

    public void closingPopupWindow() {
        inputField.closePopup();
    }

    public void typeTextIntoField(String msg) {
        inputField.sendText(msg);
    }

    public void clickShowMessage() {
        inputField.clickFirstButton();
    }

    public void validateDisplayedMsg(String msg) {
        Assertions.assertEquals(msg, inputField.getFirstDisplayedMessage());
    }
}
