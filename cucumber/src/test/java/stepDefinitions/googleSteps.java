package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googleSteps {
	
	static WebDriver driver;
	
	@Given("User Opens Browser")
	public void user_open_browser() {
		
		System.out.println("open browser");
		System.setProperty("webdriver.chrome.driver", "H:\\CRM\\RadicoCRM\\cucumber\\src\\main\\resources\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@When("Enters URL")
	public void enters_url() {
	    System.out.println("enter URL");
	    driver.get("https://www.google.com/");
	}

	@Then("User on Google Page")
	public void user_on_google_page() {
		System.out.println("verify google page");
		if(driver.getTitle().equals("Google"))
		{
			System.out.println("google page is displayed.pass");
			
		}
		else
		{
			System.out.println("google page is not displayed,fail");
		}
	    
	}

}
