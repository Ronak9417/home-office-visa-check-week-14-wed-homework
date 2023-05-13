package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class SelectNationalityPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;


    /**
     * Select a Nationality 'Australia'
     * @param nationality
     * @throws InterruptedException
     */
    public void selectNationality(String nationality) throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Select Nationality " + nationality.toString());
        CustomListeners.test.log(Status.PASS, "Select Nationality" + nationality);
        selectByVisibleTextFromDropDown(nationalityDropDownList,nationality);
    }
    /**
     * Click on Continue button
     */
    public void clickNextStepButton(){
        Reporter.log("Click On Next Button " + nextStepButton.toString());
        CustomListeners.test.log(Status.PASS, "Click On Next Button" + nextStepButton);
        clickOnElement(nextStepButton);
    }
}
