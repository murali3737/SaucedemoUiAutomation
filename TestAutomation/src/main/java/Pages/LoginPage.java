package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

/**
 * The Class LoginPage.
 *
 * @author Muralikrishna.palakurthi
 */
public class LoginPage extends Utility.TestBase {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")
	WebElement txtUserName;

	@FindBy(id = "password")
	WebElement txtPassword;

	@FindBy(id = "login-button")
	WebElement btnLogin;

	@FindBy()
	WebElement imageLogos;

	public void enterUserName(String uname) {
		txtUserName.sendKeys(uname);
	}

	public void enterPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void enterUserName1(String uname) {
		txtUserName.sendKeys(uname);
	}

	public void enterPassword1(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void loginButton() {
		btnLogin.click();
	}

	public void verifyTitle(WebDriver driver) {

		String expectedTitle = "Swag Labs";
		String originalTitle = driver.getTitle();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(originalTitle, expectedTitle);
	}
	
	public void verifyLoginErrorMessage(WebDriver driver) {
		String originalmessage = driver.findElement(By.xpath("//div[@class=\"error-message-container error\"]")).getText();
		String expectedMessage = "Epic sadface: Sorry, this user has been locked out.";
		//String originalMessage = driver.getTitle();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(originalmessage, expectedMessage);
	}

}
