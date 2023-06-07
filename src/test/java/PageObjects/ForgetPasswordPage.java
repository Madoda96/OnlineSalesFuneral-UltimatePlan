package PageObjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class ForgetPasswordPage extends PageObject {


    @Step("Verify Forget Password Page ")
    public boolean ForgetPasswordPage() {

        boolean resetPasswordButton = $(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/div[2]/button[2]")).isDisplayed();

        return resetPasswordButton;
    }

}
