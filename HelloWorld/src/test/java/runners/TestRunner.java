package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/resources/FeatureFile.feature",
				glue= {"src/test/java/runners/StepDefinition.java"},
				plugin = { "pretty", "json:target/cucumber-reports/CucumberReport"})
public class TestRunner {
}