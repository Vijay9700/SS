package base_test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTest {
	public ExtentReports report;
	public ExtentTest test;
	public WebDriver driver;
	@BeforeSuite
	public void startReportConfig()
	{
		report=new ExtentReports("./ExternalReport/report.html");
		test = report.startTest("DWS TEST");
	}
	@AfterSuite
	public void endReportConfig()
	{
		report.endTest(test);
		report.flush();
	}
	@BeforeClass
	public void launchBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}
	@AfterClass
	public void quitBrowser() {
		driver.quit();
	}
	@BeforeMethod
	public void login()
	{
		
	}
	@AfterMethod
	public void logout()
	{
		
	}

}
