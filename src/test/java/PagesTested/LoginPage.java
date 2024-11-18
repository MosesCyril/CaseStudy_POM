package PagesTested;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy (xpath = "//input[@placeholder='Email']")
	WebElement username;
	@FindBy (xpath = "//input[@placeholder='Password']")
	WebElement upwd;
	@FindBy (xpath = "//button[contains(text(),'Login')]")
	WebElement login;
	
public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void validlogin(String uname, String pwd) {
		// TODO Auto-generated method stub
		username.sendKeys(uname);
		upwd.sendKeys(pwd);
		login.click();
		
	}
}