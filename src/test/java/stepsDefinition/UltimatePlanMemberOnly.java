package stepsDefinition;

import PageObjects.HomePage;
import PageObjects.MemberPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class UltimatePlanMemberOnly {

    @Steps
    HomePage homePage;

    @Steps
    MemberPage memberDetailsPage;


    @Given("User has selected ultimate dignity plan and they enter {string}")
    public void user_has_selected_ultimate_dignity_plan_and_they_enter(String email) throws InterruptedException {
        homePage.open();
        homePage.ClickBuyNowFuneralPlans();
        memberDetailsPage.selectUltimatePlan();
        memberDetailsPage.EnterEmail(email);
        homePage.clickContinueBtn();
        Thread.sleep(3000);

    }

    @Then("user should see all available amounts on the slider.")
    public void user_should_see_all_available_amounts_on_the_slider() {
        memberDetailsPage.Is50000Avaliable();
    }
}