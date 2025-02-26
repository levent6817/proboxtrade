package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/reports/html-report.html",
                "json:target/reports/json-report.json",
                "junit:target/reports/xml-report.xml",
                "com.avenstack.extentreports.cucumber.adapter.ExtentCucumberAdapter",
                "pretty",
                "rerun:target/failedScenario.txt"
        },
        features = "@target/failedScenarios.txt",
        glue= "stepdefinitions"


)

public class FailedRunner {
}
