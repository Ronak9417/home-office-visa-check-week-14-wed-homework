package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class WorkTypePage extends Utility {

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement clickNextStepButton;

    public void selectJobType(String reason) {
        Reporter.log("enter JobTitle " + reason);
        CustomListeners.test.log(Status.PASS, "get confirm password RequiredMessage " +reason);
        clickOnElement(By.xpath("//label[contains(text(),'" + reason + "')]"));

    }

    public void clickNextStepButton(){
        Reporter.log("click Next StepButton " + clickNextStepButton.toString());
        CustomListeners.test.log(Status.PASS, "click Next StepButton " + clickNextStepButton);
        clickOnElement(clickNextStepButton);
    }
}
