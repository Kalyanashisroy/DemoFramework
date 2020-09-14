package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	@FindBy(name="") WebElement uname;
	
	@FindBy(name="") WebElement pass;
		
	@FindBy(xpath="") WebElement loginbutton;
	
	public void loginToApp(String usernameApp,String passwordApp) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		//	e.printStackTrace();
		}
		uname.sendKeys(usernameApp);
		pass.sendKeys(passwordApp);
		loginbutton.click();
		
	}
}
