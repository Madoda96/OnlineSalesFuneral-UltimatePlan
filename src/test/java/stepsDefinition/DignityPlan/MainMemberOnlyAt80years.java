package stepsDefinition.DignityPlan;

import PageObjects.FuneralPlans.*;
import PageObjects.FuneralPlans.PayerDetails;
import PageObjects.HomePage.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import java.util.Random;


public class MainMemberOnlyAt80years {

    @Steps
    HomePage homePage;
    @Steps
    MemberPage memberPage;

    @Steps
    AdditionalMembers additionalMembers;
    @Steps
    BeneficiaryDetails beneficiaryDetails;
    @Steps
    PayerDetails details;
    @Steps
    PageObjects.FuneralPlans.confirmationPage confirmationPage;

    @Given(": Open browser and select funeral1")
    public void open_browser_and_select_funeral1() {
        homePage.open();
        homePage.ClickBuyNowFuneralPlans();
       // memberPage.EnterEmail("21mjhnbgh09@gmail.com");
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        memberPage.EnterEmail("Address"+ randomInt +"@gmail.com");
        homePage.clickContinueBtn();
    }
    @And(": complete member details")
    public void complete_member_details() throws InterruptedException {
        memberPage.SelectTitle("Mr");
        memberPage.EnterName("wele");
        memberPage.Entersurname("Zaid");
 //       memberPage.enterMemberIDnum("7307106754239");
        memberPage.enterMobileNum("0835898501");
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
    @And(": Complete Additioal member details")
    public void complete_additioal_member_details() throws InterruptedException {
        additionalMembers.clickContinue();
        Thread.sleep(10000);
    }

    @And(":Select member estate on beneficiary")
    public void select_member_estate_on_beneficiary() throws InterruptedException {
        beneficiaryDetails.SelectBeneficiaryRelationship("Member Estate");
        Thread.sleep(10000);
        beneficiaryDetails.clickSaveDetails();
        beneficiaryDetails.clickContinueButtn();
        Thread.sleep(10000);
    }

    @And(": capture payer details")
    public void capture_payer_details() throws InterruptedException {


      //  payerDetails.EnterDebitDate("25");
        Thread.sleep(10000);
        details.payerdetailsPage();
        details.SelectBankName("ABSA BANK");
        details.selectBranchName("Universal Branch");
        details.SelectAccountType("Savings Account");
        details.EnterAccNumber("1234");
        details.EnterDebitDate("30");
        details.Cellphone_on_hand("Yes");
        details.debitBankAcc();
        details.clickContinueBtn();
        Thread.sleep(5000);

  



    }
@Then(": client should confirm if policy information is correct")
public void client_should_confirm_if_policy_information_is_correct() throws InterruptedException {
        confirmationPage.premiumAmount();
        confirmationPage.ViewWhoIsCovered();
         confirmationPage.ViewBenefits();
         confirmationPage.AnnualIncrease();
        confirmationPage.AcceptTermsAndConditions();
        Thread.sleep(10000);
        confirmationPage.ClickConfirmBtn();
        Thread.sleep(10000);
}
}
