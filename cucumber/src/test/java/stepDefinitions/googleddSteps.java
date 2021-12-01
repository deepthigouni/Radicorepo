package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class googleddSteps {
	
	
	@Given("^User opens (.*) test$")
	public void user_opens_fire_fox_test(String br) {
		
		System.out.println(br);
	    
	}

	@Then("^Verify page$")
	public void verify_page() {
		System.out.println("Page Verified");
		
		
	    
	}








	
	
	

}