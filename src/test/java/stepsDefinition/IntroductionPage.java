package stepsDefinition;

import PageObjects.HomePage;
import PageObjects.MemberPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class IntroductionPage {

    @Steps
    HomePage homePage;
    @Steps
    MemberPage memberPage;

    @Given("User is on the introduction page")
    public void user_is_on_the_introduction_page() {
        homePage.open();
        homePage.ClickBuyNowFuneralPlans();
    }

    @Then("user should be able to see the OR and OU options.")
    public void user_should_be_able_to_see_the_or_and_ou_options() {
        memberPage.FuneraldignityPlanOption();
        memberPage.FuneralUltimatePlanOption();

    }
}
