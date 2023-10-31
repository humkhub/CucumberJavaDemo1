package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/rawaiyad/Documents/workspace/CucumberJava/src/test/resources/Features/login.feature",
        glue= {"steps"},
        plugin = {"json:target/cucumber.json"})
public class TestRunner {

}
