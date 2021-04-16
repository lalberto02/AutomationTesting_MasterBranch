package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class ManagingMerchSupplierFunction extends Report {

	// Go to Supplier tab
	public static void GoToSupplierTab(int iTestCaseRow) throws Exception {

		// Click tax rate
		CMWeb_ConfigurationPage.btnMerchSupplier().click();
		if (CMWeb_ConfigurationPage.btnNewKeyword().isDisplayed()) {
			logger.pass("Supplier tab is displayed");
		} else {
			logger.fail("Supplier tab is not displayed");
		}
	}

	// create new mechandise supplier
	public static void AddNewSupplier(int iTestCaseRow) throws Exception {
		// Click New Button
		CMWeb_ConfigurationPage.btnNewKeyword().click();
		if (CMWeb_ConfigurationPage.txtMerchSupplierName().isDisplayed()) {
			logger.pass("Supplier create page was displayed");
		} else {
			logger.fail("New Button was not clicked.");
		}
		
		// input supplier number
		 String sNumber = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Number);
		CMWeb_ConfigurationPage.txtMerchSupplierNumber().sendKeys(sNumber);
		logger.info("Supplier number: " + sNumber + " was entered .");

		// input supplier name
		 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtMerchSupplierName().sendKeys(sName);
		logger.info("Supplier name: " + sName + " was entered .");

		// input supplier company
		 String sCompany = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Category);
		CMWeb_ConfigurationPage.txtMerchSupplierCompany().sendKeys(sCompany);
		logger.info("Supplier company: " + sCompany + " was entered .");

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
	
	// Save Supplier
	public static void SaveSupplier(int iTestCaseRow) throws Exception {
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		// Click Save
		CMWeb_ConfigurationPage.btnSaveSupplier().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass(sName + " Supplier was successfully saved");
	}
	
	// Search Supplier
	public static void SearchSupplier(int iTestCaseRow) throws Exception {
		// search supplier
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtSearchKeyword().sendKeys(sName);
		logger.info("Supplier name: " + sName + " was entered");
		CMWeb_ConfigurationPage.btnSearchKeyword().click();
		Thread.sleep(5000);
		if (CMWeb_ConfigurationPage.chckboxSupplier().isDisplayed()) {
			logger.pass("Supplier was successfully searched");
		} else {
			logger.fail("No records existing");
		}

	}
	
	// Edit supplier
	public static void EditSupplier(int iTestCaseRow) throws Exception {

		// tick supplier to edit
		CMWeb_ConfigurationPage.chckboxSupplier().click();
		if (CMWeb_ConfigurationPage.txtMerchSupplierName().isDisplayed()) {
			logger.pass("Supplier was able to edit.");
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
	
	// Delete Supplier
	public static void DeleteSupplier(int iTestCaseRow) throws Exception {
		// select prefix
		 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.chckboxSupplier().click();
		logger.info(sName + " Supplier to delete was selected");

		// click delete button
		CMWeb_ConfigurationPage.btnDeleteKeyword().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
	}

}
