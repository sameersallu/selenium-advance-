package practieslisteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerimplimentation implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.err.println("ontestStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.err.println("ontestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.err.println("ontestfailure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.err.println("ontestSkipped");
	}

	@Override
	public void onStart(ITestContext context) {
		System.err.println("onStart");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.err.println("onFinish");
	}

}
