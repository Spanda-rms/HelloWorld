package runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\spanda\\Documents\\Automation Workspace\\HelloWorld\\src\\main\\java\\resources\\FeatureFile.feature", glue = {"runners"}
		)
public class TestRunner {
}