package runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\spanda\\git\\repository\\HelloWorld\\src\\main\\java\\FeatureFile.feature", glue= {"StepDefinition"},
		plugin = { "pretty" },
		monochrome = true
		)
public class TestRunner {
}