package stepsDefinition;

import PageObjects.AdditionalMembers;
import PageObjects.BeneficiaryDetails;
import PageObjects.PayerDetails;
import PageObjects.confirmationPage;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class MainMemberWithMaximumExtendedMembers {


    @Steps
    AdditionalMembers additionalMembers;

    @Steps
    BeneficiaryDetails beneficiaryDetails;

    @Steps
    PayerDetails payerDetails;
    @Steps
    confirmationPage confirmationPage;

    @Then("User adds first extended member {string},{string},{string},{string},{string}, {string}.")
    public void user_adds_first_extended_member(String ExtendedmemberTitle1, String ExtendedMemberName, String ExtendedMemberSurname, String ExtendedMemberGender, String ExtendedMmeberDOB, String ExtendedMemberRelation) throws InterruptedException {
        Thread.sleep(3000);
        additionalMembers.clickExtendedMemberCheckbx();
        additionalMembers.selectExtMemberTitle1(ExtendedmemberTitle1);
        additionalMembers.EnterExtendedMemberName1(ExtendedMemberName);
        additionalMembers.EnterExtendedMemberSurname(ExtendedMemberSurname);
        additionalMembers.SelectExtendedMemberGender1(ExtendedMemberGender);

        // adding extended member that is 19,  modify year based on test case requirements
        additionalMembers.EnterExtendedMmemberDOB1("2003", "Sep", "14");
        additionalMembers.SelectExtendedMemberRelation1(ExtendedMemberRelation);
        Thread.sleep(3000);

        additionalMembers.SaveExtendedMemberDetails();


    }

    @Then("User adds second extended member {string},{string},{string},{string},{string}, {string}.")
    public void user_adds_second_extended_member(String Extendedmember2Title1, String ExtendedMember2Name, String ExtendedMember2Surname, String ExtendedMember2Gender, String ExtendedMmeber2DOB, String ExtendedMember2Relation) throws InterruptedException {


        additionalMembers.AddAnotherExtendedMember();
        additionalMembers.selectExtMemberTitle2(Extendedmember2Title1);
        additionalMembers.EnterExtendedMemberName2(ExtendedMember2Name);
        additionalMembers.EnterExtendedMemberSurname2(ExtendedMember2Surname);
        additionalMembers.SelectExtendedMemberGender2(ExtendedMember2Gender);

        // adding extended member that is 25, modify year based on test case requirements
        additionalMembers.EnterExtendedMmemberDOB2("1998", "Apr", "8");
        additionalMembers.SelectExtendedMemberRelation2(ExtendedMember2Relation);
        additionalMembers.SaveExtendedMemberDetails();
        Thread.sleep(3000);
    }

    @Then("User adds third extended member {string},{string},{string},{string},{string}, {string}.")
    public void user_adds_third_extended_member(String Extendedmember3Title1, String ExtendedMember3Name, String ExtendedMember3Surname, String ExtendedMember3Gender, String ExtendedMmeber3DOB, String ExtendedMember3Relation) throws InterruptedException {

        additionalMembers.AddAnotherExtendedMember();
        additionalMembers.selectExtMemberTitl3(Extendedmember3Title1);
        additionalMembers.EnterExtendedMemberName3(ExtendedMember3Name);
        additionalMembers.EnterExtendedMemberSurname3(ExtendedMember3Surname);
        additionalMembers.SelectExtendedMemberGender3(ExtendedMember3Gender);

        // adding extended member that is 36, modify year based on test case requirements
        additionalMembers.EnterExtendedMmemberDOB3("1986", "Oct", "20");
        additionalMembers.SelectExtendedMemberRelation3(ExtendedMember3Relation);
        additionalMembers.SaveExtendedMemberDetails();
        Thread.sleep(3000);
    }

    @Then("User adds fourth extended member {string},{string},{string},{string},{string}, {string}.")
    public void user_adds_fourth_extended_member(String Extendedmember4Title1, String ExtendedMember4Name, String ExtendedMember4Surname, String ExtendedMember4Gender, String ExtendedMmebe4rDOB, String ExtendedMember4Relation) throws InterruptedException {
        additionalMembers.AddAnotherExtendedMember();
        additionalMembers.selectExtMemberTitle4(Extendedmember4Title1);
        additionalMembers.EnterExtendedMemberName4(ExtendedMember4Name);
        additionalMembers.EnterExtendedMemberSurname4(ExtendedMember4Surname);
        additionalMembers.SelectExtendedMemberGender4(ExtendedMember4Gender);

        // adding extended member that is 41, modify year based on test case requirements
        additionalMembers.EnterExtendedMmemberDOB4("1982", "Feb", "24");
        additionalMembers.SelectExtendedMemberRelation4(ExtendedMember4Relation);
        additionalMembers.SaveExtendedMemberDetails();
        Thread.sleep(3000);
    }

    @Then("User adds fifth extended member {string},{string},{string},{string},{string}, {string}.")
    public void user_adds_fifth_extended_member(String Extendedmember5Title1, String ExtendedMember5Name, String ExtendedMember5Surname, String ExtendedMember5Gender, String ExtendedMmeber5DOB, String ExtendedMember5Relation) throws InterruptedException {
        additionalMembers.AddAnotherExtendedMember();
        additionalMembers.selectExtMemberTitle5(Extendedmember5Title1);
        additionalMembers.EnterExtendedMemberName5(ExtendedMember5Name);
        additionalMembers.EnterExtendedMemberSurname5(ExtendedMember5Surname);
        additionalMembers.SelectExtendedMemberGender5(ExtendedMember5Gender);

        // adding extended member that is 59, modify year based on test case requirements
        additionalMembers.EnterExtendedMmemberDOB5("1964", "Feb", "5");
        additionalMembers.SelectExtendedMemberRelation5(ExtendedMember5Relation);
        additionalMembers.SaveExtendedMemberDetails();
        Thread.sleep(3000);
    }

    @Then("User adds sixth extended member {string},{string},{string},{string},{string}, {string}.")
    public void user_adds_sixth_extended_member(String Extendedmember6Title1, String ExtendedMember6Name, String ExtendedMember6Surname, String ExtendedMember6Gender, String ExtendedMmeber6DOB, String ExtendedMember6Relation) throws InterruptedException {
        additionalMembers.AddAnotherExtendedMember();
        additionalMembers.selectExtMemberTitle6(Extendedmember6Title1);
        additionalMembers.EnterExtendedMemberName6(ExtendedMember6Name);
        additionalMembers.EnterExtendedMemberSurname6(ExtendedMember6Surname);
        additionalMembers.SelectExtendedMemberGender6(ExtendedMember6Gender);

        // adding extended member that is 60, modify year based on test case requirements
        additionalMembers.EnterExtendedMmemberDOB6("1963", "May", "30");
        additionalMembers.SelectExtendedMemberRelation6(ExtendedMember6Relation);
        Thread.sleep(3000);
        additionalMembers.SaveExtendedMemberDetails();
    }

    @Then("User adds seventh extended member {string},{string},{string},{string},{string}, {string}.")
    public void user_adds_seventh_extended_member(String Extendedmember7Title1, String ExtendedMember7Name, String ExtendedMember7Surname, String ExtendedMember7Gender, String ExtendedMmeber7DOB, String ExtendedMember7Relation) throws InterruptedException {
        additionalMembers.AddAnotherExtendedMember();
        additionalMembers.selectExtMemberTitle7(Extendedmember7Title1);
        additionalMembers.EnterExtendedMemberName7(ExtendedMember7Name);
        additionalMembers.EnterExtendedMemberSurname7(ExtendedMember7Surname);
        additionalMembers.SelectExtendedMemberGender7(ExtendedMember7Gender);

        // adding extended member that is 67, modify year based on test case requirements
        additionalMembers.EnterExtendedMmemberDOB7("1956", "Jun", "8");
        additionalMembers.SelectExtendedMemberRelation7(ExtendedMember7Relation);
        additionalMembers.SaveExtendedMemberDetails();
        Thread.sleep(3000);

    }

    @Then("User adds eighth extended member {string},{string},{string},{string},{string}, {string}.")
    public void user_adds_eighth_extended_member(String Extendedmember8Title1, String ExtendedMember8Name, String ExtendedMember8Surname, String ExtendedMember8Gender, String ExtendedMmeber8DOB, String ExtendedMember8Relation) throws InterruptedException {

        additionalMembers.AddAnotherExtendedMember();
        additionalMembers.selectExtMemberTitle8(Extendedmember8Title1);
        additionalMembers.EnterExtendedMemberName8(ExtendedMember8Name);
        additionalMembers.EnterExtendedMemberSurname8(ExtendedMember8Surname);
        additionalMembers.SelectExtendedMemberGender8(ExtendedMember8Gender);

        // adding extended member that is 70, modify year based on test case requirements
        additionalMembers.EnterExtendedMmemberDOB8("1952", "Nov", "12");
        additionalMembers.SelectExtendedMemberRelation8(ExtendedMember8Relation);

        additionalMembers.SaveExtendedMemberDetails();
        Thread.sleep(3000);
        additionalMembers.clickContinue();
        Thread.sleep(3000);

    }

    @Then("User add a member estate beneficiary {string}, {string}, {string},{string}, {string}")
    public void user_add_a_member_estate_beneficiary(String BeneficiaryTitle, String BeneficiaryName, String BeneficiarySurname, String BeneficiaryRelationship, String BeneficiaryAllocation) throws InterruptedException {
        beneficiaryDetails.SelectBeneficiaryTite(BeneficiaryTitle);
        beneficiaryDetails.EnterBeneficiaryName(BeneficiaryName);
        beneficiaryDetails.EnterBeneficiarySurname(BeneficiarySurname);
        beneficiaryDetails.SelectBeneficiaryRelationship(BeneficiaryRelationship);
        beneficiaryDetails.clickContinueButtn();
        Thread.sleep(3000);
    }

    @Then("user enters payer details {string},{string},{string},{string},{string}")
    public void user_enters_payer_details(String BankName, String AccountType, String AccountNumber, String DebitDate, String DebiCheck) throws InterruptedException {
        payerDetails.SelectBankName(BankName);
        payerDetails.SelectAccountType(AccountType);
        payerDetails.EnterAccNumber(AccountNumber);
        payerDetails.EnterDebitDate(DebitDate);
        payerDetails.Cellphone_on_hand(DebiCheck);
        payerDetails.debitBankAcc();
        payerDetails.clickContinueBtn();
        Thread.sleep(5000);


    }

    @Then("user should get a generated policy number.")
    public void user_should_get_a_generated_policy_number() throws InterruptedException {

        confirmationPage.viewPremium();
        confirmationPage.ViewWhoIsCovered();
        confirmationPage.ViewBenefits();
        confirmationPage.AnnualIncrease();
        confirmationPage.clickTermsAndConditions();

        confirmationPage.ClickConfirmBtn();
        Thread.sleep(3000);


        confirmationPage.ViewThankYouMessage();
        confirmationPage.finalPremiumMnth();
        confirmationPage.PolicyNumber();


    }

    @Then("User should see minimum cover of ten thousand for a new premium")
    public void user_should_see_minimum_cover_of_ten_thousand_for_a_new_premium() throws InterruptedException {

        additionalMembers.verifyMiniumCoverAmountForExtendedMembers0_and_50();


    }

    @Then("User should see minimum cover of five thousand for a new premium")
    public void user_should_see_minimum_cover_of_five_thousand_for_a_new_premium() {
        additionalMembers.verifyMiniumCoverAmountForExtendedMembers51_and81();
    }

    @Then("User adds a VC rewards and clicks the continue button")
    public void user_adds_a_vc_rewards_and_clicks_the_continue_button() {
        additionalMembers.selectBlueReward();
        additionalMembers.checkAccessToDeviceForBlue();
        additionalMembers.clickContinue();

    }

    @Then("user confirms captured policy information with VC rewards.")
    public void user_confirms_captured_policy_information_with_vc_rewards() throws InterruptedException {
        confirmationPage.NonInsuranceInfo();
    }

    @Then("User adds a VS rewards")
    public void user_adds_a_vs_rewards() throws InterruptedException {

        additionalMembers.selectSilverRewards();
        additionalMembers.checkAccessToDeviceForSilver();
        additionalMembers.clickContinue();
        Thread.sleep(3000);


    }

    @Then("user confirms captured policy information with VS rewards.")
    public void user_confirms_captured_policy_information_with_vs_rewards() throws InterruptedException {
        Thread.sleep(5000);
        confirmationPage.NonInsuranceInfo();


    }

    @Then("User adds an extended member{string},{string},{string},{string},{string}, {string}.")
    public void User_adds_an_extended_member(String ExtendedmemberTitle1, String ExtendedMemberName, String ExtendedMemberSurname, String ExtendedMemberGender, String ExtendedMmeberDOB, String ExtendedMemberRelation) throws InterruptedException {

        additionalMembers.clickExtendedMemberCheckbx();
        additionalMembers.selectExtMemberTitle1(ExtendedmemberTitle1);
        additionalMembers.EnterExtendedMemberName1(ExtendedMemberName);
        additionalMembers.EnterExtendedMemberSurname(ExtendedMemberSurname);
        additionalMembers.SelectExtendedMemberGender1(ExtendedMemberGender);

        // adding extended member that is 19,  modify year based on test case requirements
        additionalMembers.EnterExtendedMmemberDOB1("1966", "Sep", "14");
        additionalMembers.SelectExtendedMemberRelation1(ExtendedMemberRelation);
        Thread.sleep(3000);
    }

    @Then("User adds an extended member above 51 but less than 81 {string},{string},{string},{string},{string}, {string}.")
    public void User_adds_an_extended_member_above_51_but_less_than_81(String ExtendedmemberTitle1, String ExtendedMemberName, String ExtendedMemberSurname, String ExtendedMemberGender, String ExtendedMmeberDOB, String ExtendedMemberRelation) throws InterruptedException {

        additionalMembers.clickExtendedMemberCheckbx();
        additionalMembers.selectExtMemberTitle1(ExtendedmemberTitle1);
        additionalMembers.EnterExtendedMemberName1(ExtendedMemberName);
        additionalMembers.EnterExtendedMemberSurname(ExtendedMemberSurname);
        additionalMembers.SelectExtendedMemberGender1(ExtendedMemberGender);

        // adding extended member that is 19,  modify year based on test case requirements
        additionalMembers.EnterExtendedMmemberDOB1("1966", "Sep", "14");
        additionalMembers.SelectExtendedMemberRelation1(ExtendedMemberRelation);
        Thread.sleep(3000);


        additionalMembers.SaveExtendedMemberDetails();


    }


}
