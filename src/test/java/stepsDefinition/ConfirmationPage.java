package stepsDefinition;


import PageObjects.HomePage;
import PageObjects.MemberPage;
import PageObjects.AdditionalMembers;
import PageObjects.BeneficiaryDetails;
import PageObjects.PayerDetails;
import PageObjects.confirmationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.PageObjects;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.devtools.v85.memory.Memory;

public class ConfirmationPage {

    @Steps
    HomePage homePage;
    @Steps
    MemberPage memberPage;
    @Steps
    AdditionalMembers additionalMembers;
    @Steps
    BeneficiaryDetails beneficiaryDetails;
    @Steps
    PayerDetails payerDetails;
    @Steps
    confirmationPage confirmationPage;




    @Given("User is on the active dignity plan")
    public void user_is_on_the_active_dignity_plan() throws InterruptedException {
        homePage.open();
        homePage.ClickBuyNowFuneralPlans();
        memberPage.EnterEmail("Kabelo@gmail.com");
        homePage.clickContinueBtn();
        Thread.sleep(10000);

    }
    @Given("User completes the required details information.")
    public void user_completes_the_required_details_information() throws InterruptedException {

        // Add Member details Mandatory
        memberPage.SelectTitle("Mr");
        memberPage.EnterName("Lebogang");
        memberPage.Entersurname("Sox");
        memberPage.enterMemberIDnum("8206277115080");
        memberPage.enterMobileNum("0761406577");

        // Capture Additional Details Mandatory

        additionalMembers.selectTitle("Mr");
        additionalMembers.enterSpouseName("Sophie");
        additionalMembers.enterSpouseSurname("Mango");
        additionalMembers.selectSpouseGender("Female");
        additionalMembers.enterSpouseDateOfBirth("1988", "Jun", "27");
        additionalMembers.saveSpousedtls();
        additionalMembers.clickContinue();

        // Capture beneficiary Details Mandatory

        beneficiaryDetails.SelectBeneficiaryTite("Mr");
        beneficiaryDetails.EnterBeneficiaryName("Fifi");
        beneficiaryDetails.EnterBeneficiarySurname("Kuku");
        beneficiaryDetails.SelectBeneficiaryRelationship("Member Estate");
        beneficiaryDetails.SelectPercentageAllocation("100%");
        beneficiaryDetails.clickSaveDetails();
        Thread.sleep(10000);
        beneficiaryDetails.clickContinueButtn();

        // Capture Payer Details mandatory

        payerDetails.SelectBankName("ABSA ");
        payerDetails.SelectAccountType("cheque");
        payerDetails.EnterAccNumber("1234");
        payerDetails.EnterDebitDate("25");
        payerDetails.Cellphone_on_hand("Yes");
        payerDetails.debitBankAcc();
        payerDetails.clickContinueBtn();
        Thread.sleep(10000);
    }
    @Given("User confirms captured policy information with all checks")
    public void user_confirms_captured_policy_information_with_all_checks() throws InterruptedException {
        confirmationPage.viewPremium();
        confirmationPage.ViewWhoIsCovered();
        confirmationPage.ViewBenefits();
        confirmationPage.AnnualIncrease();
        confirmationPage.clickTermsAndConditions();
        confirmationPage.ClickConfirmBtn();
        Thread.sleep(10000);

    }
    @Then("User should be able to see policy created and policy information")
    public void user_should_be_able_to_see_policy_created_and_policy_information() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
