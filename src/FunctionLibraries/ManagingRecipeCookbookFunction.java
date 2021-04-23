package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class ManagingRecipeCookbookFunction extends Report {

	// Go to Cookbook tab
	public static void GoToCookbookTab(int iTestCaseRow) throws Exception {

		// Click tax rate
		CMWeb_ConfigurationPage.btnCookbook().click();
		if (CMWeb_ConfigurationPage.btnNewKeyword().isDisplayed()) {
			logger.pass("Cookbook tab is displayed");
		} else {
			logger.fail("Cookbook tab is not displayed");
		}
	}
	
	// create new recipe cookbook
		public static void AddNewCookbook(int iTestCaseRow) throws Exception {
			// Click New Button
			CMWeb_ConfigurationPage.btnNewKeyword().click();
			if (CMWeb_ConfigurationPage.drpdwnPubParent().isDisplayed()) {
				logger.pass("Cookbook create page was displayed");
			} else {
				logger.fail("New Button was not clicked.");
			}

			// select parent brand
			 String sParent = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Parent);
			CMWeb_ConfigurationPage.drpdwnPubParent().click();
			CMWeb_ConfigurationPage.drpdwnPubParent().sendKeys(sParent);
			logger.info("Parent cookbook was selected.");

			// input cookbook name
			 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
			CMWeb_ConfigurationPage.txtPubName().sendKeys(sName);
			logger.info("Cookbook name: " + sName + " was entered.");

			// tick used as a parent publication
			String sUseParent = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UseParentPub);
			if (sUseParent.equals("Yes")) {
				CMWeb_ConfigurationPage.chckboxParentPub().click();
				logger.info("Can be used as a parent was ticked.");
			} else {
				logger.info("Can be used as a parent was not ticked.");
			}

			// tick sharing
			String sSharing = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_SharingPub);
			if (sSharing.equals("Global")) {
				CMWeb_ConfigurationPage.chckboxGlobalCookbook().click();
				logger.info("Global Sharing was ticked.");
			} else if (sSharing.equals("HQ")) {
				CMWeb_ConfigurationPage.chckboxHQTax().click();
				CMWeb_ConfigurationPage.chckboxHQTax().click();
				logger.info("HQ Sharing was ticked.");
			}

		}
		
	// Save cookbook
		public static void SaveCookbook(int iTestCaseRow) throws Exception {
			String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
			// Click Save
			CMWeb_ConfigurationPage.btnSaveKeyword().click();
			Thread.sleep(5000);
			CMWeb_ConfigurationPage.alertOkay().accept();
			logger.pass(sName + " Cookbook was successfully saved");
		}
		
		
	// Search Cookbook
		public static void SearchCookbook(int iTestCaseRow) throws Exception {
			// search cookbook
			 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
			CMWeb_ConfigurationPage.txtSearchKeyword().sendKeys(sName);
			logger.info("Cookbook name: " + sName + " was entered");
			CMWeb_ConfigurationPage.btnSearchKeyword().click();
			Thread.sleep(5000);
			if (CMWeb_ConfigurationPage.chckboxCookbook().isDisplayed()) {
				logger.pass("Cookbook was successfully searched");
			} else {
				logger.fail("No records existing");
			}

		}
		
	// Edit cookbook
		public static void EditCookbook(int iTestCaseRow) throws Exception {

			// tick cookbook to edit
			CMWeb_ConfigurationPage.chckboxCookbook().click();
			if (CMWeb_ConfigurationPage.txtPubName().isDisplayed()) {
				logger.pass("Cookbook was able to edit.");
			} else {
				logger.fail("Edit button was not clicked.");
			}

			// change name Translation
			 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
			String sNewName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NewPubName);
			CMWeb_ConfigurationPage.txtPubName().clear();
			CMWeb_ConfigurationPage.txtPubName().sendKeys(sNewName);
			logger.info(sName + " was changed to " + sNewName);

		}
		
	// Delete cookbook
		public static void DeleteCookbook(int iTestCaseRow) throws Exception {
			// select Cookbook
			 String sNewName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NewPubName);
			CMWeb_ConfigurationPage.txtSearchKeyword().sendKeys(sNewName);
			CMWeb_ConfigurationPage.btnSearchKeyword().click();
			Thread.sleep(5000);
			CMWeb_ConfigurationPage.chckboxCookbook().click();
			logger.info(sNewName + " Cookbook to delete was selected");

			// click delete button
			CMWeb_ConfigurationPage.btnDeleteKeyword().click();
			Thread.sleep(5000);
			CMWeb_ConfigurationPage.alertOkay().accept();
			Thread.sleep(5000);
			CMWeb_ConfigurationPage.alertOkay().accept();
			logger.pass("Cookbook was successfully deleted.");
		}

}
