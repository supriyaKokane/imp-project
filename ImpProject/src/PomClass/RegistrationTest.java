package PomClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin\\Desktop\\chrome driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	@AfterClass
	public void CloseBrowser() {
		driver.quit();
	}
	
	@Test
	public void FbRegistrationPageTest() {
		
		RegistrationPage test=new RegistrationPage(driver);
		
		test.VerifyFbRegistrationPageFbLogo();
		test.VerifyFbRegistrationPageTagline();
		test.VerifyFbRegistrationPageAlreadyAccountLink();
		test.VerifyFbRegistrationPageFooterLinks();
		test.SetFbRegistrationPageFirstname();
		test.SetFbRegistrationPageLastname();
		test.SetFbRegistrationPageMobileEmail();
		test.SetFbRegistrationPagePassword();
		test.SetFbRegistrationPageBirthDate();
		test.SetFbRegistrationPageBirthMonth();
		test.SetFbRegistrationPageBirthYear();
		test.SetFbRegistrationPageGender("female");
		test.ClickFbRegistrationPageLoginBtn();
	}
	

}










