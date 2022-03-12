package stepdefinition;

import com.testautomation.cucumber.hooks.Hooks;
import com.testautomation.cucumber.pages.JQueryUIProgressBar;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class JQueryProgressBarSteps {
    private JQueryUIProgressBar jQueryUIProgressBar = new JQueryUIProgressBar(Hooks.getDriver());

    @When("^Click on Start Download button$")
    public void clickOnDownloadButton() {
        jQueryUIProgressBar.clickDownload();
    }

    @Then("^Verify that the download has completed, displaying (.+)$")
    public void isSuccessfulDownloadMsgDisplayed(String inProgressMsg) {
        Assertions.assertTrue(jQueryUIProgressBar.downloadIsFinished(inProgressMsg), "Download is not finished!");
    }

    @And("^(.+) is displayed as success message$")
    public void isDownloadSuccessfullyFinished(String successMsg) {
        Assertions.assertEquals(successMsg, jQueryUIProgressBar.getsuccessfulDownloadText());
    }
}
