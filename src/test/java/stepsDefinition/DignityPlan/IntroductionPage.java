package stepsDefinition.DignityPlan;

import PageObjects.FuneralPlans.GetQoutationPage;
import PageObjects.HomePage.HomePage;
import PageObjects.FuneralPlans.MemberPage;
import PageObjects.ID_Number;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class IntroductionPage {

    @Steps
    HomePage homePage;
    @Steps
    MemberPage memberPage;

    @Steps
    GetQoutationPage getQoutationPage;
    @Steps
    ID_Number idNumber;

    @Given("User is on the introduction page")
    public void user_is_on_the_introduction_page() {
        homePage.OpenWebsite();
        homePage.ClickBuyNowFuneralPlans();
    }

    @Then("user should be able to see the OR and OU options.")
    public void user_should_be_able_to_see_the_or_and_ou_options() {
        memberPage.FuneraldignityPlanOption();
        memberPage.FuneralUltimatePlanOption();

    }

    @Given("User is on the Funeral dignity plan page and they enter email")
    public void user_has_selected_Funeral_dignity_plan_and_they_enter() throws InterruptedException {



        homePage.OpenWebsite();
        homePage.ClickBuyNowFuneralPlans();
        memberPage.FuneraldignityPlanOption();
        memberPage.EnterEmail(memberPage.GeneratedEmailAddress());
        homePage.clickContinueBtn();
        Thread.sleep(3000);

    }


    @Given("User is on the Funeral dignity plan page they enter email and they are of age {string}")
    public void user_is_on_the_funeral_dignity_plan_page_they_enter_email_and_they_are(String age) throws InterruptedException, IOException {



        idNumber.OpenIDnumberGeneratorWebsite();
        idNumber.enterAge(age);

        homePage.OpenWebsite();
        homePage.ClickBuyNowFuneralPlans();
        memberPage.FuneraldignityPlanOption();
        memberPage.EnterEmail(memberPage.GeneratedEmailAddress());
        homePage.clickContinueBtn();
        Thread.sleep(3000);
    }


    @Given("User is on the online sales home page")
    public void user_is_on_the_online_sales_home_page() throws InterruptedException {
        homePage.OpenWebsite();
        Thread.sleep(3000);
    }
    @When("user clicks the get quote button.")
    public void user_clicks_the_get_quote_button() {
        homePage.GetAQuoteFuneralPlans();
    }
    @When("enters {string} , {string} ,{string}, {string} , {string} , {string}.")
    public void enters(String Fullname, String Contactnumber, String EmailAddress, String dayOfDob, String MonthofDob, String YearofDob) throws InterruptedException {

        getQoutationPage.switchToFrame();
        getQoutationPage.EnterFullName(Fullname);
        getQoutationPage.EnterContactNumber(Contactnumber);
        getQoutationPage.EnterEmailAddress(EmailAddress);
        getQoutationPage.dayOfDOB(dayOfDob);
        getQoutationPage.monthOfDOB(MonthofDob);
        getQoutationPage.YearOfDOB(YearofDob);
        Thread.sleep(3000);
    }
    @When("user chooses a plan {string} and cover type {string}.")
    public void user_chooses_a_plan_and_cover_type(String ChooseYourPlan, String CoverType) {
       getQoutationPage.SelectPlanType(ChooseYourPlan);
       getQoutationPage.SelectCoverType(CoverType);
    }
    @When("user chooses the cover amount and adds two additional members {string}, {string}")
    public void user_chooses_the_cover_amount_and_adds_two_additional_members(String Coveramnt, String additionalmem) {
        getQoutationPage.SelectCoverAmount(Coveramnt);
        getQoutationPage.SelectAddAnExtendedFamilyMember(additionalmem);
    }

    @When("user selects age of {string} and {string}.")
    public void user_selects_age_of_and(String member1Age, String memeber2Age) {
        getQoutationPage.selectAddMem1Age(member1Age);
        getQoutationPage.AddAnotherFamMem();
        getQoutationPage.selectAddMem2Age(memeber2Age);
    }

    @When("user clicks the submit button.")
    public void user_clicks_the_submit_button() throws InterruptedException {
        getQoutationPage.clickSubmit();
        Thread.sleep(4000);
    }
    @Then("user should be able to see a quotation.")
    public void user_should_be_able_to_see_a_quotation() {
       getQoutationPage.CoverInformation();
    }









}
