package stepdefinition1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject1.AdminPage1;

public class StepDefinition extends Base{
	
	
	@Given("User launch Chrome Browser")
	public void user_launch_chrome_browser() {
	   
		driver = new ChromeDriver();
		ad= new AdminPage1(driver);   ///creating AdminPage Object and passing driver reference
		}

	@When("User open the url {string}")
	public void user_open_the_url(String url) throws Exception {
	  
		driver.get(url);
		Thread.sleep(2000);
	}

	@When("User Enter the Email as {string} and Password as {string}")
	public void user_enter_the_email_as_and_password_as(String email, String password) throws Exception {
		
		ad.setEmail(email);
		Thread.sleep(1000);
		ad.setPassword(password);
		Thread.sleep(1000);
	 
	}

	@When("User click on Login Button")
	public void user_click_on_login_button() throws Exception {
	 
		ad.clickOnLoginButton();
		Thread.sleep(2000);
	}

	@Then("Close Browser")
	public void close_browser() throws Exception {
	 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}

}  
