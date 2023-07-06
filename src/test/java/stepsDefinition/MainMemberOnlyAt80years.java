package stepsDefinition;

import PageObjects.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import java.util.Random;

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
    PayerDetails payerDetails;
    @Steps
    confirmationPage confirmationPage;

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
        memberPage.SelectTitle("Dr");
        memberPage.EnterName("Zwai");
        memberPage.Entersurname("Mlungu");
        memberPage.enterMemberIDnum("9107035183981");
        memberPage.enterMobileNum("0835698501");
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

    payerDetails.user_should_be_able_to_capture_payer_banking_details();
    payerDetails.EnterDebitDate("25");
        Thread.sleep(10000);
    payerDetails.user_should_be_able_to_authorise_the_debit_check();
    payerDetails.user_should_be_able_to_confirm_debit_check();
    payerDetails.user_should_be_able_to_click_continue_button_and_navigate_to_navigate_to_confirmations_page();

    }

@Then(": client should confirm if policy information is correct")
public void client_should_confirm_if_policy_information_is_correct() throws InterruptedException {
        confirmationPage.premiumAmount();
        confirmationPage.ViewWhoIsCovered();
         confirmationPage.ViewBenefits();
         confirmationPage.AnnualIncrease();
        confirmationPage.clickTermsAndConditions();
        Thread.sleep(10000);
        confirmationPage.ClickConfirmBtn();
        Thread.sleep(10000);
}
}
