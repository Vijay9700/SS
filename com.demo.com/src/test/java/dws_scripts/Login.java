package dws_scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import base_test.BaseTest;
import pom_pages.Login_Page;
import pom_pages.WelcomePage;
import utilities.ExcelUtility;
import utilities.PropertiesUtility;

public class Login extends BaseTest {

	@Test
	public void Login() throws IOException {
		// read property
		PropertiesUtility prob = new PropertiesUtility();
		String url = prob.readProperty("url");
		// read excel
		ExcelUtility excel = new ExcelUtility();
		String email = excel.readExcel("dws_login", 1, 0);
		String pwd = excel.readExcel("dws_login", 1, 1);
		//script
		driver.get(url);
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getLoginLink().click();
		Login_Page login=new Login_Page(driver);
		login.getEmailTextfield().sendKeys(email);
		login.getPasswordTextfield().sendKeys(pwd);
		login.getLoginButton().click();
	}
}
