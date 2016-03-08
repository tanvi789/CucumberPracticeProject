import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/",
        tags = {"~@WIP"},
        plugin = "html:target/html"
)
public class RunCucumber {

}
