package orangehrmlive.pages;

import com.aventstack.extentreports.Status;
import orangehrmlive.customlisteners.CustomListeners;
import orangehrmlive.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class ForgetPasswordPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-login-forgot']")
    WebElement forgetPasswordLink;

    @CacheLookup
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")
    WebElement messageResetPassword;

    public void clickOnForgetPasswordLink() {
        Reporter.log("Click on the forget password Button " + forgetPasswordLink.toString());
        clickOnElement(forgetPasswordLink);
        CustomListeners.test.log(Status.PASS, "Click on the forget password Button");
    }

    public String getmessageResetPassword() {
        Reporter.log("Click on the reset password Button " + messageResetPassword.toString());
        CustomListeners.test.log(Status.PASS, "Click on the reset password Button ");
        return getTextFromElement(messageResetPassword);
    }

}
