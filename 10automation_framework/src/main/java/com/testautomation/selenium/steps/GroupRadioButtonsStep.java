package com.testautomation.selenium.steps;

import com.testautomation.selenium.hooks.Hooks;
import com.testautomation.selenium.pages.GroupRadioButtons;
import org.junit.jupiter.api.Assertions;

public class GroupRadioButtonsStep {

    GroupRadioButtons groupRadioButtons = new GroupRadioButtons(Hooks.getDriver());

    public void openPage(String url) {
        groupRadioButtons.getPage(url);
    }

    public void correctWebpageIsLoaded(String pageTitle) {
        Assertions.assertEquals(pageTitle, groupRadioButtons.getPageTitle());
    }

    public void clickOnMaleRadioButton() {
        groupRadioButtons.clickOnMaleRadioButton();
    }

    public void checkTheMaleRadioButtonIsSelected() {
        Assertions.assertTrue(groupRadioButtons.isMaleRadioButtonSelected(),
                "Male radio button is not selected!");
    }

    public void clickOnFifteenPlusRadioButton() {
        groupRadioButtons.clickOnFifteenPlusRadioButton();
    }

    public void checkTheFifteenPlusRadioButtonIsSelected() {
        Assertions.assertTrue(groupRadioButtons.isFifteenPlusRadioButtonSelected(),
                "15 - 50 radio button is not selected!");
    }

    public void clickOnGetCheckedValueButton(){
        groupRadioButtons.clickOnGetValuesButton();
    }

    public void validateTheRadioButtonMsg(String msg) {
        Assertions.assertEquals(msg, groupRadioButtons.getRadioButtonMsg());
    }

}
