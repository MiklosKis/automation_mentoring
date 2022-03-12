import com.testautomation.selenium.hooks.Hooks;
import com.testautomation.selenium.steps.JQueryUIProgressBarStep;
import org.junit.jupiter.api.Test;

public class JQueryUIProgressBarTest extends Hooks {

    JQueryUIProgressBarStep jQueryUIProgressBarStep = new JQueryUIProgressBarStep();

    @Test
    public void testJQueryProgressBar() {
        jQueryUIProgressBarStep.openPage("https://demo.seleniumeasy.com/jquery-download-progress-bar-demo.html");
        jQueryUIProgressBarStep.correctWebpageIsLoaded("Selenium Easy - JQuery Download Progress bar demo");
        jQueryUIProgressBarStep.clickOnDownloadButton();
        jQueryUIProgressBarStep.isSuccessfulDownloadMsgDisplayed("Close");
        jQueryUIProgressBarStep.isDownloadSuccessfullyFinished("Complete!");
    }
}
