package stepdefinition;

import com.testautomation.cucumber.hooks.Hooks;
import com.testautomation.cucumber.pages.MultipleCheckbox;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class MultipleCheckboxSteps {
    private MultipleCheckbox multipleCheckbox = new MultipleCheckbox(Hooks.getDriver());

    @When("^Click on all 4 checkboxes in the multiple checkbox form$")
    public void clickOnAllCheckboxes() {
        multipleCheckbox.clickAllCheckboxes();
    }

    @Then("^Verify that all 4 checkboxes are checked$")
    public void verifyThatAllCheckboxesAreChecked() {
        Assertions.assertTrue(multipleCheckbox.checkboxSelection(), "Not all checkboxes are selected!");
    }

    @And("^Verify that button text is changed to \"Uncheck All\"$")
    public void verifyThatButtonTextIsChangedToUncheckAll() {
        Assertions.assertEquals("Uncheck All", multipleCheckbox.getButtonValue());
    }

    @When("^Click on Option 1 to uncheck it$")
    public void clickOnCheckboxToUncheckIt() {
        multipleCheckbox.uncheckFirstCheckbox();
    }

    @Then("^Verify that button text is changed to \"Check All\"$")
    public void notAllCheckboxesAreSelectedButtonTextCorrect() {
        Assertions.assertEquals("Check All", multipleCheckbox.getButtonValue());
    }
}
