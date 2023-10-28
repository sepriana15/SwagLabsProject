package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = {"StepDefinition"},
        features = {"src/test/resources/Features/swagLabs.feature"},
        plugin = {"html:target/swagLab-html-report/html/swaglabs.html"}
)
public class TestRunner {
}
