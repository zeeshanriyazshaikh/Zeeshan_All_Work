package Testng;

import org.testng.annotations.Test;

public class InvocationCountTest {

	
	
	
	@Test(invocationCount=10)  //test repeatedly
	public void loginTest() {
		System.out.println("login test");
	}
	
	
	
	
	
	
	
	
}
