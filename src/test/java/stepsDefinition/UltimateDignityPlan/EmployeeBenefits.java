package stepsDefinition.UltimateDignityPlan;

import PageObjects.FuneralPlans.AdditionalMembers;
import PageObjects.FuneralPlans.MemberPage;
import PageObjects.FuneralPlans.PayerDetails;
import PageObjects.FuneralPlans.confirmationPage;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;

public class EmployeeBenefits {

    @Steps
    MemberPage memberPage;

    @Steps
    confirmationPage confirmationPage;
    @Steps
    AdditionalMembers additionalMembers;

    @When("User completes the required  Member details information {string}, {string}, {string}, {string}.")
    public void user_completes_the_required_member_details_information(String title, String name, String surname, String mobileNum) throws InterruptedException {

       memberPage.SelectTitle(title);
        memberPage.EnterName(name);
        memberPage.Entersurname(surname);
 //       memberPage.enterMemberIDnum(IDnumber);
        memberPage.enterMobileNum(mobileNum);
//       memberPage.SelectDifferentAmnt();




    }
    @Then("user should get a generated policy number with discounted premium {string}.")
    public void user_should_get_a_generated_policy_number_with_discounted_premium(String coverAmount) throws InterruptedException {

       Thread.sleep(5000);
        confirmationPage.discountAmnt();

        confirmationPage.viewPremium();
        confirmationPage.ViewWhoIsCovered();
        confirmationPage.ViewBenefits();
        confirmationPage.AnnualIncrease();
        confirmationPage.AcceptTermsAndConditions();

        confirmationPage.ClickConfirmBtn();
        Thread.sleep(8000);


        confirmationPage.ViewThankYouMessage();
        confirmationPage.finalPremiumMnth(coverAmount);
        confirmationPage.PolicyNumber();

    }

    @When("users confirms whether they have perks discount or not.")
    public void users_confirms_whether_they_have_perks_discount_or_not() throws InterruptedException {
        additionalMembers.employeePerks();




    }
















}
