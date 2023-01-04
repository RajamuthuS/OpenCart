package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}

	//Elements

	@FindBy(id="input-firstname")
	WebElement txtFirstname;

	@FindBy(id="input-lastname")
	WebElement txtLastname;

	@FindBy(id="input-email")
	WebElement txtEmail;

	@FindBy(id="input-telephone")
	WebElement txtTelephone;

	@FindBy(id="input-password")
	WebElement txtPassword;

	@FindBy(id="input-confirm")
	WebElement txtConfirmPassword;

	@FindBy(name="agree")
	WebElement chkdPolicy;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;

	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	public void setFirstname(String fname) {
		txtFirstname.sendKeys(fname);;
	}

	public void setTxtLastname(String lname) {
		txtLastname.sendKeys(lname);;
	}

	public void setTxtEmail(String email) {
		txtEmail.sendKeys(email);;
	}

	public void setTxtTelephone(String tel) {
		txtTelephone.sendKeys(tel);;
	}

	public void setTxtPassword(String pass) {
		txtPassword.sendKeys(pass);;
	}

	public void setTxtConfirmPassword(String confirmpass) {
		txtConfirmPassword.sendKeys(confirmpass);;
	}

	public void setchkdPolicy() {
		chkdPolicy.click();;
	}
	
	public void setbtnContinue() {
		btnContinue.click();
	}
	
	public String getConfirmationmsg() {
		try {
			return(msgConfirmation.getText());
		}
		catch (Exception e) {
			return(e.getMessage());
		}
	}








}
