package PomClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	@Parameters("browser")
	
	@BeforeClass
	public void OpenBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\Desktop\\chrome driver\\chromedriver.exe");
		driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\pravin\\Desktop\\jar files\\firefox exe\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	@AfterClass
	public void CloseBrowser() {
		driver.quit();
	}
	
	@Test
	public void Facebook_LoginPage_Test() {
		LoginPage test=new LoginPage(driver);
		
		test.Verifyfb_Logo();
		test.VerifyFb_Tagline();
		test.VerifyForgottenPassword();
		test.VerifyCreateAnAccount();
		test.VerifyFooterLinks();
		test.SetEmail_id();
		test.SetPassword();
		test.Click_login_btn();
		//test.VerifyErrorMessage();
	}
	

}
