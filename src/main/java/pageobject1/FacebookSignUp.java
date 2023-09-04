package pageobject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookSignUp {
	
	public WebDriver ldriver;
	
	public FacebookSignUp (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		}
	
	//In  Maven project we can use below statement to store web element
	
	@FindBy(xpath = "//input[@id='email']")
	  WebElement emailAddress;
	
	@FindBy(xpath = "//input[@id='pass']")
	WebElement password;
	
	@FindBy(xpath = "//a[text()='Create new account']")
	WebElement createNewAccount;
	
	
	//Create user define methods to do operation on these web elements
	
	public void emailAddress(String emailAdd)
	{
		emailAddress.sendKeys(emailAdd);
	}
	public void password(String pass)
	{
		password.sendKeys(pass);
	}
	public void createNewAccount() {
		createNewAccount.click();
	}
}
