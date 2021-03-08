package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class ManagingProductionLocFunction extends Report {

	// Go to Production Location tab
	public static void GoToProductionLocTab(int iTestCaseRow) throws Exception {

		// Click tax rate
		CMWeb_ConfigurationPage.btnProductionLoc().click();
		if (CMWeb_ConfigurationPage.btnNewKeyword().isDisplayed()) {
			logger.pass("Production Location tab is displayed");
		} else {
			logger.fail("Production Location tab is not displayed");
		}
	}

	// create new production loc
	public static void AddNewProductionLoc(int iTestCaseRow) throws Exception {
		// Click New Button
		CMWeb_ConfigurationPage.btnNewKeyword().click();
		if (CMWeb_ConfigurationPage.txtSourceName().isDisplayed()) {
			logger.pass("Production Location create page was displayed");
		} else {
			logger.fail("New Button was not clicked.");
		}

		// input production location name
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtSourceName().sendKeys(sName);
		logger.info("Production location name: " + sName + " was entered.");

		// tick sharing
		String sSharing = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_RoleLevel);
		if (sSharing.equals("Global")) {
			CMWeb_ConfigurationPage.chckboxGlobalTax().click();
			logger.info("Global Sharing was ticked.");
		} else if (sSharing.equals("HQ")) {
			CMWeb_ConfigurationPage.chckboxHQTax().click();
			CMWeb_ConfigurationPage.chckboxHQTax().click();
			logger.info("HQ Sharing was ticked.");
		}
	}

	// Save Production Location
	public static void SaveProductionLoc(int iTestCaseRow) throws Exception {
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		// Click Save
		CMWeb_ConfigurationPage.btnSaveKeyword().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass(sName + " Production Location was successfully saved");
	}

	// Search production location
	public static void SearchProductionLoc(int iTestCaseRow) throws Exception {

		// search Production Location
		 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtSearchKeyword().sendKeys(sName);
		logger.info("Production Location name: " + sName + " was entered");
		CMWeb_ConfigurationPage.btnSearchKeyword().click();
		if (CMWeb_ConfigurationPage.chckboxProductionLoc().isDisplayed()) {
			logger.pass("Production Location was successfully searched");
		} else {
			logger.fail("No records existing");
		}

	}

	// Edit production location
	public static void EditProductionLoc(int iTestCaseRow) throws Exception {

		// tick production location to edit
		CMWeb_ConfigurationPage.chckboxProductionLoc().click();
		if (CMWeb_ConfigurationPage.txtSourceName().isDisplayed()) {
			logger.pass("Production Location was able to edit.");
		} else {
			logger.fail("Edit button was not clicked.");
		}

		// tick sharing
		String sSharing = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_RoleType);
		if (sSharing.equals("Global")) {
			CMWeb_ConfigurationPage.chckboxGlobalTax().click();
			logger.info("Global Sharing was ticked.");
		} else if (sSharing.equals("HQ")) {
			CMWeb_ConfigurationPage.chckboxGlobalTax().click();
			logger.info("HQ Sharing was ticked.");
		}
	}

	// Delete production location
	public static void DeleteProductionLoc(int iTestCaseRow) throws Exception {
		// select production location
		 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.chckboxProductionLoc().click();
		logger.info(sName + " Production Location to delete was selected");

		// click delete button
		CMWeb_ConfigurationPage.btnDeleteKeyword().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass("Production Location was successfully deleted.");
	}

}
