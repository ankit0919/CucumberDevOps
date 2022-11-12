package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Feature" ,
        glue = {"stepDefinitions"},
        monochrome = true,
        plugin = {"pretty",
                "json:target/cucumber.json",
                "html:/target/HtmlReports"},
        tags = "@LoginTest"
)

public class TestRunner {
}
