package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * The Class ShoppingcartPage.
 *
 * @author Muralikrishna.palakurthi
 */
public class ShoppingcartPage {
WebDriver driver;
	
	public ShoppingcartPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@class=\"inventory_item\"]//button")
	List<WebElement> listOfItems;
	
	@FindBy(id="shopping_cart_container")
	WebElement cartIcon;
	
	@FindBy(xpath="//*[@class=\"cart_item\"][2]//button")
	WebElement removeBtnFor2ndItemIncart;
	
	@FindBy(id="checkout")
	WebElement checkoutBtn;
	
	@FindBy(id="first-name")
	WebElement firstName;
	
	@FindBy(id="last-name")
	WebElement lastName;
	
	@FindBy(id="postal-code")
	WebElement postalCode;
	
	@FindBy(id="continue")
	WebElement continueBtn;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")
	WebElement Addcart1;
	
	public void add3itemstocart() {
		for(int i=1; i<=3;i++) {
			listOfItems.get(i).click();
		}
	}
	public void AddtocartButton1() {
		Addcart1.click();
	}
	
	public void cartIcon() {
		cartIcon.click();
	}
	
	public void SecondRemoveBtninCart() {
		removeBtnFor2ndItemIncart.click();
	}
	
	public void proceedToCheckout() {
		checkoutBtn.click();
	}
	
	public void setFirstName(String fname) {
		firstName.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		lastName.sendKeys(lname);
	}
	
	public void setPostalCode(String pcode) {
		postalCode.sendKeys(pcode);
	}
	
	public void proceedToContinueBtn() {
		continueBtn.click();
	}
	
	
}


