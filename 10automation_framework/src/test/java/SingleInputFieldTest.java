import com.testautomation.selenium.hooks.Hooks;
import com.testautomation.selenium.steps.SingleInputFieldStep;
import org.junit.jupiter.api.Test;

public class SingleInputFieldTest extends Hooks {

    SingleInputFieldStep singleInputFieldStep = new SingleInputFieldStep();

    @Test
    public void testSingleInputField() {
        singleInputFieldStep.openPage("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        singleInputFieldStep.correctWebpageIsLoaded("Selenium Easy Demo - Simple Form to Automate using Selenium");
        singleInputFieldStep.canClosePopup("No, thanks!");
        singleInputFieldStep.closingPopupWindow();
        singleInputFieldStep.typeTextIntoField("Best test message!");
        singleInputFieldStep.clickShowMessage();
        singleInputFieldStep.validateDisplayedMsg("Best test message!");
    }
}
