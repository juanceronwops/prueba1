package webops.automation.java.testing.cucumber.hooks;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/webops/automation/java/testing/features",
        glue = {"webops/automation/java/testing/stepDefinitions", "webops/automation/java/testing/cucumber/hooks"},
        plugin = {"pretty", "json:target/cucumber-json/vanin-automation-tests.json"}
)

public class TestRunner{}
