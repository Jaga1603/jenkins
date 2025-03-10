package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src\\test\\resources\\featureFiles\\rediffCreateAcc.feature" }, glue = { "stepdefs",
		"Hooks" }, plugin = { "pretty", "html:Reports/cucumber-reports.html"
				},
			monochrome = true

			)
public class RediffRunner extends AbstractTestNGCucumberTests {

}