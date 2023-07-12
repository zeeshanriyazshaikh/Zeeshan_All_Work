package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestngSoftAssert {
	SoftAssert softAssert = new SoftAssert();
	@Test
	public void test1() {
		System.out.println("open browser");
		Assert.assertEquals(true, true);  //hard assert//once failed like true,false are not equal it fails next code does not execute
		System.out.println("enter name");
		System.out.println("enter password");
		System.out.println("click sign in button");
		
		System.out.println("validate home page");    //what soft assert do is if validation for current code fail then also next code runs.
		softAssert.assertEquals(true, false);       //soft Assert ,need object creation 
		System.out.println("click deal page");
		softAssert.assertAll();     //important to write at end,what it do soft assert cases get stored in one softAssert object and check. 
	}//if hard assertion fails next corresponding line wont be executed
}
//THEORY
//1.hard assertion :hard validation : if a a hard assertion failed --immediately test case will be marked as failed and test case will be terminated
//2.soft assertion:soft validation : if a soft assertion is getting failed --test case will not be marked as passed as well as next lines will be executed
//3.assertAll(); to mark test case as failed,if any soft assertion is getting failed.as above explained test case will pass if soft assertion is getting failed but this should not be happen so we use asserAll(); at the end