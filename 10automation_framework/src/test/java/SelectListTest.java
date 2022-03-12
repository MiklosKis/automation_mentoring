import com.testautomation.selenium.hooks.Hooks;
import com.testautomation.selenium.steps.SelectListStep;
import org.junit.jupiter.api.Test;

public class SelectListTest extends Hooks{

    SelectListStep selectListStep = new SelectListStep();

    @Test
    public void testSelectList() {
        selectListStep.openPage("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        selectListStep.correctWebpageIsLoaded("Selenium Easy Demo - Automate All Scenarios");
        selectListStep.selectDayFromDropdownMenu("Tuesday");
        selectListStep.validateTheSelectedDay("Tuesday");
        selectListStep.validateSelectedDayMsg("Day selected :- Tuesday");
    }
}
