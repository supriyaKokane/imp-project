package PomClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage {
	
	@FindBy (xpath="//img[@alt='Facebook']") private WebElement fb_logo;
	@FindBy (xpath="//h2[contains(text(),'Facebook helps you connect')]") private WebElement fb_tagline;
	@FindBy (xpath="//input[@name='email']") private WebElement email_id;
	@FindBy (xpath="//input[@name='pass']") private WebElement password;
	@FindBy (xpath="//a[text()='Forgotten password?']") private WebElement forgotten_password;
	@FindBy (xpath="//a[@data-testid='open-registration-form-button']") private WebElement create_an_acc;
	@FindBys ({@FindBy(xpath="//div[@id='pageFooterChildren']/ul/li/a")}) private List<WebElement> footer_links;
	@FindBy (xpath="//button[@name='login']") private WebElement login_btn;
	//@FindBy (xpath="//div[@class='_9ay7']") private WebElement error_msg;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Verifyfb_Logo() {
		Assert.assertTrue(fb_logo.isDisplayed(), "Fb login page is not displayed");
		Reporter.log("Verifyfb_Logo", true);
	}
	
	public void VerifyFb_Tagline() {
		Assert.assertEquals(fb_tagline.getText(), "Facebook helps you connect and share with the people in your life.");
		Reporter.log("VerifyFb_Tagline", true);
	}
	
	public void SetEmail_id() {
		Assert.assertTrue(email_id.isDisplayed(), "Email id text box is not displayed");
		email_id.sendKeys("abc@gmail.com");
		Reporter.log("SetEmail_id", true);
	}
	
	public void SetPassword() {
		Assert.assertTrue(password.isDisplayed(), "Password text box is not displayed");
		password.sendKeys("abc123456");
		Reporter.log("SetPassword", true);
	}
	
	public void VerifyForgottenPassword() {
		Assert.assertTrue(forgotten_password.isDisplayed(), "Forgotten password link is not displayed");
		Assert.assertEquals(forgotten_password.getText(), "Forgotten password?");
		Reporter.log("VerifyForgottenPassword", true);
	}
	
	public void VerifyCreateAnAccount() {
		Assert.assertEquals(create_an_acc.getText(), "Create New Account");
		Reporter.log("VerifyCreateAnAccount", true);
	}
	
	public void VerifyFooterLinks() {
		Assert.assertEquals(footer_links.size(),31);
		Reporter.log("VerifyFooterLinks", true);
	}
	
	public void Click_login_btn() {
		Assert.assertTrue(login_btn.isEnabled(), "login button is not enabled");
		login_btn.click();
		Reporter.log("Click_login_btn", true);
	}
	
//	public void VerifyErrorMessage() {
//		Assert.assertTrue(error_msg.isDisplayed(), "Error message is not displayed");
//		Assert.assertEquals(error_msg.getText(), "The password that you've entered is incorrect. Forgotten password?");
//		Reporter.log("VerifyErrorMessage", true);
//	}	

}
