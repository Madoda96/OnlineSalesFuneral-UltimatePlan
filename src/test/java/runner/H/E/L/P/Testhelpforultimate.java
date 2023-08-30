package runner.H.E.L.P;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"json:target/cucumber.json" },
        features = "src/test/resources/features/HELP/Clientele_Ultimate_H.E.L.P_Plan.feature",
        glue = "stepsDefinition",
        monochrome = true,
        dryRun = false,
        tags = "@Test"


)

public class Testhelpforultimate {
}
