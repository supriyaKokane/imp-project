package CrossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserTesting {
	
	WebDriver driver;
	@Parameters("browser")
	
	@Test(priority=1)
	public void BrowserOpening(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\pravin\\Desktop\\chrome driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\pravin\\Desktop\\jar files\\firefox exe\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=2)
	public void verifyUrl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/reg");
	}
	
	@Test(priority=3) 
	public void firstName() {
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		Assert.assertTrue(firstname.isDisplayed());
		firstname.sendKeys("Supriya");
	}
	
	@Test(priority=3)
	public void lastName() {
		WebElement surname=driver.findElement(By.xpath("//input[@name='lastname']"));
		Assert.assertTrue(surname.isDisplayed());
		surname.sendKeys("Kokane");
	}
	
	@Test(priority=4) 
	public void emailID() {
		WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		Assert.assertTrue(email.isDisplayed());
		email.sendKeys("sup2211@gmail.com");
	}
	
	@Test(priority=5) 
	public void setPassword() {
		WebElement pass=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		Assert.assertTrue(pass.isDisplayed());
		pass.sendKeys("123");
	}
	
	@Test(priority=6) 
	public void SetDate() {
		WebElement date=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Assert.assertTrue(date.isDisplayed());
		Select s=new Select(date);
		s.selectByValue("22");
	}
	
	@Test(priority=7)
	public void SetMonth() {
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Assert.assertTrue(month.isDisplayed());
		Select s=new Select(month);
		s.selectByVisibleText("Nov");
	}
	
	@Test(priority=8) 
    public void SetYear() {
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Assert.assertTrue(year.isDisplayed());
		Select s=new Select(year);
		s.selectByVisibleText("1993");
	}
	
	@Test(priority=9) 
	public void SetGender() {
		WebElement gender=driver.findElement(By.xpath("//label[text()='Female']"));
		Assert.assertTrue(gender.isDisplayed());
		Assert.assertFalse(gender.isSelected());
		gender.click();
	}
	
	@Test(priority=10) 
	public void ClickLoginBtn() {
		WebElement login=driver.findElement(By.xpath("//button[@name='websubmit']"));
		Assert.assertTrue(login.isEnabled());
		login.click();
	}
	
	

}
