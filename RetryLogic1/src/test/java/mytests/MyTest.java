package mytests;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class MyTest {//#Theory
	//Assume there are 10 test cases 8 pass 2 fail then we just want to retry fail test cases giving them chances  using Retry logic we give condition.
//There are 2 ways 1.@Test level 2.@Run time(Best approach)
	//For this we have Testng listener--IRetryAnalyzer that can be used at test or run time level.
//Like if we give counter of 3 then failed test case will retried 3 times and if from 3 chance if any one time pass then test case is passed
/*COMMENTING BELOW RETRY ANALYZER LINE DUE TO RUN TIM LEVEL */
	
	
	
	
@Test               //(retryAnalyzer = Analyzer.RetryAnalyzer.class)//implementing retry logic,Analyzer.RetryAnalyzer.class=package name.class name.class,retryAnalyzer available in testng
public void Test1() {//this test will executed 3 time and 4th time failed
	Assert.assertEquals(false, true); //making purposely test 1 fail as comparing true to false
}

@Test
public void Test2() {
	Assert.assertEquals(false, true); //making purposely test 1 fail as comparing true to false
}

//DISADVANTAGE OF THIS LINE(retryAnalyzer = Analyzer.RetryAnalyzer.class), we have to write for all test cases ,100  test 100 line not good approach





















}