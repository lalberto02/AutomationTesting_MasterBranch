package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class ManagingTaxRatesFunction extends Report {

	// Go to Tax rates tab
	public static void GoToTaxRatesTab(int iTestCaseRow) throws Exception {

		// Click tax rate
		CMWeb_ConfigurationPage.btnTaxRates().click();
		if (CMWeb_ConfigurationPage.btnNewKeyword().isDisplayed()) {
			logger.pass("Tax Rates tab is displayed");
		} else {
			logger.fail("Tax Rates tab is not displayed");
		}
	}

	// create new tax rates
	public static void AddNewTaxRates(int iTestCaseRow) throws Exception {
		// Click New Button
		CMWeb_ConfigurationPage.btnNewKeyword().click();
		if (CMWeb_ConfigurationPage.txtTaxName().isDisplayed()) {
			logger.pass("Tax Rates create page was displayed");
		} else {
			logger.fail("New Button was not clicked.");
		}

		// input tax name
		 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtTaxName().sendKeys(sName);
		logger.info("Tax name: " + sName + " was entered.");

		// input tax rate
		 String sRate = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_RoleType);
		CMWeb_ConfigurationPage.txtTaxRate().sendKeys(sRate);
		logger.info("Tax rate: " + sRate + " was entered.");

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

	// Save Tax Rate
	public static void SaveTaxRate(int iTestCaseRow) throws Exception {
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		// Click Save
		CMWeb_ConfigurationPage.btnSaveKeyword().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass(sName + " Tax Rate  was successfully saved");
	}

	// Search Tax Rate
	public static void SearchTaxRate(int iTestCaseRow) throws Exception {

		// search tax rate
		 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtSearchKeyword().sendKeys(sName);
		logger.info("Nutrient set name: " + sName + " was entered");
		CMWeb_ConfigurationPage.btnSearchKeyword().click();
		if (CMWeb_ConfigurationPage.chckboxTaxRate().isDisplayed()) {
			logger.pass("Tax Rate was successfully searched");
		} else {
			logger.fail("No records existing");
		}

	}

	// Edit tax rate
	public static void EditTaxRate(int iTestCaseRow) throws Exception {

		// tick tax rate to edit
		CMWeb_ConfigurationPage.chckboxTaxRate().click();
		if (CMWeb_ConfigurationPage.txtTaxName().isDisplayed()) {
			logger.pass("Tax Rate was able to edit.");
		} else {
			logger.fail("Edit button was not clicked.");
		}

		 String sRate = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_RoleType);
		CMWeb_ConfigurationPage.txtTaxRate().clear();
		CMWeb_ConfigurationPage.txtTaxRate().sendKeys(sRate);
		logger.info("Tax rate was Changed.");

	}
	
	// Delete tax rate
	public static void DeleteNutrientSet(int iTestCaseRow) throws Exception {
		// select print profile
		 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.chckboxTaxRate().click();
		logger.info(" Tax Rate to delete was selected");

		// click delete button
		CMWeb_ConfigurationPage.btnDeleteKeyword().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass(sName + "Tax Rate was successfully deleted.");
	}

}
