package Testcases;

import org.testng.annotations.Test;
import Pages.LoginPage;

/**
 * The Class LoginPageTest.
 *
 * @author Muralikrishna.palakurthi
 */
public class LoginPageTest extends Utility.TestBase {
	@Test
	public void verifyLoginFunctionalityWithValidCred() {

		logger.info("To Verify --> Login Function with valid credentials");

		driver.get(baseURL);
		logger.info("SauceDemo URL opened");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(uname);
		logger.info("Enter Valid username");

		loginpage.enterPassword(pword);
		logger.info("Enter Valid password");

		loginpage.loginButton();
		loginpage.verifyTitle(driver);
		System.out.println("Page Title verified");

	}
}
