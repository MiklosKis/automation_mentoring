package com.testautomation.cucumber.pages;

import com.testautomation.cucumber.utils.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SelectList extends PageObject{

    WebDriver driver;

    public SelectList(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    //Page Elements

    @FindBy(css = "#select-demo")
    WebElement dropdownMenu;

    @FindBy(css = ".selected-value")
    WebElement selectedDayDropdown;

    //Page methods

    public void selectDay(String day) {
        Select select = new Select(dropdownMenu);
        select.selectByVisibleText(day);
    }

    public String getSelectedDay() {
        Select select = new Select(dropdownMenu);
        return select.getFirstSelectedOption().getText();
    }

    public String selectedDayMsg() {
        return selectedDayDropdown.getText();
    }
}
