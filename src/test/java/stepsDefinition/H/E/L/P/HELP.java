package stepsDefinition.H.E.L.P;

import PageObjects.FuneralPlans.MemberPage;
import PageObjects.FuneralPlans.confirmationPage;
import PageObjects.HomePage.HomePage;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class HELP {



    @Steps
    HomePage homePage;
    @Steps
    MemberPage memberPage;

    @Steps
    confirmationPage confirmationPage;

    @Given("User has selected ultimate dignity plan  for H.E.L.P and they enter email")
    public void user_has_selected_ultimate_dignity_plan_for_h_e_l_p_and_they_enter_email() {
        homePage.OpenWebsite();
        homePage.ClickBuyNowHospitalPlans();
        memberPage.selectUltimatePlanforHelp();
        memberPage.EnterEmail(memberPage.GeneratedEmailAddress());
        homePage.clickContinueBtn();
    }
    @Then("user should be able to see all available amounts")
    public void user_should_be_able_to_see_all_available_amounts() throws InterruptedException {
        memberPage.DifferentAmnt();
    }
    @Then("user should get a generated policy number for H.E.L.P with correct cover {string}.")
    public void user_should_get_a_generated_policy_number_for_h_e_l_p_with_correct_cover(String coverAmount) throws InterruptedException {
        confirmationPage.viewPremium();
        confirmationPage.ViewWhoIsCovered();
        confirmationPage.ViewBenefits();
        confirmationPage.AnnualIncreaseForHelp();
        confirmationPage.AcceptTermsAndConditions();

        confirmationPage.ClickConfirmBtn();
        Thread.sleep(8000);


        confirmationPage.ViewThankYouMessage();
        confirmationPage.finalPremiumMnth(coverAmount);
        confirmationPage.PolicyNumber();


    }

    @Given("User has selected standard dignity plan  for H.E.L.P and they enter email")
    public void user_has_selected_standard_dignity_plan_for_h_e_l_p_and_they_enter_email() {

        homePage.OpenWebsite();
        homePage.ClickBuyNowHospitalPlans();
        memberPage.EnterEmail(memberPage.GeneratedEmailAddress());
        homePage.clickContinueBtn();
    }








}
