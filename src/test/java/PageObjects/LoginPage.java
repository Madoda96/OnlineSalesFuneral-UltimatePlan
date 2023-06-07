package PageObjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageObject {


    String x = "//input[@name='username']";



    @Step("Enter Username")
    public void inputUserName(String userName) {
        $(By.xpath(x)).sendKeys(userName);
    }

    @Step("Enter Password")
    public void inputPassword(String passWord) {
        $(By.xpath("//input[@name='password']")).sendKeys((passWord));
    }

    @Step("Click Submit Button")
    public void clickLogin() {
        $(By.xpath("//button[@type='submit']")).click();
    }

    @Step("Error Message on unsuccessful login")
    public String errorMessage() throws InterruptedException {


        WebElement actualErrorMessage = $(By.xpath("//p[@class=\"oxd-text oxd-text--p oxd-alert-content-text\"]"));
        WebElement passwordMessage = $(By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message\"]"));
        WebElement usernameMsg = $(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span"));


        if(actualErrorMessage.isDisplayed()){

            return actualErrorMessage.getText();

        }
        if (passwordMessage.isDisplayed()){
            return passwordMessage.getText();
        }
        if (usernameMsg.isDisplayed()){
            return usernameMsg.getText();
        }
        return null;
    }


    @Step("Click Forget Password Link")
    public void clickForgetPasswordLink() {
        $(By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")).click();

    }




}
