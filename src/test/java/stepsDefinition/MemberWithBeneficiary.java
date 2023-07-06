package stepsDefinition;

import PageObjects.AdditionalMembers;
import PageObjects.BeneficiaryDetails;
import PageObjects.HomePage;
import PageObjects.MemberPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class MemberWithBeneficiary {

    @Steps
    PageObjects.PayerDetails details;
    //PayerDetails payerDetails;
    @Steps
    HomePage homePage;

    @Steps
    MemberPage memberPage;

    @Steps
    AdditionalMembers additionalMembers;
    @Steps
    BeneficiaryDetails beneficiaryDetails;


    @Given("User is on the Dignity Plan Page and they enter {string}")
    public void userIsOnTheDignityPlanPageAndTheyEnterEmail(String email) throws InterruptedException {
        homePage.open();
        homePage.ClickBuyNowFuneralPlans();
        memberPage.EnterEmail(email);
        homePage.clickContinueBtn();
        Thread.sleep(5000);
    }

    @And("User completes the required Member Details information {string}, {string}, {string}, {string}, {string}.")
    public void userCompletesTheRequiredMemberDetailsInformationTitleNamesSurnameIDnumberMobileNumber(String title, String memberName, String memberSurname, String IDNumber, String memberMobileNum) throws InterruptedException {
        memberPage.SelectTitle(title);
        memberPage.EnterName(memberName);
        memberPage.Entersurname(memberSurname);
        memberPage.enterMemberIDnum(IDNumber);
        memberPage.enterMobileNum(memberMobileNum);
        memberPage.clickContinueBt();
        Thread.sleep(5000);
    }

    @And("User is on Additional Page, then click continue to navigate to Beneficiary Page")
    public void user_is_on_additional_page_then_click_continue_to_navigate_to_beneficiary_page() throws InterruptedException {
        additionalMembers.clickContinue();
        Thread.sleep(5000);
    }

    @And("User adds Beneficiary {string}, {string}, {string},{string}, {string}")
    public void user_adds_beneficiary(String BeneficiaryTitle, String BeneficiaryName, String BeneficiarySurname, String BeneficiaryRelationship, String BeneficiaryAllocation) {
        beneficiaryDetails.EnterBeneficiaryName(BeneficiaryName);
        beneficiaryDetails.SelectBeneficiaryTite(BeneficiaryTitle);

        beneficiaryDetails.EnterBeneficiarySurname(BeneficiarySurname);
        beneficiaryDetails.SelectBeneficiaryRelationship(BeneficiaryRelationship);
        beneficiaryDetails.SelectPercentageAllocation(BeneficiaryAllocation);
    }


    @Then("user should land on the payer details page")
    public void userShouldLandOnThePayerDetailsPage() {
        details.payerdetailsPage();
    }


}

