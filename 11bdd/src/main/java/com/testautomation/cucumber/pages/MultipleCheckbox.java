package com.testautomation.cucumber.pages;

import com.testautomation.cucumber.utils.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MultipleCheckbox extends PageObject{

    WebDriver driver;

    public MultipleCheckbox(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    //Page Elements

    @FindBy(css = ".panel-body .cb1-element")
    List<WebElement> checkBoxes;

    @FindBy(css = ".btn.btn-primary")
    WebElement checkAllButton;

    //Page methods

    public void clickAllCheckboxes() {
        for (WebElement checkbox : checkBoxes) {
            checkbox.click();
        }
    }

    public boolean checkboxSelection() {
        Boolean isSelected = true;
        for (WebElement checkbox : checkBoxes) {
            if (checkbox.isSelected()) {
                isSelected = true;
            } else {
                isSelected = false;
                break;
            }
        }
        return isSelected;
    }

    public String getButtonValue() {
        return checkAllButton.getAttribute("value");
    }

    public void uncheckFirstCheckbox() {
        checkBoxes.get(0).click();
    }
}
