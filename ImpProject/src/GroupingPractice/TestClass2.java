package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass2 {
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Browser open");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser open");
	}
	
	@Test(groups="Smoke")
	public void m3() {
		System.out.println("method 3");
	}
	
	@Test(groups="Functional")
	public void m4() {
		System.out.println("method 4");
	}

}
