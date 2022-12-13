package orangehrmlive.pages;


import com.aventstack.extentreports.Status;
import orangehrmlive.customlisteners.CustomListeners;
import orangehrmlive.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(name = "username")
    WebElement userName;

    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement welcomeText;

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void enterUserName(String name) {
        Reporter.log("Click on the login Button " + userName.toString());
        sendTextToElement(userName, name);
        CustomListeners.test.log(Status.PASS, "Click on the login Button ");
    }

    public void enterPassword(String password) {
        Reporter.log("enter password " + passwordField.toString());
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS, "enter password ");
    }

    public void clickOnLoginButton() {
        Reporter.log("Click on the login Button " + loginButton.toString());
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS, "Click on the login Button ");
    }


}
