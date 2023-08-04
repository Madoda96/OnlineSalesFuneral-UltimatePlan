package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;




@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty","json:target/cucumber.json" },
        features = "src/test/resources/features/Ultimate Dignity Plan/UltimateDignityPlan.feature",
        glue = "stepsDefinition",
        monochrome = true
        ,tags = "@StaffMemberTest"

)
 //        tags = "@Regressionz"  )
public class TesterUltimateDignityPlan {






}
