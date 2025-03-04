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
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter: ",
                "pretty",
                "rerun:target/failedScenario.txt"
        },
        features = "src/test/resources/features",
        glue= "stepdefinitions",
        tags = "@SignUp",
        dryRun = false

)

public class Runner {
}
