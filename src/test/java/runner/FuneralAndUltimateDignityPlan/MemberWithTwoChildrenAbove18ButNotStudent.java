package runner.FuneralAndUltimateDignityPlan;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty"},
        features = "src/test/resources/features/FuneralDignityPlan/MemberWithTwoChildrenAbove18ButNotStudents.feature",
        glue = "stepsDefinition",
        dryRun = false)

public class MemberWithTwoChildrenAbove18ButNotStudent {
}
