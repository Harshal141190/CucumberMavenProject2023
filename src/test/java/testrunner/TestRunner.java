package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
	features= ".//Features/Admin1.feature",
	glue= "stepdefinition1",
	dryRun=false,
	monochrome=true,
	publish=true,
	tags="@Smoke"
			)
	
public class TestRunner {
	
	

}
