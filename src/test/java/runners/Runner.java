package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
        "json:target/cucumber.json",},
        features = "src/test/resources/Feature",
        glue = "stepDefinitions",
        tags = "@teknosa",
        dryRun = true
)

public class Runner {
}
