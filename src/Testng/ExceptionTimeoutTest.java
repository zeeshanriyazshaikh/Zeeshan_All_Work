package Testng;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {
//TO EXECUTE ALL TESTNG CLASSES IN ONE SHOT MAKE XML CLASS AND FOLLOW FORMAT,NO NEED TO MUG UP JUST COPY PASTE.
	
@Test(timeOut=2000)                  //to break loop
public void infiniteLoop() {
	int i=1;
	while(i==1)
	{
		System.out.println(i);
		break;
	}
}
	
	
	
	
	
	
	
	
	
	
	
}
