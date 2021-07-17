package extentreporting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReportingManager {

	
	
	public static ExtentReports report = new ExtentReports("C:\\Users\\PRASHANTHI\\MyJavaWorkSpace\\SeleniumJuneSessions\\ExtentReport"+".html");
	
	
	public static ExtentTest test = report.startTest("Smoke Suite");
	
	
	public static void closeReport() {
		
		report.endTest(test);
		report.flush();
		
	}

}

