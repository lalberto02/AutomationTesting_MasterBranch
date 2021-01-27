package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import Utility.ExcelUtils;
import Utility.Constant;
import Utility.Report;

public class ManagingPrintProfile extends Report {

	// Go to Tools tab
	public static void GoToToolsTab(int iTestCaseRow) throws Exception {

		// Click Merchandise
		CMWeb_ConfigurationPage.btnTools().click();
		if (CMWeb_ConfigurationPage.btnPrintProfile().isDisplayed()) {
			logger.pass("Tools tab is displayed");
		} else {
			logger.fail("Tools tab is not displayed");
		}
	}

	// Go to Print Profile tab
	public static void GoToPrintProfileTab(int iTestCaseRow) throws Exception {

		// Click Merchandise
		CMWeb_ConfigurationPage.btnPrintProfile().click();
		if (CMWeb_ConfigurationPage.btnNew().isDisplayed()) {
			logger.pass("Print Profile tab is displayed");
		} else {
			logger.fail("Print Profile tab is not displayed");
		}
	}

	// Create print profile
	public static void CreatePrintProfile(int iTestCaseRow) throws Exception {

		// Click new button
		CMWeb_ConfigurationPage.btnNew().click();
		if (CMWeb_ConfigurationPage.drpdwnWhatPrint().isDisplayed()) {
			logger.pass("Print profile create page was displayed");
		} else {
			logger.fail("New Button was not clicked.");
		}

		// input print profile name
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtProfileName().sendKeys(sName);
		logger.info("Print Profile Name: " + sName + " was entered.");

		// select what to print
		String sWhatPrint = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_WhatToPrint);
		CMWeb_ConfigurationPage.drpdwnWhatPrint().click();
		CMWeb_ConfigurationPage.drpdwnWhatPrint().sendKeys(sWhatPrint);
		logger.info(sWhatPrint + " was selected ");

		// tick global
		CMWeb_ConfigurationPage.chckboxGlobalYes().click();
		logger.info("Global yes was ticked.");

		// select style 
		String sStyle = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_PrintStyle);
		CMWeb_ConfigurationPage.drpdwnPrintStyle().click();
		CMWeb_ConfigurationPage.drpdwnPrintStyle().sendKeys(sStyle);
		logger.info(sStyle + " Print style was selected.");

	}

	// Save Print Profile
	public static void SavePrintProfile(int iTestCaseRow) throws Exception {
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		// Click Save
		CMWeb_ConfigurationPage.btnSave().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass(sName + " Print profile was successfully saved");
	}

	// Search Print Profile
	public static void SearchPrintProfile(int iTestCaseRow) throws Exception {

		// search print profile
		 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtSearch().sendKeys(sName);
		logger.info("Print Profile Name: " + sName + " was entered.");
		String sWhatPrint = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_WhatToPrint);
		CMWeb_ConfigurationPage.drpdwnWhatPrintFilter().click();
		CMWeb_ConfigurationPage.drpdwnWhatPrintFilter().sendKeys(sWhatPrint);
		logger.info(sWhatPrint + " What to print filter was selected.");
		CMWeb_ConfigurationPage.btnSearch().click();
		if (CMWeb_ConfigurationPage.chckboxPrintProfile().isDisplayed()) {
			logger.pass(sName + " Print profile was successfully searched");
		} else {
			logger.fail("No records existing");
		}
	}
	
	// Delete Print Profile
		public static void DeletePrintProfile(int iTestCaseRow) throws Exception {
			// select print profile
			 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			CMWeb_ConfigurationPage.chckboxPrintProfile().click();
			logger.info(sName + " Print profile to delete was selected");
			
			//click delete button
			CMWeb_ConfigurationPage.btnDelete().click();
			Thread.sleep(5000);
			CMWeb_ConfigurationPage.alertOkay().accept();
			Thread.sleep(5000);
			CMWeb_ConfigurationPage.alertOkay().accept();
			logger.pass(sName + " Print profile was successfully deleted.");
		}
}
