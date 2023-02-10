package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {
	
	@BeforeTest
	public void openDB() {
		System.out.println("Database open");
	}
	
	@AfterTest
	public void closeDB() {
		System.out.println("Database closed");
	}
	
	@BeforeClass 
	public void openBrowser() {
		System.out.println("Browser open");
	}
	
	@AfterClass 
	public void closeBrowser() {
		System.out.println("Browser close");
	}
	
	@Test(groups="Smoke")
	public void m1() {
		System.out.println("method 1");
	}
	
	@Test(groups="Functional")
	public void m2() {
		System.out.println("method 2");
	}
	
}
