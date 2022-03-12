package com.testautomation.selenium.steps;

import com.testautomation.selenium.hooks.Hooks;
import com.testautomation.selenium.pages.InputField;
import org.junit.jupiter.api.Assertions;

public class TwoInputFieldsStep {
    InputField twoInputFields = new InputField(Hooks.getDriver());

    public void openPage(String url) {
        twoInputFields.getPage(url);
    }

    public void correctWebpageIsLoaded(String pageTitle) {
        Assertions.assertEquals(pageTitle, twoInputFields.getPageTitle());
    }

    public void canClosePopup(String msg) {
        Assertions.assertTrue(twoInputFields.popupIsOpened(msg), "Popup is not displayed!");
    }

    public void closingPopupWindow() {
        twoInputFields.closePopup();
    }

    public void addFirstNumericValue(int num) {
        twoInputFields.sendValueOne(num);
    }

    public void addSecondStringValue(String msg) {
        twoInputFields.sendValueTwo(msg);
    }

    public void clickGetTotalButton() {
        twoInputFields.clickSecondButton();
    }

    public void validateDisplayedMessage(String msg) {
        Assertions.assertEquals(msg, twoInputFields.getSecondDisplayedMessage());
    }
}
