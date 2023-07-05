package stepsDefinition;

import PageObjects.BeneficiaryDetails;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ContinueSteps {

    @Steps
    BeneficiaryDetails beneficiaryDetails;


    @Then("User clicks continue to payer details page")
    public void User_clicks_continue_to_payer_details_page() throws InterruptedException {
        beneficiaryDetails.clickContinueButtn();
        Thread.sleep(4000);
    }

}
