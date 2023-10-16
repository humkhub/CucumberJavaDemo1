package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/mdrubel/Documents/workspace-original/CucumberJava/src/test/resources/Features/login.feature",
        glue= {"StepDefinations"},
        plugin = {"json:target/cucumber.json"})
public class TestRunner {

}
