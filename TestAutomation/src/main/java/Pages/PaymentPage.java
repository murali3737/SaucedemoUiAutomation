package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

/**
 * The Class PaymentPage.
 *
 * @author Muralikrishna.palakurthi
 */
public class PaymentPage {
	WebDriver driver;

	public PaymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class=\"summary_info\"]//div[2]")
	WebElement cardinfo;

	@FindBy(xpath = "//*[@class=\"summary_info\"]//div[4]")
	WebElement shippinfo;

	@FindBy(xpath = "//*[@class=\"summary_info\"]//div[5]")
	WebElement price;

	@FindBy(id = "finish")
	WebElement finishbtn;

	@FindBy(xpath = "//*[@class=\"pony_express\"]")
	WebElement logo;

	@FindBy(xpath = "//*[@class=\"complete-header\"]")
	WebElement thankstatement;

	public void finishBtn() {
		finishbtn.click();
	}

	public boolean verifylogoPresent() {
		boolean flag = logo.isDisplayed();
		return flag;
	}

	public void verifyPaymentInfo(WebDriver driver) {

		String expectedinfo = "SauceCard #31337";
		String originalinfo = cardinfo.getText();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(expectedinfo, originalinfo);
		System.out.println("Payment Info is verified");
	}

	public void verifyShippingInfo(WebDriver driver) {

		String expectedinfo = "FREE PONY EXPRESS DELIVERY!";
		String originalinfo = shippinfo.getText();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(expectedinfo, originalinfo);
		System.out.println("Shipping Info is verified");
	}

	public void verifyPriceInfo(WebDriver driver) {

		String expectedinfo = "Item total: $59.980000000000004";
		String originalinfo = price.getText();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(expectedinfo, originalinfo);
		System.out.println("Price Info is verified");
	}

	public void verifyThanksStatement(WebDriver driver) {

		String expectedinfo = "THANK YOU FOR YOUR ORDER";
		String originalinfo = thankstatement.getText();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(expectedinfo, originalinfo);
		System.out.println("ThanksStatement Info is verified");
	}

	public void verifyLogoPresent(WebDriver driver) {

		String expectedinfo = "THANK YOU FOR YOUR ORDER";
		String originalinfo = thankstatement.getText();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(expectedinfo, originalinfo);
		System.out.println("Logo is verified");
	}

}
