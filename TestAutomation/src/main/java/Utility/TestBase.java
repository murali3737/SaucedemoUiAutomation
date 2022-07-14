package Utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Pages.LoginPage;
import Pages.ShoppingcartPage;
public class TestBase {
	
	
	
	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL = readconfig.getApplicationURL();
	public String uname = readconfig.getUsername();
	public String pword = readconfig.getPassword();
	public String uname1 = readconfig.getUsername1();
	public String pword1 = readconfig.getPassword1();
	protected static LoginPage loginpage;
	protected static ShoppingcartPage shoppingcartpage;
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
}

}
