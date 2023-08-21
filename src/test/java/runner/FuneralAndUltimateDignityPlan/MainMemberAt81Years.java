
package runner.FuneralAndUltimateDignityPlan;


        import io.cucumber.junit.CucumberOptions;
        import net.serenitybdd.cucumber.CucumberWithSerenity;
        import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty"},
        features = "src/test/resources/features/FuneralDignityPlan/MainMemberAt81Years.feature",  //funeralDignityPlan.feature
        glue = "stepsDefinition")

public class MainMemberAt81Years {

}
