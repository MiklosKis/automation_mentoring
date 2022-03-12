package com.testautomation.cucumber.pages;

import com.testautomation.cucumber.utils.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GroupRadioButtons extends PageObject {

    WebDriver driver;
    int numberOfGenderButton;
    int numberOfAgeGroupButton;

    public GroupRadioButtons(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    //Page elements

    @FindBy(css = "input[name=gender]")
    List<WebElement> genderRadioButtons;

    @FindBy(css = "input[name=ageGroup]")
    List<WebElement> ageRadioButtons;

    @FindBy(css = ".btn.btn-default")
    List<WebElement> buttonsByClass;

    @FindBy(css = ".groupradiobutton")
    WebElement displayedValues;

    //Page methods

    public int clickOnGenderRadioButton(String sex) {
        switch (sex) {
            case "Male":
                genderRadioButtons.get(0).click();
                numberOfGenderButton = 0;
                break;
            case "Female":
                genderRadioButtons.get(1).click();
                numberOfGenderButton = 1;
                break;
            default:
                System.out.println("No sex radio button is available!");
                break;
        }
        return numberOfGenderButton;
    }

    public boolean isGenderRadioButtonSelected() {
        return genderRadioButtons.get(numberOfGenderButton).isSelected();
    }

    public int clickOnAgeGroupRadioButton(String ageGroup) {
        switch (ageGroup) {
            case "0 - 5":
                ageRadioButtons.get(0).click();
                numberOfAgeGroupButton = 0;
                break;
            case "5 - 15":
                ageRadioButtons.get(1).click();
                numberOfAgeGroupButton = 1;
                break;
            case "15 - 50":
                ageRadioButtons.get(2).click();
                numberOfAgeGroupButton = 2;
                break;
            default:
                System.out.println("No ageGroup radio button is available!");
                break;
        }
        return numberOfAgeGroupButton;
    }

    public boolean isAgeGroupRadioButtonSelected() {
        return ageRadioButtons.get(numberOfAgeGroupButton).isSelected();
    }

    public void clickOnGetValuesButton() {
        buttonsByClass.get(1).click();
    }

    public String getRadioButtonMsg() {
        return displayedValues.getText();
    }

}
