package stepsDefinition.UltimateDignityPlan;

import PageObjects.FuneralPlans.AdditionalMembers;
import PageObjects.FuneralPlans.MemberPage;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class MainMember18andAbove {

    @Steps
    AdditionalMembers additionalMembers;
    @Steps
    MemberPage memberPage;

    @Then("User shouldn't be able to proceed if they are below eighteen.")
    public void user_shouldn_t_be_able_to_proceed_if_they_are_below_eighteen() {

        memberPage.IDNumfieldValidated();


    }

    @Then("User should be able to proceed to with application if they are above eighteen.")
    public void user_should_be_able_to_proceed_to_with_application_if_they_are_above_eighteen() {


        additionalMembers.VerifyadditionalMembersPage();

    }

    @Then("User should be able to proceed to with application if they are above eighteen and see maximum cover.")
    public void user_should_be_able_to_proceed_to_with_application_if_they_are_above_eighteen_and_see_maximum_cover() {


        memberPage.MaximumCover();


    }
}
