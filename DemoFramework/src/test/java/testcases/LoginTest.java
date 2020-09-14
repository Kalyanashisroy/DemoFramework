package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.BaseClass;
import pages.LoginPage;

public class LoginTest extends BaseClass{
				
	@Test(priority=1)
	public void loginApp() {
		logger=report.createTest("Login to App");
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		logger.info("Starting Application");
		loginPage.loginToApp(excel.getStringData("Sheet1", 0, 0), excel.getStringData("Sheet1", 0, 1));
		logger.pass("Login Success");			
	}
	@Test(priority=2)
	public void loginApp1() {
		logger=report.createTest("Logout");
		logger.fail("Logout failed");			
	}
	

}
