package testNGMultiple;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Itestlistenerdemo implements ITestListener {

	
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart from listner");		
	}

	
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess from listner");		
	}

	
	public void onTestFailure(ITestResult result) {	
		System.out.println("onTestFailure from listner");
	}

	
	public void onTestSkipped(ITestResult result) {		
		System.out.println("onTestSkipped from listner");
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {		
		System.out.println("onTestFailedButWithinSuccessPercentage from listner");
	}

	
	public void onStart(ITestContext context) {
		System.out.println("onStart from listner");
		
	}

	
	public void onFinish(ITestContext context) {
		
		System.out.println("onFinish from listner");
	}

}
