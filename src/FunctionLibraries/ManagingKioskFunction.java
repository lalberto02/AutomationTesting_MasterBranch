package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class ManagingKioskFunction extends Report {

	// Go to Kiosk tab
	public static void GoToKioskTab(int iTestCaseRow) throws Exception {

		// Click kiosk
		CMWeb_ConfigurationPage.btnKiosk().click();
		if (CMWeb_ConfigurationPage.btnNewKeyword().isDisplayed()) {
			logger.pass("Kiosk tab is displayed");
		} else {
			logger.fail("Kiosk tab is not displayed");
		}
	}

	// create new kiosk
	public static void AddNewKiosk(int iTestCaseRow) throws Exception {
		// Click New Button
		CMWeb_ConfigurationPage.btnNewKeyword().click();
		if (CMWeb_ConfigurationPage.txtSourceName().isDisplayed()) {
			logger.pass("Kiosk create page was displayed");
		} else {
			logger.fail("New Button was not clicked.");
		}

		// input Source name
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtSourceName().sendKeys(sName);
		logger.info(" Kiosk name was entered.");

		// tick sharing
		String sSharing = ExcelUtils.getCellData(iTestCaseRow,Constant.Col_SharingPub);
		if (sSharing.equals("Global")) {
			CMWeb_ConfigurationPage.chckboxGlobalTax().click();
			logger.info("Global Sharing was ticked.");
		} else if (sSharing.equals("HQ")) {
			CMWeb_ConfigurationPage.chckboxHQTax().click();
			CMWeb_ConfigurationPage.chckboxHQTax().click();
			logger.info("HQ Sharing was ticked.");
		}

	}

	// Save kiosk
	public static void SaveKiosk(int iTestCaseRow) throws Exception {
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		// Click Save
		CMWeb_ConfigurationPage.btnSaveKeyword().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass(sName + " kiosk was successfully saved.");
	}

	// Search Kiosk
	public static void SearchKiosk(int iTestCaseRow) throws Exception {

		// search kiosk
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtSearchKeyword().sendKeys(sName);
		logger.info("Kiosk name: " + sName + " was entered");
		CMWeb_ConfigurationPage.btnSearchKeyword().click();
		Thread.sleep(5000);
		if (CMWeb_ConfigurationPage.chckboxKiosk().isDisplayed()) {
			logger.pass("Kiosk was successfully searched");
		} else {
			logger.fail("No records existing");
		}

	}

	// Delete kiosk
	public static void DeleteKiosk(int iTestCaseRow) throws Exception {
		// select kiosk
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.chckboxKiosk().click();
		logger.info(sName + " Kiosk to delete was selected");

		// click delete button
		CMWeb_ConfigurationPage.btnDeleteKeyword().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass("Kiosk was successfully deleted.");
	}
	
	// Edit Kiosk
	public static void EditKiosk(int iTestCaseRow) throws Exception {

		// tick kiosk to edit
		CMWeb_ConfigurationPage.chckboxKiosk().click();
		if (CMWeb_ConfigurationPage.txtSourceName().isDisplayed()) {
			logger.pass("Kiosk was able to edit.");
		} else {
			logger.fail("Edit button was not clicked.");
		}
		
		// tick sharing
		String sSharing = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_RoleLevel);
		if (sSharing.equals("Global")) {
			CMWeb_ConfigurationPage.chckboxGlobalTax().click();
			logger.info("Global Sharing was ticked.");
		} else if (sSharing.equals("HQ")) {
			CMWeb_ConfigurationPage.chckboxGlobalTax().click();
			logger.info("HQ Sharing was ticked.");
		}
	}

}
