package TestCases.Menu_Module;

import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import FunctionLibraries.LoginFunction;
import FunctionLibraries.MenuFunction;

import ObjectRepository.BaseClass;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;
import Utility.Utils;

public class AUT_CMWeb_CreateNewMenu extends Report {
	public WebDriver driver;
	private int iTestCaseRow;
	private String sTestCaseName;

	@BeforeMethod
	public void beforeMethod() throws Exception {
		// Getting the Test Case name, as it will going to use in so many places
		// The main use is to get the TestCase row from the Test Data Excel sheet
		// sTestCaseName = this.toString();
		// From above method we get long test case name including package and class name
		// etc.
		// The below method will refine your test case name, exactly the name use have
		// used
		sTestCaseName = Utils.getTestCaseName(this.toString());

		// Start printing the logs and printing the Test Case name
		logger = report.createTest(sTestCaseName);
		logger.info("Test Case has started.");

		// Setting up the Test Data Excel file using Constants variables
		// For Constant Variables please see http://www.toolsqa.com/constant-variables/
		// For setting up Excel for Data driven testing, please see
		// http://www.toolsqa.com/data-driven-testing-excel-poi/
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Menu");

		// Fetching the Test Case row number from the Test Data Sheet
		// This row number will be feed to so many functions, to get the relevant data
		// from the Test Data sheet
		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName, Constant.Col_TestCaseName);

		// Launching the browser, this will take the Browser Type from Test Data Sheet
		driver = Utils.OpenBrowser(iTestCaseRow);

		// Initializing the Base Class for Selenium driver
		// Now we do need to provide the Selenium driver to any of the Page classes or
		// Module Actions
		// Will soon write a post on Base Class
		new BaseClass(driver);
	}

	// Start of the test script
	@Test
	public void main() throws Exception {

		// UserLogin
		LoginFunction.Execute(iTestCaseRow);

		// Create Menu
		MenuFunction.GoToMenu(iTestCaseRow);
		MenuFunction.CreateMenuMain(iTestCaseRow);
		MenuFunction.AddItemProcedure(iTestCaseRow);
		MenuFunction.AddNutrient(iTestCaseRow);
		MenuFunction.SaveMenu(iTestCaseRow);
		MenuFunction.SearchCreatedMenu(iTestCaseRow);

	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		// Printing beautiful logs to end the test case
		logger.info(sTestCaseName + " done");

		// Capture screenshot
		if (result.getStatus() == ITestResult.FAILURE) {
			logger.fail("Test Failed",
					MediaEntityBuilder.createScreenCaptureFromPath(Utils.takeScreenshot(driver)).build());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			logger.pass("Test Passed",
					MediaEntityBuilder.createScreenCaptureFromPath(Utils.takeScreenshot(driver)).build());
		}

		report.flush();
		// Closing the opened driver
		// driver.close();
	}

}
