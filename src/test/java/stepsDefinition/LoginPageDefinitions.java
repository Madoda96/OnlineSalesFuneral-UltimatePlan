package stepsDefinition;

import PageObjects.DashboardPage;
import PageObjects.ForgetPasswordPage;
import PageObjects.LoginPage;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginPageDefinitions {


    @Steps
    LoginPage loginPage;

    @Steps
    DashboardPage dashPage;

    @Steps
    ForgetPasswordPage forgetpasswordPage;

    @Given("User is on Home page")
    public void openApplication() {
        loginPage.open();
        System.out.println("Page is opened");
    }

    @When("User enters username as {string}")
    public void enterUsername(String userName) {
        System.out.println("Enter Username");
        loginPage.inputUserName(userName);
    }

    @When("User enters password as {string}")
    public void enterPassword(String passWord) {
        loginPage.inputPassword(passWord);

        loginPage.clickLogin();
    }

    @Then("User should be able to login successfully")
    public void clickOnLoginButton() {
        dashPage.loginVerify();
    }

    @Then("User should be able to see error message {string}")
    public void unsucessfulLogin(String expectedErrorMessage) throws InterruptedException {
        String actualErrorMessage = loginPage.errorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @When("User clicks on Forgot your password link")
    public void clickForgetPasswordLink() {
        loginPage.clickForgetPasswordLink();
    }

    @Then("User should be able to see new page which contains Reset Password button")
    public void verifyForgetPasswordPage() {

        Assert.assertTrue(forgetpasswordPage.ForgetPasswordPage());
    }

}
