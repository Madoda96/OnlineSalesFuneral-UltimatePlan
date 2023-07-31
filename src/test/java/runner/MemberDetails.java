package runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty"},
        features = "src/test/resources/features/MemberDetails.feature",
        glue = {"stepsDefinition"},
        publish = true,
        stepNotifications = true
)
//

public class MemberDetails {
}
