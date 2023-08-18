package stepsDefinition.UltimateDignityPlan;

import PageObjects.HomePage.HomePage;
import PageObjects.FuneralPlans.MemberPage;
import PageObjects.ID_Number;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class UltimatePlanMember {

    @Steps
    HomePage homePage;

    @Steps
    MemberPage memberDetailsPage;

    @Steps
    ID_Number idNumber;


    @Given("User has selected ultimate dignity plan and they enter email")
    public void user_has_selected_ultimate_dignity_plan_and_they_enter(String age) throws InterruptedException, IOException {

        idNumber.OpenIDnumberGeneratorWebsite();
        idNumber.enterAge(age);



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