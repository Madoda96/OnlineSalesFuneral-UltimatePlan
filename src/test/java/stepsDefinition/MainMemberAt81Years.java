package stepsDefinition;

import PageObjects.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MainMemberAt81Years {


    @Steps
    HomePage homePage;
    @Steps
    MemberPage memberPage;

    @Steps
  AdditionalMembers additionalMembers;




    @Given(": Main with Age above restrictions")
    public void main_with_age_above_restrictions() {
        homePage.open();
        homePage.ClickBuyNowFuneralPlans();
        memberPage.EnterEmail("emailzsdc@gmail.com");
        homePage.clickContinueBtn();
    }

    @When(": User captures age above restriction")
    public void user_captures_age_above_restriction() {
        memberPage.SelectTitle("Dr");
        memberPage.EnterName("SOLA");
        memberPage.Entersurname("SALA");
        memberPage.enterMemberIDnum("4207297888098");
        memberPage.enterMobileNum("0825698547");
        memberPage.enterPostalAddress("21 Jump Street");
        memberPage.EnterPostalCode("0152");
        memberPage.selectIncome("R10,000 - R15,000");
        memberPage.selectOccupation("Technician");
        memberPage.selectEducation("University, Technikon, Degree, Diploma");
        memberPage.acceptFICAdecl("Yes");
        memberPage.acceptFicaDeclaration2("Yes");
        memberPage.clickContinueBt();

    }

    @Then(": User should get error message.")
    public void user_should_get_error_message() {
        memberPage.clickContinueBt();
    }

}






//
//    @Given("Main with Age above restrictions {string}, {string}, {string}, {string}, {string}.")
//    public void user_completes_the_required_member_details_information(String title, String memberName, String memberSurname, String IDNumber, String memberMobileNum) {
//
//        memberPage.SelectTitle(title);
//        memberPage.EnterName(memberName);
//        memberPage.Entersurname(memberSurname);
//        memberPage.enterMemberIDnum(IDNumber);
//        memberPage.enterMobileNum(memberMobileNum);
//
//    }
//
//    @Given("User enters {string}, {string}, {string},{string}, {string}.")
//    public void user_enters(String memberPostalAddress, String memberPostalCode, String MonthlyIncome, String MemberOccupation, String MemberEducation) {
//        memberPage.enterPostalAddress(memberPostalAddress);
//        memberPage.EnterPostalCode(memberPostalCode);
//        memberPage.selectIncome(MonthlyIncome);
//        memberPage.selectOccupation(MemberOccupation);
//        memberPage.selectEducation(MemberEducation);
//
//    }
//
//    @Given("User completes fica {string} and {string} and clicks the continue button.")
//    public void user_completes_and_and_clicks_the_continue_button1(String FICA1, String FICA2) {
//        memberPage.acceptFICAdecl(FICA1);
//        memberPage.acceptFicaDeclaration2(FICA2);
//        memberPage.clickContinueBt();
//
//    }
//    @Then("system should display error message(over maximum age)")
//    public void User_should_see_error_message() {
//        System.out.println("Over Age");
//
//
//    }


