package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Page {
	
	public Register_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(id  = "gender-male"),@FindBy(xpath = "//input[@value='M']")})
	private WebElement maleRadioButton;

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}
	@FindBy(id = "FirstName")
	private WebElement firstnameTextfield;

	public WebElement getFirstnameTextfield() {
		return firstnameTextfield;
	}
	@FindBy(id = "LastName")
	private WebElement lastnameTextfield;

	public WebElement getlastnameTextfield() {
		return lastnameTextfield;
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
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordTextfield;

	public WebElement getConfirmPasswordTextfield() {
		return confirmPasswordTextfield;
	}
	@FindBy(id = "register-button")
	private WebElement registerButton;

	public WebElement getRegisterButton() {
		return registerButton;
	}
	@FindBy(xpath = "//h1[text()='Register']")
	private WebElement registerText;

	public WebElement getRegisterText() {
		return registerText;
	}
}
