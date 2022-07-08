package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/linkedinlearning/cucumbercourser/features"},
		glue = {"stepdefinitions"},
// 		tags = {"@SmokeTest or @RegularTest"},
// 		tags = {"not @RegularTest"},
// 		tags = {"@SmokeTest and @RegularTest"},
		plugin = {"pretty"}
)
public class MenuManagementTest {
	
}
