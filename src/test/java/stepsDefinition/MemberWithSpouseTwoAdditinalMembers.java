package stepsDefinition;

import PageObjects.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class MemberWithSpouseTwoAdditinalMembers {

    @Steps
    PageObjects.PayerDetails details;
    //PayerDetails payerDetails;
    @Steps
    HomePage homePage;
    @Steps
    confirmationPage confirmationPage;
    @Steps
    MemberPage memberPage;

    @Steps
    AdditionalMembers additionalMembers;
    @Steps
    BeneficiaryDetails beneficiaryDetails;

    @Given("User is on the dignity plan page and they enter email")
    public void user_is_on_the_dignity_plan_page_and_they_enter() {
        homePage.open();
        homePage.ClickBuyNowFuneralPlans();
        memberPage.EnterEmail(memberPage.GeneratedEmailAddress());
        homePage.clickContinueBtn();
    }

    @Given("User completes the required  Member details information {string}, {string}, {string}, {string}, {string}.")
    public void user_completes_the_required_member_details_information(String title, String memberName, String memberSurname, String IDNumber, String memberMobileNum) {




    }

    @Given("User enters {string}, {string}, {string},{string}, {string}.")
    public void user_enters(String memberPostalAddress, String memberPostalCode, String MonthlyIncome, String MemberOccupation, String MemberEducation) {
        memberPage.enterPostalAddress(memberPostalAddress);
        memberPage.EnterPostalCode(memberPostalCode);
        memberPage.selectIncome(MonthlyIncome);
        memberPage.selectOccupation(MemberOccupation);
        memberPage.selectEducation(MemberEducation);

    }

    @Given("User completes {string} and {string} and clicks the continue button.")
    public void user_completes_and_and_clicks_the_continue_button(String FICA1, String FICA2) {
        memberPage.acceptFICAdecl(FICA1);
        memberPage.acceptFicaDeclaration2(FICA2);
        memberPage.clickContinueBt();
    }

    @Given("User adds a spouse {string},{string},{string},{string},{string}.")
    public void user_adds_a_spouse(String SpouseTitle, String spouseName, String spouseSurname, String spousegender, String spouseDOB) throws InterruptedException {
        Thread.sleep(3000);
        additionalMembers.addSpouse();
        additionalMembers.selectTitle(SpouseTitle);
        additionalMembers.enterSpouseName(spouseName);
        additionalMembers.enterSpouseSurname(spouseSurname);
        additionalMembers.selectSpouseGender(spousegender);
        additionalMembers.enterSpouseDateOfBirth("2002", "Oct", "1");
        additionalMembers.saveSpousedtls();

//        additionalMembers.clickContinue();

    }


    @Then("User adds a spouse over maximum age {string},{string},{string},{string},{string}.")
    public void User_adds_a_spouse_over_maximum_age(String SpouseTitle, String spouseName, String spouseSurname, String spousegender, String spouseDOB) throws InterruptedException {
        Thread.sleep(3000);
        additionalMembers.addSpouse();
        additionalMembers.selectTitle(SpouseTitle);
        additionalMembers.enterSpouseName(spouseName);
        additionalMembers.enterSpouseSurname(spouseSurname);
        additionalMembers.selectSpouseGender(spousegender);
        additionalMembers.enterSpouseDateOfBirth("1990", "Oct", "1");
        additionalMembers.saveSpousedtls();

  //      additionalMembers.clickContinue();

    }


    @Given("User adds first beneficiary {string}, {string}, {string},{string}, {string}")
    public void user_adds_first_beneficiary(String Benef1Title, String Benef1Name, String Benef1Surname, String Benef1Relatiomship, String Benef1Allocation) throws InterruptedException {
        Thread.sleep(5000);

        beneficiaryDetails.EnterBeneficiaryName(Benef1Name);
        beneficiaryDetails.SelectBeneficiaryTite(Benef1Title);


        beneficiaryDetails.EnterBeneficiarySurname(Benef1Surname);
//        beneficiaryDetails.EnterDateOfBirth("1", "Dec", "2003");
        beneficiaryDetails.SelectBeneficiaryRelationship(Benef1Relatiomship);
        beneficiaryDetails.SelectPercentageAllocation(Benef1Allocation);
        Thread.sleep(3000);
    }

    @Given("User adds second beneficiary {string}, {string}, {string},{string}, {string}")
    public void user_adds_second_beneficiary(String Benef2Name, String Benef2Title, String Benef2Surname, String Benef2Relatiomship, String Benef2Allocation) {
        beneficiaryDetails.clickToaddBeneficiary();

        beneficiaryDetails.EnterBeneficiaryName2(Benef2Name);
        beneficiaryDetails.SelectBeneficiaryTite2(Benef2Title);

        beneficiaryDetails.EnterBeneficiarySurname2(Benef2Surname);
//        beneficiaryDetails.EnterDateOfBirth("1", "Dec", "2003");
        beneficiaryDetails.SelectBeneficiaryRelationship2(Benef2Relatiomship);
        beneficiaryDetails.SelectPercentageAllocation2(Benef2Allocation);

    }

    @Given("user clicks save details")
    public void user_clicks_save_details() throws InterruptedException {
        beneficiaryDetails.clickSaveDetails();
        beneficiaryDetails.clickContinueButtn();
        Thread.sleep(3000);
    }

    @Then("user should land on the Payer details page")
    public void user_should_land_on_the_payer_details_page() {
        //payerDetails.payerdetailsPage();
        details.payerdetailsPage();
    }

    @Then("User User adds the third child {string},{string},{string},{string},{string} that above eighteen years old")
    public void user_user_adds_the_third_child_that_above_eighteen_years_old(String child3name, String child3Surname, String child3Gender, String child3IsStudent, String string5) throws InterruptedException {

        additionalMembers.addAnotherCh();
        additionalMembers.EnterChild3Name(child3name);
        additionalMembers.EnterChild3Surname(child3Surname);
        additionalMembers.selectChild3Gender(child3Gender);
        additionalMembers.IsChild3StudentOrNot(child3IsStudent);
        additionalMembers.child3DateOfBirth("2003", "Dec", "1");
        additionalMembers.SaveChildDetails();
        additionalMembers.clickContinue();
        Thread.sleep(3000);


    }


}
