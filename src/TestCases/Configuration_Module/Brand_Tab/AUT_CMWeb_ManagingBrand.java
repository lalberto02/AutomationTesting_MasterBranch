package TestCases.Configuration_Module.Brand_Tab;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import FunctionLibraries.LoginFunction;
import FunctionLibraries.ManagingBrandFunction;
import FunctionLibraries.ManagingKeywordFunction;
import FunctionLibraries.ManagingRolesFunction;
import ObjectRepository.BaseClass;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;
import Utility.Utils;

public class AUT_CMWeb_ManagingBrand extends Report {
	public WebDriver driver;
	private int iTestCaseRow;
	private String sTestCaseName;

	@BeforeMethod
	public void beforeMethod() throws Exception {
		// Getting the Test Case name, as it will going to use in so many places
		// The main use is to get the TestCase row from the Test Data Excel sheet
		 sTestCaseName = this.toString();
		// From above method we get long test case name including package and class name
		// etc.
		// The below method will refine your test case name, exactly the name use have
		// used
		sTestCaseName = Utils.getTestCaseName(this.toString());

		// Start printing the logs and printing the Test Case name
	//	logger = report.createTest(sTestCaseName);
	//	logger.info("Test Case has started.");

		// Setting up the Test Data Excel file using Constants variables
		// For Constant Variables please see http://www.toolsqa.com/constant-variables/
		// For setting up Excel for Data driven testing, please see
		// http://www.toolsqa.com/data-driven-testing-excel-poi/
		 ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,
		 "Merchandise");

		// Fetching the Test Case row number from the Test Data Sheet
		// This row number will be feed to so many functions, to get the relevant data
		// from the Test Data sheet
		 iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,
		 Constant.Col_TestCaseName);

		// Launching the browser, this will take the Browser Type from Test Data Sheet
		driver = Utils.OpenBrowser(iTestCaseRow);

		// Initializing the Base Class for Selenium driver
		// Now we do need to provide the Selenium driver to any of the Page classes or
		// Module Actions
		// Will soon write a post on Base Class
		new BaseClass(driver);
	}

	// Start of the test script	
	@Test (priority=1)	
	public void create() throws Exception {
		String sTestCaseName1 = "AUT_CMWeb_CreateNewMerchandiseBrand";
		
		// Start printing the logs and printing the Test Case name
		logger = report.createTest(sTestCaseName1);
		logger.info("Test Case has started.");
		
		// Setting up the Test Data Excel file using Constants variables
		 ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,
		 "Merchandise");

		// Fetching the Test Case row number from the Test Data Sheet
		 iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName1,
		 Constant.Col_TestCaseName);

		// UserLogin
		LoginFunction.Execute(iTestCaseRow);

		// Create merchandise brand
		ManagingRolesFunction.GoToConfiguration(iTestCaseRow);
		ManagingKeywordFunction.GoToMerchandiseTab(iTestCaseRow);
		ManagingBrandFunction.GoToBrandTab(iTestCaseRow);
		ManagingBrandFunction.AddNewBrand(iTestCaseRow);
		ManagingBrandFunction.SaveBrand(iTestCaseRow);
		

		if (BaseClass.bResult == true) {
			// If the value of boolean variable is True, then your test is complete pass and
			// do this
			// Log.info("Successfull Login");
		} else {
			// If the value of boolean variable is False, then your test is fail, and you
			// like to report it accordingly
			// This is to throw exception in case of fail test, this exception will be
			// caught by catch block below
			throw new Exception("Test Case Failed because of Verification");
		}
	}
	
	@Test (priority=2)	
	public void search() throws Exception {
		// Setting up the Test Data Excel file using Constants variables
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,
		"Merchandise");

		// Fetching the Test Case row number from the Test Data Sheet
		iTestCaseRow = ExcelUtils.getRowContains("AUT_CMWeb_SearchMerchandiseBrand",
		Constant.Col_TestCaseName);
		// Start printing the logs and printing the Test Case name
		logger = report.createTest("AUT_CMWeb_SearchMerchandiseBrand");
		logger.info("Test Case has started.");
		
		// UserLogin
		LoginFunction.Execute(iTestCaseRow);

		// search merchandise brand
		ManagingRolesFunction.GoToConfiguration(iTestCaseRow);
		ManagingKeywordFunction.GoToMerchandiseTab(iTestCaseRow);
		ManagingBrandFunction.GoToBrandTab(iTestCaseRow);
		ManagingBrandFunction.SearchBrand(iTestCaseRow);
	

		if (BaseClass.bResult == true) {
			// If the value of boolean variable is True, then your test is complete pass and
			// do this
			// Log.info("Successfull Login");
		} else {
			// If the value of boolean variable is False, then your test is fail, and you
			// like to report it accordingly
			// This is to throw exception in case of fail test, this exception will be
			// caught by catch block below
			throw new Exception("Test Case Failed because of Verification");
		}
	}
	
	@Test (priority=3)	
	public void edit() throws Exception {
		// Setting up the Test Data Excel file using Constants variables
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,
		"Merchandise");

		// Fetching the Test Case row number from the Test Data Sheet
		iTestCaseRow = ExcelUtils.getRowContains("AUT_CMWeb_EditMerchandiseBrand",
		Constant.Col_TestCaseName);
		// Start printing the logs and printing the Test Case name
		logger = report.createTest("AUT_CMWeb_EditMerchandiseBrand");
		logger.info("Test Case has started.");
		
		// UserLogin
		LoginFunction.Execute(iTestCaseRow);

		// edit merchandise brand - change german translation
		ManagingRolesFunction.GoToConfiguration(iTestCaseRow);
		ManagingKeywordFunction.GoToMerchandiseTab(iTestCaseRow);
		ManagingBrandFunction.GoToBrandTab(iTestCaseRow);
		ManagingBrandFunction.SearchBrand(iTestCaseRow);
		ManagingBrandFunction.EditBrand(iTestCaseRow);
		ManagingBrandFunction.SaveBrand(iTestCaseRow);
	

		if (BaseClass.bResult == true) {
			// If the value of boolean variable is True, then your test is complete pass and
			// do this
			// Log.info("Successfull Login");
		} else {
			// If the value of boolean variable is False, then your test is fail, and you
			// like to report it accordingly
			// This is to throw exception in case of fail test, this exception will be
			// caught by catch block below
			throw new Exception("Test Case Failed because of Verification");
		}
	}


	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		// Printing beautiful logs to end the test case
		logger.info("Execution done");

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
		 driver.close();
	}
}
