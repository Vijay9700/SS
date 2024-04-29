package dws_scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base_test.BaseTest;
import pom_pages.Register_Page;
import pom_pages.WelcomePage;
import utilities.ExcelUtility;
import utilities.PropertiesUtility;

public class Register extends BaseTest {
	
	@Test
	public void Register() throws IOException {
		//read property
		PropertiesUtility prob=new PropertiesUtility();
		String url = prob.readProperty("url");
		//read excel
		ExcelUtility excel=new ExcelUtility();
		String fn = excel.readExcel("dws_register", 1, 0);
		String ln = excel.readExcel("dws_register", 1, 1);
		String email = excel.readExcel("dws_register", 1, 2);
		String pwd = excel.readExcel("dws_register", 1, 3);
		String cpwd = excel.readExcel("dws_register", 1, 4);
		//script
		driver.get(url);
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getRegisterLink().click();
		Register_Page register=new Register_Page(driver);
		register.getMaleRadioButton().click();
		register.getFirstnameTextfield().sendKeys(fn);
		register.getlastnameTextfield().sendKeys(ln);
		register.getEmailTextfield().sendKeys(email);
		register.getPasswordTextfield().sendKeys(pwd);
		register.getConfirmPasswordTextfield().sendKeys(cpwd);
		register.getRegisterButton().click();
		Assert.assertEquals(register.getRegisterText().isDisplayed(), true);
		test.log(LogStatus.PASS, "Registeration completed successfully");
	}

}
