package com.testautomation.selenium.pages;

import com.testautomation.selenium.utils.PageObject;
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

    public void getPage(String url) {
        driver.get(url);
    }

    //Page Elements

    @FindBy(css = "#select-demo")
    WebElement dropdownMenu;

    @FindBy(css = ".selected-value")
    WebElement selectedDayDropdown;

    //Page methods

    public String getPageTitle() {
        return driver.getTitle();
    }

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
