import com.testautomation.selenium.hooks.Hooks;
import com.testautomation.selenium.pages.MultipleCheckbox;
import com.testautomation.selenium.steps.GroupRadioButtonsStep;
import com.testautomation.selenium.steps.MultipleCheckboxStep;
import org.junit.jupiter.api.Test;

public class MultipleCheckboxTest extends Hooks{
    MultipleCheckboxStep multipleCheckboxStep = new MultipleCheckboxStep();

    @Test
    public void testMultipleCheckboxes() {
        multipleCheckboxStep.openPage("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
        multipleCheckboxStep.correctWebpageIsLoaded("Selenium Easy - Checkbox demo for automation using selenium");
        multipleCheckboxStep.clickAllCheckboxes();
        multipleCheckboxStep.areAllCheckboxesSelected();
        multipleCheckboxStep.isAllCheckboxesSelectedButtonTextCorrect("Uncheck All");
        multipleCheckboxStep.unselectFirstCheckbox();
        multipleCheckboxStep.notAllCheckboxesAreSelectedButtonTextCorrect("Check All");
    }
}
