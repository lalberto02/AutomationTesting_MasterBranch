package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class ManagingSourceFunction extends Report {

	// Go to Source tab
	public static void GoToSourceTab(int iTestCaseRow) throws Exception {

		// Click source tab
		CMWeb_ConfigurationPage.btnSource().click();
		if (CMWeb_ConfigurationPage.btnNewKeyword().isDisplayed()) {
			logger.pass("Source tab is displayed");
		} else {
			logger.fail("Source tab is not displayed");
		}
	}
	
	// create new source
		public static void AddNewSource(int iTestCaseRow) throws Exception {
			// Click New Button
			CMWeb_ConfigurationPage.btnNewKeyword().click();
			if (CMWeb_ConfigurationPage.txtSourceName().isDisplayed()) {
				logger.pass("Source create page was displayed");
			} else {
				logger.fail("New Button was not clicked.");
			}

			// input Source name
			 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			CMWeb_ConfigurationPage.txtSourceName().sendKeys(sName);
			logger.info("Source name: " + sName + " was entered.");

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
		
		// Save source
		public static void SaveSource(int iTestCaseRow) throws Exception {
			String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			// Click Save
			CMWeb_ConfigurationPage.btnSaveKeyword().click();
			Thread.sleep(5000);
			CMWeb_ConfigurationPage.alertOkay().accept();
			logger.pass(sName + " Source was successfully saved");
		}
		
		// Search Source
		public static void SearchSource(int iTestCaseRow) throws Exception {

			// search source
			 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			CMWeb_ConfigurationPage.txtSearchKeyword().sendKeys(sName);
			logger.info("Source name: " + sName + " was entered");
			CMWeb_ConfigurationPage.btnSearchKeyword().click();
			Thread.sleep(5000);
			if (CMWeb_ConfigurationPage.chckboxSource().isDisplayed()) {
			} else {
				logger.fail("No records existing");
			}

		}
		
		// Edit Source
		public static void EditSource(int iTestCaseRow) throws Exception {

			// tick source to edit
			CMWeb_ConfigurationPage.chckboxSource().click();
			if (CMWeb_ConfigurationPage.txtSourceName().isDisplayed()) {
				logger.pass("Source was able to edit.");
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
		
		// Delete recipe source 
		public static void DeleteSource(int iTestCaseRow) throws Exception {
			// select source
			 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			CMWeb_ConfigurationPage.chckboxSource().click();
			logger.info(sName + " Source to delete was selected");

			// click delete button
			CMWeb_ConfigurationPage.btnDeleteKeyword().click();
			Thread.sleep(5000);
			CMWeb_ConfigurationPage.alertOkay().accept();
			Thread.sleep(5000);
			CMWeb_ConfigurationPage.alertOkay().accept();
			logger.pass("Source was successfully deleted.");
		}

}
