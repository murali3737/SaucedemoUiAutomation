package Testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.ShoppingcartPage;
import Utility.TestBase;

/**
 * The Class CartTest.
 *
 * @author Muralikrishna.palakurthi
 */
public class CartTest extends TestBase {

	@Test
	public void cartPageTest() {

		driver.get(baseURL);

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(uname);

		loginpage.enterPassword(pword);

		loginpage.loginButton();

		ShoppingcartPage cartpage = new ShoppingcartPage(driver);
		cartpage.add3itemstocart();
		logger.info("Added 3 items to cart");

		cartpage.cartIcon();
		logger.info("clicked on cart icon");

		cartpage.SecondRemoveBtninCart();
		logger.info("second item removed");

		cartpage.proceedToCheckout();
		logger.info("Proceed to checkout");

		cartpage.setFirstName("fname");
		cartpage.setLastName("lname");
		cartpage.setPostalCode("12345");
		cartpage.proceedToContinueBtn();
		logger.info("filled the details and clicked on continue.");

	}
}
