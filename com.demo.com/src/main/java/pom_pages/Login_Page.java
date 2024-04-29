package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Email")
	private WebElement emailTextfield;

	public WebElement getEmailTextfield() {
		return emailTextfield;
	}
	@FindBy(id = "Password")
	private WebElement passwordTextfield;

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}
}
