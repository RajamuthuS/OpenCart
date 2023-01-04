package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_00_AccountRegistrationTest extends BaseClass {

	@Test(groups= {"Regression","Master"})
	void test_account_Registration() {

		logger.info("****** Starting TC_001_AccountRegistrationTest********");

		try {
			HomePage hp=new HomePage(driver);

			hp.clickMyAccount();
			logger.info("Clicked on My account link");

			hp.clickRegister();
			logger.info("Clicked on register link");

			AccountRegistrationPage regpage=new AccountRegistrationPage(driver);

			logger.info("Providing customer data");

			regpage.setFirstname(randomeString().toUpperCase());

			regpage.setTxtLastname(randomeString().toUpperCase());

			regpage.setTxtEmail(randomeString()+"@gmail.com");

			regpage.setTxtTelephone(randomeNumer());

			String password = randomeAlphaNumeric();

			regpage.setTxtPassword(password);

			regpage.setTxtConfirmPassword(password);

			regpage.setchkdPolicy();

			regpage.setbtnContinue();
			logger.info("Clicked on continue");

			String confmsg=regpage.getConfirmationmsg();

			logger.info("Validating expected message");
			Assert.assertEquals(confmsg, "Your Account Has Been Created!", "Test Failed");}

		catch (Exception e) {
			logger.error("Test Fail");
			Assert.fail();
		}

		logger.info("****** Starting TC_001_AccountRegistrationTest********");

	}

}
