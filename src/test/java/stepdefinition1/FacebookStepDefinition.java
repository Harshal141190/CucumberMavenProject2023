package stepdefinition1;


import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject1.FacebookSignUp;

public class FacebookStepDefinition extends Base {
	
	@When("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
	  
		 driver = new ChromeDriver();
		 fb = new FacebookSignUp(driver);
	}

	@When("User open the Url as {string}")
	public void user_open_the_url_as(String Url) throws Exception {
	    
		driver.get(Url);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}

	@When("User Enter EmailAddress as {string} and Password as {string}")
	public void user_enter_email_address_as_and_password_as(String emailAdd, String Pass) throws Exception {
	    
	fb.emailAddress(emailAdd);
	Thread.sleep(2000);
	fb.password(Pass);
	Thread.sleep(1000);
	}

	@Then("User clicks on Create new account Button")
	public void user_clicks_on_create_new_account_button() throws Exception {
	    
		
		fb.createNewAccount();
		Thread.sleep(2000);
		
		
	}

	@Then("Close the Browser")
	public void close_the_browser() throws Exception {
		
		driver.close();
	}


}
