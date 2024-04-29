package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	public WelcomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(linkText = "Register"),@FindBy(xpath = "//a[@class='ico-register']")})
	private WebElement registerLink;

	public WebElement getRegisterLink() {
		return registerLink;
	}
	
	@FindAll({@FindBy(linkText = "Log in"),@FindBy(xpath = "//a[@class='ico-login']")})
	private WebElement loginLink;

	public WebElement getLoginLink() {
		return loginLink;
	}

}
