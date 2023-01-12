package TestRunner;




import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions
(
		features=".//Features/login2.feature",
		glue={"StepDefinition"},
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:target/HtmlReports"}
	
					  
		
		)

public class TestRun {
	}
