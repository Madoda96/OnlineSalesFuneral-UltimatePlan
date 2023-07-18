package runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports"},
        features = "src/test/resources/features/Ultimate Dignity Plan",
        glue = "stepsDefinition",
        monochrome = true,
        dryRun = false,
         tags = "Zippy"  )
public class TesterUltimateDignityPlan {
}
