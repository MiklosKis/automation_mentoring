import com.testautomation.selenium.hooks.Hooks;
import com.testautomation.selenium.steps.SingleInputFieldStep;
import com.testautomation.selenium.steps.TwoInputFieldsStep;
import org.junit.jupiter.api.Test;

public class TwoInputFieldsTest extends Hooks{
    TwoInputFieldsStep twoInputFieldsStep = new TwoInputFieldsStep();

    @Test
    public void testTwoInputFieldsNaN() {
        twoInputFieldsStep.openPage("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        twoInputFieldsStep.correctWebpageIsLoaded("Selenium Easy Demo - Simple Form to Automate using Selenium");
        twoInputFieldsStep.canClosePopup("No, thanks!");
        twoInputFieldsStep.closingPopupWindow();
        twoInputFieldsStep.addFirstNumericValue(10);
        twoInputFieldsStep.addSecondStringValue("Duck");
        twoInputFieldsStep.clickGetTotalButton();
        twoInputFieldsStep.validateDisplayedMessage("NaN");
    }
}
