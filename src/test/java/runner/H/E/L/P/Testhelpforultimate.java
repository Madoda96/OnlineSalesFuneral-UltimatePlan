package runner.H.E.L.P;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty", "json:target/CucumberTestReport.json"},
        features = "src/test/resources/features/HELP/Clientele_Ultimate_H.E.L.P_Plan.feature",
        glue = "stepsDefinition",
        monochrome = true,
        dryRun = false



)

public class Testhelpforultimate {
}
