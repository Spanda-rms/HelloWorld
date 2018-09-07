package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/resources/FeatureFile.feature",
//		glue= {"StepDefinition"},
plugin = { "html:target/cucumber-reports",
		"junit:target/cucumber-junit.xml",
        "json:target/cucumber.json",
        "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json"})
public class TestRunner {
}