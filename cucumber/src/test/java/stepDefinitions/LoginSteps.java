package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginSteps {
	
	WebDriver driver;
	
	@Given("User Open Browser")
	public void user_open_browser() {
		
		System.setProperty("webdriver.chrome.driver", "H:\\CRM\\RadicoCRM\\cucumber\\src\\main\\resources\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
	    driver=new ChromeDriver();
	    
	}

	@Given("enters facebook url")
	public void enters_facebook_url() {
		driver.get("https://www.facebook.com/");
	    
	    
	}

	@When("^user enter (.*)$")
	public void user_enter_deepthigouni9_gmail_com(String un) {
		driver.findElement(By.id("email")).sendKeys(un);
		
	    
	}

	@When("^user enters (.*)$")
	public void user_enters_deepthikunnu0924(String pw) {
		driver.findElement(By.id("pass")).sendKeys(pw);
	    
	}

	@When("user clicks on Login Button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
	}

	@Then("Home Page should be Displayed")
	public void home_page_should_be_displayed() throws InterruptedException {
		
		Thread.sleep(4000);
		Assert.assertEquals("Facebook – log in or sign up", driver.getTitle());
		System.out.println("home page is displayed, pass");
	    
	}


}
