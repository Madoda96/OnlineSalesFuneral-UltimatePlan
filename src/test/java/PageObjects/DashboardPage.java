package PageObjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class DashboardPage extends PageObject {
    @Step("Successful login")
    public void loginVerify() {
        String dashboardTitle = $(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
        if(dashboardTitle.contains("Welcome")){

            System.out.println("Title matches");
        }else {
            System.out.println("Title don't match");
        }


    }

}
