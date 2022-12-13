package orangehrmlive.testsuite;


import orangehrmlive.customlisteners.CustomListeners;
import orangehrmlive.pages.ForgetPasswordPage;
import orangehrmlive.pages.LoginPage;
import orangehrmlive.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListeners.class)
public class ForgetPasswordTest extends BaseTest {

    ForgetPasswordPage forgetPasswordPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        forgetPasswordPage = new ForgetPasswordPage();

    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        forgetPasswordPage.clickOnForgetPasswordLink();
        Assert.assertEquals("Reset Password", "Reset Password");

    }
}

