package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class ManagingPackagingFunction extends Report {

	// Go to Packaging Method tab
	public static void GoToPackagingMethod(int iTestCaseRow) throws Exception {

		// Click tax rate
		CMWeb_ConfigurationPage.btnPackagingMethod().click();
		if (CMWeb_ConfigurationPage.btnNewKeyword().isDisplayed()) {
			logger.pass("Packaging Method tab is displayed");
		} else {
			logger.fail("Packaging Method tab is not displayed");
		}
	}

	// create Packaging Method
	public static void AddNewPackagingMethod(int iTestCaseRow) throws Exception {
		// Click New Button
		CMWeb_ConfigurationPage.btnNewKeyword().click();
		if (CMWeb_ConfigurationPage.txtEnglishCategory().isDisplayed()) {
			logger.pass("Packaging Method create page was displayed");
		} else {
			logger.fail("New Button was not clicked.");
		}

		// input Packaging Method name
		 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtEnglishCategory().sendKeys(sName);
		logger.info("Packaging Method name: " + sName + " was entered.");

		// input Packaging Method french
		 String sFrench = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		CMWeb_ConfigurationPage.txtFrenchNotes().sendKeys(sFrench);
		logger.info(sFrench + " Packaging Method french translation was entered.");
	}
	
	// Save Packaging Method
	public static void SavePackagingMethod(int iTestCaseRow) throws Exception {
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		// Click Save
		CMWeb_ConfigurationPage.btnSaveKeyword().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass(sName + " Packaging Method was successfully saved");
	}
	
	// Packaging Method Notes
	public static void SearchPackagingMethod(int iTestCaseRow) throws Exception {

		// search Packaging Method
		 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtSearchKeyword().sendKeys(sName);
		logger.info("Packaging Method name: " + sName + " was entered");
		CMWeb_ConfigurationPage.btnSearchKeyword().click();
		Thread.sleep(5000);
		if (CMWeb_ConfigurationPage.chckboxNotes().isDisplayed()) {
			logger.pass("Packaging Method was successfully searched");
		} else {
			logger.fail("No records existing");
		}

	}
	
	// Edit Packaging Method
	public static void EditPackagingNotes(int iTestCaseRow) throws Exception {

		// tick Packaging Method to edit
		CMWeb_ConfigurationPage.chckboxNotes().click();
		if (CMWeb_ConfigurationPage.txtFrenchNotes().isDisplayed()) {
			logger.pass("Packaging Method was able to edit.");
		} else {
			logger.fail("Edit button was not clicked.");
		}
		
		// change french Translation
		String sFrench = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		String sNewFrench = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NewPubName);
		CMWeb_ConfigurationPage.txtFrenchNotes().clear();
		CMWeb_ConfigurationPage.txtFrenchNotes().sendKeys(sNewFrench);
		logger.info(sFrench + " was changed to " + sNewFrench);

	}
	
	// Delete Packaging Method
	public static void DeletePackagingMethod(int iTestCaseRow) throws Exception {
		// select Packaging Method
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.chckboxNotes().click();
		logger.info(sName + " Packaging Method to delete was selected");

		// click delete button
		CMWeb_ConfigurationPage.btnDeleteKeyword().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass("Packaging Method was successfully deleted.");
	}

}
