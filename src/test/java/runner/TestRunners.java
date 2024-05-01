package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/features",
        glue = "stepDefinitions",
        plugin = {"pretty", "html:target/cucumber-htm-report"}
)
public class TestRunners {

}