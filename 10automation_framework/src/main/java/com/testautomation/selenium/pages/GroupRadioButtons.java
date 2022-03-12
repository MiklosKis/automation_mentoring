package com.testautomation.selenium.pages;

import com.testautomation.selenium.utils.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GroupRadioButtons extends PageObject {

    WebDriver driver;

    public GroupRadioButtons(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void getPage(String url) {
        driver.get(url);
    }

    //Page elements

    @FindBy(css = "input[value=Male][name=gender]")
    WebElement maleRadioButton;

    @FindBy(css = "input[value='15 - 50'][name=ageGroup]")
    WebElement fifteenPlusRadioButton;

    @FindBy(css = ".btn.btn-default")
    List<WebElement> buttonsByClass;

    @FindBy(css = ".groupradiobutton")
    WebElement displayedValues;

    //Page methods
    public String getPageTitle() {
        return driver.getTitle();
    }

    public void clickOnMaleRadioButton() {
        maleRadioButton.click();
    }

    public boolean isMaleRadioButtonSelected() {
        return maleRadioButton.isSelected();
    }

    public void clickOnFifteenPlusRadioButton() {
        fifteenPlusRadioButton.click();
    }

    public boolean isFifteenPlusRadioButtonSelected() {
        return fifteenPlusRadioButton.isSelected();
    }

    public void clickOnGetValuesButton() {
        buttonsByClass.get(1).click();
    }

    public String getRadioButtonMsg() {
        return displayedValues.getText();
    }

}
