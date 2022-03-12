package com.testautomation.selenium.steps;

import com.testautomation.selenium.hooks.Hooks;
import com.testautomation.selenium.pages.SelectList;
import org.junit.jupiter.api.Assertions;

public class SelectListStep {

    SelectList selectList = new SelectList(Hooks.getDriver());

    public void openPage(String url) {
        selectList.getPage(url);
    }

    public void correctWebpageIsLoaded(String pageTitle) {
        Assertions.assertEquals(pageTitle, selectList.getPageTitle());
    }

    public void selectDayFromDropdownMenu(String day) {
        selectList.selectDay(day);
    }

    public void validateTheSelectedDay(String day) {
        Assertions.assertEquals(day, selectList.getSelectedDay());
    }

    public void validateSelectedDayMsg(String msg) {
        Assertions.assertEquals(msg, selectList.selectedDayMsg());
    }
}
