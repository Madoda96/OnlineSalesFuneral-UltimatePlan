package stepsDefinition;

import PageObjects.*;
import PageObjects.PayerDetails;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.Random;

public class MainMemberOnlywithMinimumAgeExtendetMember {
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
    PageObjects.PayerDetails details;

    @Steps
    confirmationPage confirmationPage;
    @Given("User complete Member detail")
    public void user_complete_member_detail() throws InterruptedException {
        homePage.open();
        homePage.ClickBuyNowFuneralPlans();
        //memberPage.GeneratedEmailAddress();
        //Thread.sleep(10000);
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10000);
        memberPage.EnterEmail("Address"+ randomInt +"@gmail.com");
        homePage.clickContinueBtn();

        memberPage.SelectTitle("Mr");
        memberPage.EnterName("Lundi");
        memberPage.Entersurname("Zulu");
        memberPage.enterMemberIDnum("8807047037866");
        memberPage.enterMobileNum("0832523001");
        memberPage.enterPostalAddress("21 Jump Street");
        memberPage.EnterPostalCode("0152");
        memberPage.selectIncome("R10,000 - R15,000");
        memberPage.selectOccupation("Technician");
        memberPage.selectEducation("University, Technikon, Degree, Diploma");
        memberPage.acceptFICAdecl("Yes");
        memberPage.acceptFicaDeclaration2("Yes");
        memberPage.clickContinueBt();
        Thread.sleep(10000);
    }
    @Given("User to complete Additional details")
    public void user_to_complete_additional_details() throws InterruptedException {
        additionalMembers.clickExtendedMemberCheckbx();
        additionalMembers.selectExtMemberTitle1("Dr");
        additionalMembers.EnterExtendedMemberName1("Zizo");
        additionalMembers.EnterExtendedMemberSurname("Fose");
        additionalMembers.SelectExtendedMemberGender1("Female");

        // adding extended member that is 19,  modify year based on test case requirements
        additionalMembers.EnterExtendedMmemberDOB1("2003", "Sep", "14");
        additionalMembers.SelectExtendedMemberRelation1("Child");
        additionalMembers.SaveExtendedMemberDetails();
        additionalMembers.clickContinue();
        Thread.sleep(10000);

    }
    @Given("User to complete Beneficiary details")
    public void user_to_complete_beneficiary_details() throws InterruptedException {
    beneficiaryDetails.SelectBeneficiaryTite("Mr");
    beneficiaryDetails.EnterBeneficiaryName("Anda");
    beneficiaryDetails.EnterBeneficiarySurname("Lawu");
    beneficiaryDetails.EnterBenefiaryIDnum("0707047266531");
    beneficiaryDetails.SelectBeneficiaryRelationship("Child");
    beneficiaryDetails.SelectPercentageAllocation("100%");
    beneficiaryDetails.clickSaveDetails();
    beneficiaryDetails.clickContinueButtn();
        Thread.sleep(10000);

    }
    @Given("User to complete payer details")
    public void user_to_complete_payer_details() throws InterruptedException {
        details.payerdetailsPage();
        details.SelectBankName("ABSA BANK");
        details.selectBranchName("Universal Branch");
        details.SelectAccountType("Savings Account");
        details.EnterAccNumber("1234");
        payerDetails.EnterDebitDate("30");
        payerDetails.Cellphone_on_hand("Yes");
        payerDetails.debitBankAcc();
       payerDetails.clickContinueBtn();
        Thread.sleep(5000);




    }
    @Then("Confirm policy Details")
    public void confirm_policy_details() {
        confirmationPage.premiumAmount();
        confirmationPage.ViewWhoIsCovered();
        confirmationPage.ViewBenefits();
        confirmationPage.AnnualIncrease();
        confirmationPage.clickTermsAndConditions();
        confirmationPage.ClickConfirmBtn();
        confirmationPage.ViewThankYouMessage();

    }
}
