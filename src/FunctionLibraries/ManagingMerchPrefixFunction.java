package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class ManagingMerchPrefixFunction extends Report {

	// Go to prefix tab
	public static void GoToPrefixTab(int iTestCaseRow) throws Exception {

		// Click tax rate
		CMWeb_ConfigurationPage.btnPrefix().click();
		if (CMWeb_ConfigurationPage.btnNewKeyword().isDisplayed()) {
			logger.pass("Prefix tab is displayed");
		} else {
			logger.fail("Prefix tab is not displayed");
		}
	}
	
	// create new mechandise prefix
		public static void AddNewPrefix(int iTestCaseRow) throws Exception {
			// Click New Button
			CMWeb_ConfigurationPage.btnNewKeyword().click();
			if (CMWeb_ConfigurationPage.txtMerchPrefixName().isDisplayed()) {
				logger.pass("Prefix create page was displayed");
			} else {
				logger.fail("New Button was not clicked.");
			}

			// input prefix name
			 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			CMWeb_ConfigurationPage.txtMerchPrefixName().click();
			CMWeb_ConfigurationPage.txtMerchPrefixName().sendKeys("EGS prefix 0329");
			logger.info("Prefix name: " + sName + " was entered .");

			// Select state
			 String sState = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_State);
			CMWeb_ConfigurationPage.drpdwnState().click();
			CMWeb_ConfigurationPage.drpdwnState().sendKeys("Feminine");
			logger.info("Prefix state : " + sState + " was selected.");

			// Select language
			 String sLanguage = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Language);
			CMWeb_ConfigurationPage.drpdwnLanguage().click();
			CMWeb_ConfigurationPage.drpdwnLanguage().sendKeys("English");
			logger.info(sLanguage + " Prefix languages was selected.");

			// tick sharing
			String sSharing = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_SharingPub);
			if (sSharing.equals("Global")) {
				CMWeb_ConfigurationPage.chckboxGlobalTax().click();
				logger.info("Global Sharing was ticked.");
			} else if (sSharing.equals("HQ")) {
				CMWeb_ConfigurationPage.chckboxHQTax().click();
				CMWeb_ConfigurationPage.chckboxHQTax().click();
				logger.info("HQ Sharing was ticked.");
			}

		}
		
		// Save Prefix
		public static void SavePrefix(int iTestCaseRow) throws Exception {
			String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			// Click Save
			CMWeb_ConfigurationPage.btnSavePrefix().click();
			Thread.sleep(5000);
			CMWeb_ConfigurationPage.alertOkay().accept();
			logger.pass(sName + " Prefix was successfully saved");
		}
		
		// Search Prefix
		public static void SearchPrefix(int iTestCaseRow) throws Exception {
			// search prefix
			String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			CMWeb_ConfigurationPage.txtSearchKeyword().sendKeys("EGS prefix 0329");
			logger.info("Prefix name: " + sName + " was entered");
			CMWeb_ConfigurationPage.btnSearchKeyword().click();
			Thread.sleep(5000);
			if (CMWeb_ConfigurationPage.chckboxPrefix().isDisplayed()) {
				logger.pass("Prefix was successfully searched");
			} else {
				logger.fail("No records existing");
			}

		}
		
		// Edit prefix
		public static void EditPrefix(int iTestCaseRow) throws Exception {

			// tick source to edit
			CMWeb_ConfigurationPage.btnEditPrefix().click();
			if (CMWeb_ConfigurationPage.txtMerchPrefixName().isDisplayed()) {
				logger.pass("Prefix was able to edit.");
			} else {
				logger.fail("Edit button was not clicked.");
			}
			
			// tick sharing
			String sSharing = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_SharingPub);
			if (sSharing.equals("Global")) {
				CMWeb_ConfigurationPage.chckboxGlobalTax().click();
				logger.info("Global Sharing was ticked.");
			} else if (sSharing.equals("HQ")) {
				CMWeb_ConfigurationPage.chckboxGlobalTax().click();
				logger.info("HQ Sharing was ticked.");
			}
		}
		
		// Delete prefix
		public static void DeletePrefix(int iTestCaseRow) throws Exception {
			// select prefix
			 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			CMWeb_ConfigurationPage.chckboxPrefix().click();
			logger.info(sName + " Prefix to delete was selected");

			// click delete button
			CMWeb_ConfigurationPage.btnDeleteKeyword().click();
			Thread.sleep(5000);
			CMWeb_ConfigurationPage.alertOkay().accept();
			Thread.sleep(5000);
			CMWeb_ConfigurationPage.alertOkay().accept();
			logger.pass("Prefix was successfully deleted.");
		}

}
