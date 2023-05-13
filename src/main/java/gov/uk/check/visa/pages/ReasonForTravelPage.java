package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ReasonForTravelPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    /**
     * Select reason 'Tourism'
     *
     * @param reason
     */
    public void selectReasonForVisit(String reason) {
        Reporter.log("Select Reason For Visit ");
        CustomListeners.test.log(Status.PASS, "Select Reason For Visit ");
        clickOnElement(By.xpath("//label[contains(normalize-space(),'" + reason + "')]"));
    }

    public void clickNextStepButton() {
        Reporter.log("Click On Next Button " + nextStepButton.toString());
        CustomListeners.test.log(Status.PASS, "Click On Next Button" + nextStepButton);
        clickOnElement(nextStepButton);
    }

}
