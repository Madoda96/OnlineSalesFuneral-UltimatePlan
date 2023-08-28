package runner.H.E.L.P;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"json:target/cucumber.json" },
        features = "src/test/resources/features/HELP",
        glue = "stepsDefinition",
        monochrome = true,
        dryRun = false

)

public class Testerhelpforultimate {
}
