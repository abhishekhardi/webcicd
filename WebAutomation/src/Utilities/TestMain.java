package Utilities;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestMain {
	
	@Test
    public void ReportTest() throws IOException {
        // start reporters
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./Reports/extent.html");
    
        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        Assert.fail();
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.jpg");
        
        // calling flush writes everything to the log file
        extent.flush();
    }
}