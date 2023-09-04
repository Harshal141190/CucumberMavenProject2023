package pageobject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage1 {

	
	public WebDriver ldriver;
	
	
	//constructor
	public AdminPage1(WebDriver rdriver) {  
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//In  Maven project we can use below statement to store web element
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement textEmail;
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement textPassword;
	
	@FindBy(xpath = "//button[text()='Log in']")
	WebElement loginButton;
	
	// creating user defined method to perform operation on above web element
	
	public void setEmail(String email) {
		
		textEmail.clear();
		textEmail.sendKeys(email);
		}
	public void setPassword(String password) {
		textPassword.clear();
		textPassword.sendKeys(password);
	}
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
}
