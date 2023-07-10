package stepsDefinition;

import PageObjects.PayerDetails;
import PageObjects.*;
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
    PayerDetails payerDetails;

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
    @Given(": complete member details")
    public void complete_member_details() {
        memberPage.SelectTitle("Dr");
        memberPage.EnterName("Lula");
        memberPage.Entersurname("zuluuuu");
        memberPage.enterMemberIDnum("8906255179921");
        memberPage.enterMobileNum("0835698547");
        memberPage.enterPostalAddress("21 Jump Street");
        memberPage.EnterPostalCode("0152");
        memberPage.selectIncome("R10,000 - R15,000");
        memberPage.selectOccupation("Technician");
        memberPage.selectEducation("University, Technikon, Degree, Diploma");
        memberPage.acceptFICAdecl("Yes");
        memberPage.acceptFicaDeclaration2("Yes");
        memberPage.clickContinueBt();
    }
    @Then(": Complete Additioal member details")
    public void complete_additioal_member_details() throws InterruptedException {
        additionalMembers.clickContinue();
        Thread.sleep(10000);
    }

    @Given(":Select member estate on beneficiary")
    public void select_member_estate_on_beneficiary() throws InterruptedException {

//        beneficiaryDetails.SelectBeneficiaryTite("Dr");
//        beneficiaryDetails.EnterBeneficiaryName("Mlandeli");
//        beneficiaryDetails.EnterBeneficiarySurname("Madoda");
//        beneficiaryDetails.EnterBenefiaryIDnum("84062551335070");
        beneficiaryDetails.SelectBeneficiaryRelationship("Member Estate");
        Thread.sleep(10000);
//        beneficiaryDetails.SelectPercentageAllocation("100%");
//        beneficiaryDetails.clickSaveDetails();
        //beneficiaryDetails.clickContinueButtn();
        //Thread.sleep(10000);

//        beneficiaryDetails.SelectBeneficiaryTite("Prof");
//        beneficiaryDetails.EnterBeneficiaryName("Zwai");
//        beneficiaryDetails.EnterBeneficiarySurname("Bala");
//        //beneficiaryDetails.EnterDateOfBirth("2002","Oct","4");
//        beneficiaryDetails.EnterDateOfBirth("26", "Jun", "1980");
//        beneficiaryDetails.SelectBeneficiaryRelationship("Cousin");
//        Thread.sleep(6000);
//        beneficiaryDetails.SelectPercentageAllocation("100%");
       beneficiaryDetails.clickSaveDetails();
        beneficiaryDetails.clickContinueButtn();
        Thread.sleep(10000);
    }

    @Given(": capture payer details")
    public void capture_payer_details() throws InterruptedException {

    payerDetails.SelectPayerTitle("Prof");
    payerDetails.EnterPayerName("Malwaaaaaaaaa");
    payerDetails.EnterPayerSurname("Zwinooooo");
    payerDetails.EnterPayIDNumber("8006267714649");
    payerDetails.EnterPayerMobileNumber("0832654785");
        //   payerDetails.SelectPayerRelationshipwithMemebr("Aunt");
        Thread.sleep(10000);
    payerDetails.SelectBankName("FIRSTRAND BANK");
    payerDetails.selectBranchName("Universal Branch");
    payerDetails.SelectAccountType("Cheque Account");
    payerDetails.EnterAccNumber("1234");
    payerDetails.EnterDebitDate("31");
    //payerDetails.
    //payerDetails.Cellphone_on_hand("yes");
    }

}
