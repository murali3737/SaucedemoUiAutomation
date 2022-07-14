package Testcases;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Utility.TestBase;

/**
 * The Class LoginErrorTest.
 *
 * @author Muralikrishna.palakurthi
 */
public class LoginErrorTest extends TestBase {
	@Test
	public void verifyLoginFunctionalityWithInValidCred() {

		logger.info("To Verify --> Login Function with Invalid credentials");

		driver.get(baseURL);
		logger.info("SauceDemo URL opened");
		LoginPage loginpage = new LoginPage(driver);

		loginpage.enterUserName1(uname1);
		logger.info("Enter username");

		loginpage.enterPassword1(pword1);
		logger.info("Enter password");
		loginpage.loginButton();

		loginpage.verifyLoginErrorMessage(driver);
		System.out.println("Error message displayed and Test case passed ");

	}
}