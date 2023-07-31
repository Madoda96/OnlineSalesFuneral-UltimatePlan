package stepsDefinition.UltimateDignityPlan;

import PageObjects.HomePage.HomePage;
import PageObjects.FuneralPlans.MemberPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class UltimatePlanMember {

    @Steps
    HomePage homePage;

    @Steps
    MemberPage memberDetailsPage;


    @Given("User has selected ultimate dignity plan and they enter email")
    public void user_has_selected_ultimate_dignity_plan_and_they_enter() throws InterruptedException {
        homePage.OpenWebsite();
        homePage.ClickBuyNowFuneralPlans();
        memberDetailsPage.selectUltimatePlan();
        memberDetailsPage.EnterEmail(memberDetailsPage.GeneratedEmailAddress());
        homePage.clickContinueBtn();
        Thread.sleep(3000);

    }

    @Then("user should see all available amounts on the slider.")
    public void user_should_see_all_available_amounts_on_the_slider() {
        memberDetailsPage.Is50000Avaliable();
    }
}