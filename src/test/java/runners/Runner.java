package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
        //"json:target/cucumber.json",},
                "html:target/cucumber-reports/regression.html"},  // raporlama için kullanılır
        features = "src/test/resources/Feature",
        glue = "stepDefinitions",
        tags = "@teknosa",
        dryRun = false
)

public class
Runner {
}
