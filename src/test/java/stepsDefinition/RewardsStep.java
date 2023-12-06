package stepsDefinition;

import PageObjects.FuneralPlans.*;
import PageObjects.HomePage.HomePage;
import PageObjects.ID_Number;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;



public class RewardsStep {


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



    @Given("User is on the dignity plan page and they enter email")
    public void user_is_on_the_dignity_plan_page_and_they_enter() {
        homePage.OpenWebsite();
        homePage.ClickBuyNowFuneralPlans();
        memberPage.EnterEmail(memberPage.GeneratedEmailAddress());
        homePage.clickContinueBtn();
    }

    @Given("User completes the required  Member details information {string}, {string}, {string}, {string}, {string}.")
    public void user_completes_the_required_member_details_information(String title, String memberName, String memberSurname, String memberMobileNum, String IDNomber) throws InterruptedException {

        memberPage.SelectTitle(title);
        memberPage.EnterName(memberName);
        memberPage.Entersurname(memberSurname);
        memberPage.enterMobileNum(memberMobileNum);
        memberPage.enterMemberIDnum(IDNomber);
//       memberPage.SelectDifferentAmnt();

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
    public void user_completes_and_and_clicks_the_continue_button(String FICA1, String FICA2) throws InterruptedException {

        memberPage.acceptFICAdecl(FICA1);
        memberPage.acceptFicaDeclaration2(FICA2);
        memberPage.clickContinueBtMember();
    }
}
