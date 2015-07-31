package testng_listener;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomListener extends TestListenerAdapter{
	
	public void OnTestFailure(ITestResult tr){
		System.out.println("Failed");
	}
	
	public void OnTestSkipped(ITestResult tr){
		System.out.println("Skipped");
	}
	
	public void OnTestSuccess(ITestResult tr){
		System.out.println("Passed");
	}

}
