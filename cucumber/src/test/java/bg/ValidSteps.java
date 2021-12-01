package bg;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidSteps {
	@Before
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@After
	public void afterTest()
	{
		System.out.println("After Test");
	}
	
	@Given("open Browser")
	public void open_browser() {
		System.out.println("open browser");
	    
	}

	@Given("enter url")
	public void enter_url() {
	    System.out.println("enter url");
	    
	}

	@When("user give valid input")
	public void user_give_valid_input() {
		System.out.println("user give valid input");
	   
	}

	@Then("Field should accept")
	public void field_should_accept() {
		System.out.println("field should accept");
	    
	}

}
