package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        features = "src/test/resources/features/Ultimate Dignity Plan/FuneralDignityPlan.feature",
        glue = "stepsDefinition",
         dryRun = false)

public class funeraldignityplan {
}
