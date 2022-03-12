package stepdefinition;

import com.testautomation.cucumber.hooks.Hooks;
import com.testautomation.cucumber.pages.InputField;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class InputFieldSteps {
    private InputField inputField = new InputField(Hooks.getDriver());

    //Single input field related steps
    @Given("^I am on the input field test page$")
    public void iAmOnThePage() {
        Assertions.assertEquals("Selenium Easy Demo - Simple Form to Automate using Selenium", inputField.getPageTitle());
    }

    @When("^Enter (.+) into the single input field$")
    public void enterTextIntoTheSingleInputField(String singleMsg) {
        inputField.sendText(singleMsg);
    }

    @And("^Click on the \"Show Message\" button$")
    public void clickOnTheShowMessageButton() {
        inputField.clickFirstButton();
    }

    @Then("^Verify that the (.+) shown is equal to the one I have entered$")
    public void validateTheDisplayedTextForSingleField(String msg) {
        Assertions.assertEquals(msg, inputField.getFirstDisplayedMessage());
    }

    //Two input fields related steps
    @When("^Enter (.+) to the first input field$")
    public void enterValueToTheFirstInputField(int num) {
        inputField.sendValueOne(num);
    }

    @And("^Enter (.+) to the second input field$")
    public void enterValueToTheSecondInputField(String multiMsg) {
        inputField.sendValueTwo(multiMsg);
    }

    @And("^Click on the \"Get Total\" button$")
    public void clickOnTheGetTotalButton() {
        inputField.clickSecondButton();
    }

    @Then("^Verify that the string \"NaN\" is displayed as total value$")
    public void validateTheDisplayedMessageForTwoFields() {
        Assertions.assertEquals("NaN", inputField.getSecondDisplayedMessage());
    }
}
