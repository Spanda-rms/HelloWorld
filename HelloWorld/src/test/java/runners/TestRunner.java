package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/resources/FeatureFile.feature",
//		glue= {"StepDefinition"},
plugin = { "html:target/cucumber-reports",
		   "json:target/cucumber.json"})
public class TestRunner {
}