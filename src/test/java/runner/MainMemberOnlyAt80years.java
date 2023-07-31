package runner;


        import io.cucumber.junit.CucumberOptions;
        import net.serenitybdd.cucumber.CucumberWithSerenity;
        import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty"},
        features = "src/test/resources/features/FuneralDignityPlan/MainMemberOnlyAt80years.feature",  //funeralDignityPlan.feature
        glue = "stepsDefinition")

public class MainMemberOnlyAt80years {



}