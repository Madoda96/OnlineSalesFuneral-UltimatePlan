package stepsDefinition.DignityPlan;

import PageObjects.HomePage;
import PageObjects.MemberPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import stepsDefinition.DignityPlan.MemberDetails;

import java.util.Random;

public class MultiplePolicyNotAllowedForMember {

    @Steps
    HomePage homePage;
    @Steps
    MemberPage memberPage;

    @Steps
    MemberDetails memberDetails;
    @Given(": Member whom have policy for same products")
    public void member_whom_have_policy_for_same_products() throws InterruptedException {
            homePage.open();
            homePage.ClickBuyNowFuneralPlans();

             Random randomGenerator = new Random();
             int randomInt = randomGenerator.nextInt(1000);
             memberPage.EnterEmail("Address"+ randomInt +"@gmail.com");
             homePage.clickContinueBtn();

    }
    @Given(": Open Browser and capture member details")
    public void open_browser_and_capture_member_details() {
            memberPage.SelectTitle("Dr");
            memberPage.EnterName("SOLA");
            memberPage.Entersurname("SALA");
            memberPage.enterMemberIDnum("9707025755977");
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
    @Then(": Message that confirm multiple policy should displayed")
    public void message_that_confirm_multiple_policy_should_displayed() {

        memberPage.message_that_confirm_multiple_policy_should_displayed();
    }
}
