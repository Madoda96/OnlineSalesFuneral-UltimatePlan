package stepsDefinition.UltimateDignityPlan;

import PageObjects.AdditionalMembers;
import PageObjects.BeneficiaryDetails;
import PageObjects.PayerDetails;
import PageObjects.confirmationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class MemberWithTwoChildrenAbove18ButNotStudents {
    @Steps
    AdditionalMembers additionalMembers;
    @Steps
    BeneficiaryDetails beneficiaryDetails;
    @Steps
    PayerDetails payerDetails;

    @Steps
    confirmationPage confirmationPage;



    @Given("User adds the first child {string},{string},{string},{string},{string} that is above eighteen years old")
    public void user_adds_the_first_child_that_is_above_eighteen_years_old(String child1Name, String child1Surname, String child1Gender, String child1IsStudent, String childDOB) throws InterruptedException {

        Thread.sleep(3000);
        additionalMembers.addChildrencheckBox();
        additionalMembers.EnterChildName(child1Name);
        additionalMembers.EnterChildSurname(child1Surname);
        additionalMembers.selectChildGender(child1Gender);
        additionalMembers.IsChildStudentOrNot(child1IsStudent);
        additionalMembers.childDateOfBirth("2003","Dec","1");
        additionalMembers.SaveChildDetails();




    }

    @Given("User User adds the second child {string},{string},{string},{string},{string} that above eighteen years old")
    public void user_user_adds_the_second_child_that_above_eighteen_years_old(String child2Name, String child2Surname, String child2Gender, String child2IsStudent, String childDOB) throws InterruptedException {

        additionalMembers.addAnotherCh();
        additionalMembers.EnterChild2Name(child2Name);
        additionalMembers.EnterChild2Surname(child2Surname);
        additionalMembers.selectChild2Gender(child2Gender);
        additionalMembers.IsChild2StudentOrNot(child2IsStudent);
        additionalMembers.child2DateOfBirth("2003","Dec","1");
        additionalMembers.SaveChildDetails();
        Thread.sleep(3000);

    }

    @Given("user enters Beneficiary details {string}, {string}, {string},{string}, {string}.")
    public void user_enters_beneficiary_details(String beneficairyTitle, String beneficiaryName, String beneficiarySurname, String beneficiaryRelationship, String Allocation) throws InterruptedException {
        beneficiaryDetails.SelectBeneficiaryTite(beneficairyTitle);
        beneficiaryDetails.EnterBeneficiaryName(beneficiaryName);

        beneficiaryDetails.EnterBeneficiarySurname(beneficiarySurname);
//        beneficiaryDetails.EnterDateOfBirth("1", "Dec", "2003");
        beneficiaryDetails.SelectBeneficiaryRelationship(beneficiaryRelationship);
        beneficiaryDetails.SelectPercentageAllocation(Allocation);
//        beneficiaryDetails.clickSaveDetails();
        Thread.sleep(3000);
        beneficiaryDetails.clickContinueButtn();
        Thread.sleep(3000);
    }

    @Given("user enters payer details {string},{string},{string},{string},{string}.")
    public void user_enters_payer_details(String bankName, String accountType, String accountNumber, String debitDate, String Debicheck) throws InterruptedException {

        payerDetails.SelectBankName(bankName);
        payerDetails.SelectAccountType(accountType);
        payerDetails.EnterAccNumber(accountNumber);
        payerDetails.EnterDebitDate(debitDate);
        payerDetails.Cellphone_on_hand(Debicheck);
        payerDetails.debitBankAcc();
        payerDetails.clickContinueBtn();
        Thread.sleep(3000);
    }

    @And("user confirms captured policy information and get a policy number.")
    public void user_confirms_captured_policy_information_and_get_a_policy_number() throws InterruptedException {
        // duplicating ac
        confirmationPage.viewPremium();
        confirmationPage.ViewWhoIsCovered();
        confirmationPage.ViewBenefits();
        confirmationPage.AnnualIncrease();
        confirmationPage.AcceptTermsAndConditions();
        confirmationPage.ClickConfirmBtn();
        Thread.sleep(3000);

        confirmationPage.ViewThankYouMessage();
        confirmationPage.finalPremiumMnth();
        confirmationPage.PolicyNumber();


    }

    @Then("policy number shouldn't be generated due to age of children")
    public void policy_number_shouldn_t_be_generated_due_to_age_of_children() throws InterruptedException {
        Thread.sleep(3000);
        confirmationPage.AgeErrorMessage();


    }

    @Then("user clicks continue to beneficiary page")
    public void user_clicks_continue_to_beneficiary_page() {
        additionalMembers.clickContinue();
    }


}
