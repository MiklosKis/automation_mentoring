package stepdefinition;

import com.testautomation.cucumber.hooks.Hooks;
import com.testautomation.cucumber.pages.CommonPage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.TimeoutException;

public class CommonSteps {
    CommonPage commonPage = new CommonPage(Hooks.getDriver());

    @Given("^I open the (.+) page$")
    public void iOpenThePage(String url) {
        commonPage.openPage(url);
        try {
            commonPage.popupIsOpened("No, thanks!");
            commonPage.closePopup();
        } catch (TimeoutException exception) {
            System.out.println("Timeout exception. No popup was displayed!");
        }
    }
}
