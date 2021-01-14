package Utility;

import java.io.File;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Report {
	public ExtentReports report;
	public static ExtentTest logger;
	
	@BeforeSuite
	public void setUpReport() {
		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File("./Test_report/TestResults.html"));
				//(new File("./Test_report/TestResults.html"));
				//(new File(System.getProperty("user.dir")+"/Test_Report/TestResults"+Utils.getCurrentDateTime()+".html"));
		report = new ExtentReports();
		report.attachReporter(extent);
	}
}