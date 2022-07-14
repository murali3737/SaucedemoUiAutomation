package Testcases;

import org.testng.annotations.Test;
import Pages.LoginPage;
import Pages.ShoppingcartPage;
import Pages.PaymentPage;
import Utility.TestBase;

/**
 * The Class PaymentTest.
 *
 * @author Muralikrishna.palakurthi
 */
public class PaymentTest extends TestBase {

	@Test
	public void paymentPageTest() {
		driver.get(baseURL);
		// object creating for Login page
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(uname);

		loginpage.enterPassword(pword);

		loginpage.loginButton();

		ShoppingcartPage cartpage = new ShoppingcartPage(driver);
		cartpage.add3itemstocart();
		cartpage.cartIcon();
		cartpage.SecondRemoveBtninCart();
		cartpage.proceedToCheckout();
		logger.info("Proceed to checkout");

		cartpage.setFirstName("fname");
		cartpage.setLastName("lname");
		cartpage.setPostalCode("12345");
		cartpage.proceedToContinueBtn();

		// object creating for Payment page
		PaymentPage paymentpage = new PaymentPage(driver);
		paymentpage.verifyPaymentInfo(driver);
		paymentpage.verifyShippingInfo(driver);
		paymentpage.verifyPriceInfo(driver);
		paymentpage.finishBtn();
		logger.info("clicked on finish  button");
		paymentpage.verifyThanksStatement(driver);
		paymentpage.verifyLogoPresent(driver);

	}
}
