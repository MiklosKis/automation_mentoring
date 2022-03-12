package stepdefinition;

import com.testautomation.cucumber.hooks.Hooks;
import com.testautomation.cucumber.pages.SelectList;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class SelectListSteps {
    private SelectList selectList = new SelectList(Hooks.getDriver());

    @When("^Select (.+) from the dropdown$")
    public void selectDayFromDropdownMenu(String day) {
        selectList.selectDay(day);
    }

    @And("^Verify that the (.+) is selected$")
    public void validateTheSelectedDay(String day) {
        Assertions.assertEquals(day, selectList.getSelectedDay());
    }

    @Then("^Verify that the message shows the (.+) item$")
    public void validateSelectedDayMsg(String day) {
        Assertions.assertEquals("Day selected :- " + day, selectList.selectedDayMsg());
    }
}
