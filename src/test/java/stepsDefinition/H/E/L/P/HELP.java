package stepsDefinition.H.E.L.P;

import PageObjects.FuneralPlans.AdditionalMembers;
import PageObjects.FuneralPlans.MemberPage;
import PageObjects.FuneralPlans.confirmationPage;
import PageObjects.HomePage.HomePage;
import PageObjects.ID_Number;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class HELP {



    @Steps
    HomePage homePage;
    @Steps
    MemberPage memberPage;

    @Steps
    confirmationPage confirmationPage;
    @Steps
    ID_Number idNumber;
    @Steps
    AdditionalMembers additionalMembers;

    @Given("User has selected ultimate dignity plan  for H.E.L.P and they enter email they are of age {string}")
    public void user_has_selected_ultimate_dignity_plan_for_h_e_l_p_and_they_enter_email_they_are_of_age(String age) throws IOException, InterruptedException {

        idNumber.OpenIDnumberGeneratorWebsite();
        idNumber.enterAge(age);


        homePage.OpenWebsite();
        homePage.ClickBuyNowHospitalPlans();
        memberPage.selectUltimatePlanforHelp();
        Thread.sleep(3000);
        memberPage.EnterEmail(memberPage.GeneratedEmailAddress());
        homePage.clickContinueBtn();
        Thread.sleep(3000);
    }
    @Then("user should be able to see all available amounts")
    public void user_should_be_able_to_see_all_available_amounts() throws InterruptedException {
        memberPage.DifferentAmnt();
    }
    @Then("user should get a generated policy number for H.E.L.P with correct cover {string}.")
    public void user_should_get_a_generated_policy_number_for_h_e_l_p_with_correct_cover(String coverAmount) throws InterruptedException {
        Thread.sleep(10000);
        confirmationPage.viewPremium();
        confirmationPage.ViewWhoIsCovered();
        confirmationPage.ViewBenefits();
        confirmationPage.AnnualIncreaseForHelp();

        confirmationPage.AcceptTermsAndConditions();

        confirmationPage.ClickConfirmBtn();
        confirmationPage.ViewThankYouMessage();
        confirmationPage.finalPremiumMnth(coverAmount);
        confirmationPage.PolicyNumber();


    }

    @Given("User has selected standard dignity plan  for H.E.L.P and they enter email they are of age {string}")
    public void user_has_selected_standard_dignity_plan_for_h_e_l_p_and_they_enter_email_and_they_are_of(String age) throws IOException, InterruptedException {

        idNumber.OpenIDnumberGeneratorWebsite();
        idNumber.enterAge(age);


        homePage.OpenWebsite();
        homePage.ClickBuyNowHospitalPlans();
        Thread.sleep(3000);
        memberPage.EnterEmail(memberPage.GeneratedEmailAddress());
        homePage.clickContinueBtn();
        Thread.sleep(3000);
    }
    @When("user selects two hundred thousand rands cover amount")
    public void user_selects_two_hundred_thousand_cover_amount() throws InterruptedException {
        memberPage.selectR200000();
    }

    @When("user selects one hundred and fifty thousand rands cover amount")
    public void user_selects_one_hundred_and_fifty_thousand_rands_cover_amount() throws InterruptedException {
       memberPage.selectR150000();
    }
    @When("user selects two hundred and fifty thousand rands cover amount")
    public void user_selects_two_hundred_and_fifty_thousand_rands_cover_amount() throws InterruptedException {
    memberPage.selectR250000();

    }
    @Then("User selects R50000 family cover")
    public void user_selects_r50000_family_cover() throws InterruptedException {
 //      additionalMembers.SelectR50000HELPUltimate();
    }
    @Then("User selects R100000 family cover")
    public void user_selects_r100000_family_cover() throws InterruptedException {
       additionalMembers.SelectR100000HELPUltimate();
           }

    @Then("User selects R150000 family cover")
    public void user_selects_r150000_family_cover() throws InterruptedException {
      additionalMembers.SelectR150000HELPUltimate();
    }
    @Then("User selects R200000 family cover")
    public void user_selects_r200000_family_cover() throws InterruptedException {
        additionalMembers.SelectR200000HELPUltimate();
    }



}
