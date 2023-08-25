package runner.FuneralAndUltimateDignityPlan;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;




@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"json:target/cucumber.json" },
        features = "src/test/resources/features/Ultimate Dignity Plan/FuneralDignityPlan.feature",
        glue = "stepsDefinition",
        monochrome = true,
        tags = "@ID",
        dryRun = false


)
public class UltimateDignityPlan {


}
