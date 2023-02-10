package PomClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class RegistrationPage {
	
	//Declaration ==>
	
	@FindBy (xpath="//img[@alt='Facebook']") private WebElement fb_logo;
	@FindBy (xpath="//div[text()='Create a new account']") private WebElement tagline;
	@FindBy (xpath="//a[text()='Already have an account?']") private WebElement already_acc;
	@FindBy (name="firstname") private WebElement firstname;
	@FindBy (name="lastname") private WebElement lastname;
	@FindBy (name="reg_email__") private WebElement mobile_emailid;
	@FindBy (name="reg_passwd__") private WebElement password;
	@FindBy (name="birthday_day") private WebElement birth_date;
	@FindBy (name="birthday_month") private WebElement birth_month;
	@FindBy (name="birthday_year") private WebElement birth_year;
	@FindBy (xpath="//label[text()='Female']") private WebElement gender_female;
	@FindBy (xpath="//label[text()='Male']") private WebElement gender_male;
	@FindBy (xpath="//button[@name='websubmit']") private WebElement signup_btn;
	@FindBys ({@FindBy(xpath="//div[@id='pageFooterChildren']/ul/li/a")}) private List<WebElement> footer_links;
	
	//Initialization ==>
	
	// this is class constructor used to initialize the datamembers within the class.
	public RegistrationPage(WebDriver driver) { 
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyFbRegistrationPageFbLogo() {
		Assert.assertTrue(fb_logo.isDisplayed(), "Fb logo is not displaed on registration page");
		Reporter.log("VerifyFbRegistrationPageFbLogo",true);
	}
	
	public void VerifyFbRegistrationPageTagline() {
		Assert.assertTrue(tagline.isDisplayed(), "Tagline is not displaed on Fb registration page");
		Assert.assertEquals(tagline.getText(), "Create a new account");
		Reporter.log("VerifyFbRegistrationPageTagline",true);
	}
	
	public void VerifyFbRegistrationPageAlreadyAccountLink() {
		Assert.assertTrue(already_acc.isDisplayed(), "Aleady an account is not displaed on fb registration page");
		Assert.assertEquals(already_acc.getText(), "Already have an account?");
		Reporter.log("VerifyFbRegistrationPageAlreadyAccountLink",true);
	}
	
	public void VerifyFbRegistrationPageFooterLinks() {
		Assert.assertEquals(footer_links.size(), 31);
		Reporter.log("VerifyFbRegistrationPageFooterLinks",true);
	}
	
	public void SetFbRegistrationPageFirstname() {
		firstname.sendKeys("supriya");
		Reporter.log("SetFbRegistrationPageFirstname",true);
	}
	
	public void SetFbRegistrationPageLastname() {
		lastname.sendKeys("kokane");
		Reporter.log("SetFbRegistrationPageLastname",true);
	}
	
	public void SetFbRegistrationPageMobileEmail() {
		mobile_emailid.sendKeys("123456789");
		Reporter.log("SetFbRegistrationPageMobileEmail",true);
	}
	
	public void SetFbRegistrationPagePassword() {
		password.sendKeys("123abcde456");
		Reporter.log("SetFbRegistrationPagePassword",true);
	}
	
	public void SetFbRegistrationPageBirthDate() {
		Select date=new Select(birth_date);
		Assert.assertTrue(birth_date.isDisplayed(), "Birth date is not displayed on fb registration page");
		date.selectByValue("22");
		Reporter.log("SetFbRegistrationPageBirthDate",true);
	}
	
	public void SetFbRegistrationPageBirthMonth() {
		Select month=new Select(birth_month);
		Assert.assertTrue(birth_month.isDisplayed(), "Birth month is not displayed on fb registration page");
		month.selectByVisibleText("Nov");
		Reporter.log("SetFbRegistrationPageBirthMonth",true);
	}
	
	public void SetFbRegistrationPageBirthYear() {
		Select year=new Select(birth_year);
		Assert.assertTrue(birth_year.isDisplayed(), "Birth year is not displayed on fb registration page");
		year.selectByVisibleText("1993");
		Reporter.log("SetFbRegistrationPageBirthYear",true);
	}
	
	public void SetFbRegistrationPageGender(String gender) {
		
		if(gender.equalsIgnoreCase("female")) {
			gender_female.click();
		}else if(gender.equalsIgnoreCase("male")) {
			gender_male.click();
		}else {
			System.out.println("Please select valid option");
		}
		Reporter.log("SetFbRegistrationPageGender",true);	
	}
	
	public void ClickFbRegistrationPageLoginBtn() {
		Assert.assertTrue(signup_btn.isEnabled(), "Sign up button is not enabled");
		signup_btn.click();
		Reporter.log("ClickFbRegistrationPageLoginBtn",true);
	}
	

}
