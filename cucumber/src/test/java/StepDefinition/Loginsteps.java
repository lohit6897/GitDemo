package StepDefinition;

import io.cucumber.java.en.*;

public class Loginsteps {

	
	@Given("^given chrome browser to launch$")
	public void given_chrome_browser_to_launch()
	{
	  System.out.println("lohit");
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() 
	{
		 System.out.println("babu");
	}

	@And("^click on login$")
	public void click_on_login() 
	{
		 System.out.println("kumar");
	}

	@Then("^user see the dashboard$")
	public void user_see_the_dashboard()
	{
		 System.out.println("bochu");
	
	}
}


