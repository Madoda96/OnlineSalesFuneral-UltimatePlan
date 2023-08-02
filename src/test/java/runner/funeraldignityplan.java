package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty"},
        features = "src/test/resources/features/Ultimate Dignity Plan/FuneralDignityPlan.feature",
        glue = "stepsDefinition",
        tags = "@Test1",
         dryRun = false)

public class funeraldignityplan {
}
