package com.testautomation.selenium.steps;

import com.testautomation.selenium.hooks.Hooks;
import com.testautomation.selenium.pages.MultipleCheckbox;
import org.junit.jupiter.api.Assertions;

public class MultipleCheckboxStep {

    MultipleCheckbox multipleCheckbox = new MultipleCheckbox(Hooks.getDriver());

    public void openPage(String url) {
        multipleCheckbox.getPage(url);
    }

    public void correctWebpageIsLoaded(String pageTitle) {
        Assertions.assertEquals(pageTitle, multipleCheckbox.getPageTitle());
    }

    public void clickAllCheckboxes() {
        multipleCheckbox.clickAllCheckboxes();
    }

    public void areAllCheckboxesSelected() {
        Assertions.assertTrue(multipleCheckbox.checkboxSelection(), "Not all checkboxes are selected!");
    }

    public void isAllCheckboxesSelectedButtonTextCorrect(String buttonText) {
        Assertions.assertEquals(buttonText, multipleCheckbox.getButtonValue());
    }

    public void unselectFirstCheckbox() {
        multipleCheckbox.uncheckFirstCheckbox();
    }

    public void notAllCheckboxesAreSelectedButtonTextCorrect(String buttonText) {
        Assertions.assertEquals(buttonText, multipleCheckbox.getButtonValue());
    }
}
