package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				features="C://Users//Lohit//eclipse-workspace//nopCommerceV001_cucumber//Features//login.feature",
				glue="stepDefinitions"
		
		
		)

public class Testrunner {

}
