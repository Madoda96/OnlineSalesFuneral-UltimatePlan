package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;




@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty","html:test-output"},
        features = "src/test/resources/features/Ultimate Dignity Plan",
        glue = "stepsDefinition",
        monochrome = true,
        dryRun = false,
        tags = "@NegativTest"

)
 //        tags = "@Regressionz"  )
public class TesterUltimateDignityPlan {






}
