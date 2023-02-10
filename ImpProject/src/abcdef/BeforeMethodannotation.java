package abcdef;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodannotation {
	
	@BeforeMethod
	public void beforeM() {
		System.out.println("******** Before Method *******");    //login
	}
	
	@AfterMethod
	public void afterM() {
		System.out.println("******** After Method *******");      //logout
	}
	
	@Test
	public void m1() {
		System.out.println("m1");                                 //homepage
	}
	
	@Test
	public void m2() {
		System.out.println("m2");                                //profilepage
	}
	
	@Test
	public void m3() {
		System.out.println("m3");                                //notification
	}
      //before method==> m1 ==> logout
	  //before method==> m2 ==> logout
}
