package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass{


	@Test(groups= {"Sanity","Master"})
	public void test_login() {
		try {
			logger.info("******Starting TC_002_LoginTest*******");

			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			logger.info("Clicked on Login Link ");


			LoginPage lp =new LoginPage(driver);
			logger.info("Providing Login Details");

			lp.enterEmail(rb.getString("email"));
			lp.enterPassword(rb.getString("password"));
			lp.clickLogin();
			logger.info("Clicked on Login Button");



			MyAccountPage ap=new MyAccountPage(driver);
			boolean targetPage = ap.isMyAccountPageExist();
			Assert.assertEquals(targetPage, true,"Invalidlogin data");
		}
		catch (Exception e) {
			Assert.fail();
		}

		logger.info("*******Finished TC_002_LoginTest*******");

	}



}
