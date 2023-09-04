package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(
		
		features=".//Features/Facebook.feature",
		glue="stepdefinition1",
		dryRun=false,
		monochrome=true,
		publish=true,
		tags="@SignUp"
				
	)

public class TestRunnerFacebook {
	
	

}
