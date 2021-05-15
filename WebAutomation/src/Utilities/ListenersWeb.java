package Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ListenersWeb implements ITestListener {
	TakeScreenshot SS = new TakeScreenshot();
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("I am in onTestStart "+result.getName());
		test = extent.createTest("MyFirstTest", "Sample description");
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("I am in onTestSuccess "+result.getName());
	     // creates a toggle for the given test, adds all log events under it    
       
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("I am in onTestFailure "+result.getName());
		// TODO Auto-generated method stub
		SS.takesnapshot(result.getName());
		ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("I am in onTestSkipped "+result.getName());
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("I am in onStart "+context.getName());
		// start reporters
        htmlReporter = new ExtentHtmlReporter("./Reports/extent.html");
       // create ExtentReports and attach reporter(s)
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("I am in onFinish "+context.getName());
		ITestListener.super.onFinish(context);
		extent.flush();
	}
	

}
