package stepsDefinition.DignityPlan;

import PageObjects.HomePage.HomePage;
import PageObjects.FuneralPlans.MemberPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;;

public class MemberDetails {





    @Steps
    HomePage homePage;
    @Steps
    MemberPage memberDetailsPage;


    @Given("User is on Member Details Page")
    public void user_is_on_member_details_page() throws InterruptedException {
        homePage.open();
        memberDetailsPage.EnterEmail("test00@gmail.com");
        homePage.clickContinueBtn();
        Thread.sleep(10000);


    }

    @When("User should be able to complete required information")
    public void user_should_be_able_to_complete_required_information() throws InterruptedException {
        memberDetailsPage.SelectTitle("Dr");
        memberDetailsPage.EnterName("Skhaventure");
        memberDetailsPage.Entersurname("Skavi");
        memberDetailsPage.Entersurname("SUPERMAN");
   //     memberDetailsPage.enterMemberIDnum("8705076328083");
        memberDetailsPage.enterMobileNum("0728712953");
        memberDetailsPage.enterPostalAddress("21 Jump Street");
        memberDetailsPage.EnterPostalCode("0152");
        memberDetailsPage.selectIncome("R10,000 - R15,000");
        memberDetailsPage.selectOccupation("Technician");
        memberDetailsPage.selectEducation("University, Technikon, Degree, Diploma");
        memberDetailsPage.acceptFICAdecl("Yes");
        memberDetailsPage.acceptFicaDeclaration2("Yes");
        memberDetailsPage.clickContinueBt();

    }
    @Then("User should be able to click Continue button, and Navigate to Additional Page.")
    public void user_should_be_able_to_click_continue_button_and_navigate_to_additional_page(){
////
        System.out.println("Test");

    }
    @Then("user should not be able to proceed with the application.")
    public void user_should_not_be_able_to_proceed_with_the_application() {

    }




}



