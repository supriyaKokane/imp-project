package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass3 {
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Browser open");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser open");
	}
	
	@Test(groups="Smoke")
	public void m5() {
		System.out.println("method 5");
	}
	
	@Test(groups="Functional")
	public void m6() {
		System.out.println("method 6");
	}

}
