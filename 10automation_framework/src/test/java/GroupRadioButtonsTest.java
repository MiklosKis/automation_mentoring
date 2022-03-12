import com.testautomation.selenium.hooks.Hooks;
import com.testautomation.selenium.steps.GroupRadioButtonsStep;
import org.junit.jupiter.api.Test;

public class GroupRadioButtonsTest extends Hooks {
    GroupRadioButtonsStep groupRadioButtonsStep = new GroupRadioButtonsStep();

    @Test
    public void testGroupRadioButtons() {
        groupRadioButtonsStep.openPage("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        groupRadioButtonsStep.correctWebpageIsLoaded("Selenium Easy Demo - Radio buttons demo for Automation");
        groupRadioButtonsStep.clickOnMaleRadioButton();
        groupRadioButtonsStep.checkTheMaleRadioButtonIsSelected();
        groupRadioButtonsStep.clickOnFifteenPlusRadioButton();
        groupRadioButtonsStep.checkTheFifteenPlusRadioButtonIsSelected();
        groupRadioButtonsStep.clickOnGetCheckedValueButton();
        groupRadioButtonsStep.validateTheRadioButtonMsg("Sex : Male\n" +
                "Age group: 15 - 50");
    }
}