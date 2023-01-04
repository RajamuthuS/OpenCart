package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="input-email")
	WebElement txtEmail;

	@FindBy(id="input-password")
	WebElement txtPassword;

	@FindBy(xpath="//input[@value='Login']")
	WebElement clkLogin;


	public void enterEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void enterPassword(String password) {
		txtPassword.sendKeys(password);
	}

	public void clickLogin() {
		clkLogin.click();
	}


}
