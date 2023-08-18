package stepsDefinition.DignityPlan;

import PageObjects.FuneralPlans.AdditionalMembers;
import PageObjects.FuneralPlans.BeneficiaryDetails;
import PageObjects.HomePage.HomePage;
import PageObjects.FuneralPlans.MemberPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class PayerDetails {
    @Steps
    HomePage homePage;
    @Steps
    MemberPage memberPage;
    @Steps
    AdditionalMembers additionalMembers;
    @Steps
    BeneficiaryDetails beneficiaryDetails;

    @Steps
    PageObjects.FuneralPlans.PayerDetails details;
    //PayerDetails payerDetails;


    @Given("User complete Member detail, Additional details and Beneficiary details")
    public void userCompleteMemberDetailAdditionalDetailsAndBeneficiaryDetails() throws InterruptedException {

        // Initialize the Web Browser
        homePage.open();
        homePage.ClickBuyNowFuneralPlans();
        memberPage.EnterEmail("Leboga@gmail.com");
        homePage.clickContinueBtn();
        Thread.sleep(10000);

        // Member Details Page

        memberPage.SelectTitle("Dr");
        memberPage.EnterName("Opelong");
        memberPage.Entersurname("Direro");
      //  memberPage.enterMemberIDnum("8406258689000");
        memberPage.enterMobileNum("0728406258");
        memberPage.enterPostalAddress("21 jump street");
        memberPage.EnterPostalCode("0152");
        memberPage.selectIncome("R6,000 - R10,000");
        memberPage.selectOccupation("Manager");
        memberPage.selectEducation("Matric");
        memberPage.acceptFICAdecl("Yes");
        memberPage.acceptFicaDeclaration2("No");
        memberPage.clickContinueBt();


        // Additional Member Details

        additionalMembers.addSpouse();
        additionalMembers.selectTitle("Mrs");
        additionalMembers.enterSpouseName("Elizabeth");
        additionalMembers.enterSpouseSurname("Soap");
        additionalMembers.selectSpouseGender("Female");
        additionalMembers.EnterSpouseIDNo("8406255130792");
        additionalMembers.enterSpouseDateOfBirth("1984", "Dec", "10");
        additionalMembers.saveSpousedtls();
        additionalMembers.clickContinue();
        Thread.sleep(10000);

        // Capture beneficiary Details
        // //*[@id="onTtlB1"]

        beneficiaryDetails.SelectBeneficiaryTite("Dr");
        beneficiaryDetails.EnterBeneficiaryName("Mlandeli");
        beneficiaryDetails.EnterBeneficiarySurname("Madoda");
        beneficiaryDetails.EnterBenefiaryIDnum("84062551335070");
        beneficiaryDetails.SelectBeneficiaryRelationship("Friend");
        beneficiaryDetails.SelectPercentageAllocation("100%");
        beneficiaryDetails.clickSaveDetails();
        beneficiaryDetails.clickContinueButtn();
        Thread.sleep(10000);

    }

    // Capture and Confirm Payer Details


    @Given("User should be able to capture Payer Banking Details")
    public void user_should_be_able_to_capture_payer_banking_details() {
        details.SelectBankName("ABSA BANK");
        details.selectBranchName("Universal Branch");
        details.SelectAccountType("Cheque Account");
        details.EnterAccNumber("1234");

    }


    //        @Given("User shoould be able to capture Payer Banking Details")
//        public void user_shoould_be_able_to_capture_payer_banking_details() {
//
//        details.SelectBankName("ABSA BANK");
//        details.selectBranchName("Universal Branch");
//        details.SelectAccountType("Cheque Account");
//        details.EnterAccNumber("1234");
//
//        }
    @Given("User should be able to confirm Debit check")
    public void user_should_be_able_to_confirm_debit_check() {

        details.Cellphone_on_hand("Yes");
    }

    @Given("User should be able to Authorise the debit check")
    public void user_should_be_able_to_authorise_the_debit_check() {
        details.debitBankAcc();


    }

    @Then("User should be able to click Continue button, and Navigate to navigate to Confirmations page")
    public void user_should_be_able_to_click_continue_button_and_navigate_to_navigate_to_confirmations_page() {
        details.clickContinueBtn();

    }


    @Then("")
    public void userShouldBeAbleToClickContinueButtonAndNavigateToNavigateToConfirmationsPage() {
    }


}
