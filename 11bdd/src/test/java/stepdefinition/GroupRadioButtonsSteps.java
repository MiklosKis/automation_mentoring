package stepdefinition;

import com.testautomation.cucumber.hooks.Hooks;
import com.testautomation.cucumber.pages.GroupRadioButtons;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class GroupRadioButtonsSteps {
    private GroupRadioButtons groupRadioButtons = new GroupRadioButtons(Hooks.getDriver());

    @When("^Click on (.+) sex radio button$")
    public void clickOnSexRadioButton(String sex) {
        switch (sex) {
            case "Male":
                groupRadioButtons.clickOnGenderRadioButton(sex);
                Assertions.assertTrue(groupRadioButtons.isGenderRadioButtonSelected(),
                        "Male radio button is not selected!");
                break;
            case "Female":
                groupRadioButtons.clickOnGenderRadioButton(sex);
                Assertions.assertTrue(groupRadioButtons.isGenderRadioButtonSelected(),
                        "Female radio button is not selected!");
                break;
            default:
                System.out.println("No sex radio button was selected");
                break;
        }
    }

    @And("^Click on (.+) age group radio button$")
    public void clickOnAgeGroupRadioButton(String ageGroup) {
        switch (ageGroup) {
            case "0 - 5":
                groupRadioButtons.clickOnAgeGroupRadioButton(ageGroup);
                Assertions.assertTrue(groupRadioButtons.isAgeGroupRadioButtonSelected(),
                        "'0 - 5' radio button is not selected!");
                break;
            case "5 - 15":
                groupRadioButtons.clickOnAgeGroupRadioButton(ageGroup);
                Assertions.assertTrue(groupRadioButtons.isAgeGroupRadioButtonSelected(),
                        "'5 - 15' radio button is not selected!");
                break;
            case "15 - 50":
                groupRadioButtons.clickOnAgeGroupRadioButton(ageGroup);
                Assertions.assertTrue(groupRadioButtons.isAgeGroupRadioButtonSelected(),
                        "15 - 50 radio button is not selected!");
                break;
            default:
                System.out.println("No ageGroup radio button was selected");
                break;
        }
    }

    @And("^Click on the \"Get values\" button$")
    public void clickOnGetCheckedValueButton(){
        groupRadioButtons.clickOnGetValuesButton();
    }

    @Then("^Verify that message shows the selected (.+) and (.+) option values$")
    public void verifyThatMessageShowsTheSelectedOptionValues(String sex, String ageGroup) {
        Assertions.assertEquals("Sex : " + sex + "\n" +
                "Age group: " + ageGroup, groupRadioButtons.getRadioButtonMsg());
    }
}
