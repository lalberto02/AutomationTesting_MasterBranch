package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class ManagingSetofPriceFunction extends Report {

	// Go to Purchasing Set of Price tab
	public static void GoToPurchasingSetTab(int iTestCaseRow) throws Exception {

		// Click Merchandise
		CMWeb_ConfigurationPage.btnPurchaseSet().click();
		if (CMWeb_ConfigurationPage.btnNewKeyword().isDisplayed()) {
			logger.pass("Purchasing Set of Price tab is displayed");
		} else {
			logger.fail("Purchasing Set of Price tab is not displayed");
		}
	}

	// Create Purchasing Set of Price
	public static void CreatePurchasingSet(int iTestCaseRow) throws Exception {

		// Click new button
		CMWeb_ConfigurationPage.btnNewKeyword().click();
		if (CMWeb_ConfigurationPage.drpdwnCurrency().isDisplayed()) {
			logger.pass("Purchasing set of price create page was displayed");
		} else {
			logger.fail("New Button was not clicked.");
		}

		// select currency
		String sCurrency = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Currency);
		CMWeb_ConfigurationPage.drpdwnCurrency().click();
		CMWeb_ConfigurationPage.drpdwnCurrency().sendKeys(sCurrency);
		logger.info(sCurrency + " Currency was successfully selected.");

		// input purchasing set of price
		 String sPurchasePrice = ExcelUtils.getCellData(iTestCaseRow,
		 Constant.Col_PurchasePrice);
		CMWeb_ConfigurationPage.txtSetPrice().sendKeys(sPurchasePrice);
		logger.info("Purchasing Set of Price: " + sPurchasePrice + " was entered.");

		// input Factor of Purchasing Set of Price to Main Purchasing Set of Price
		 String sFactor = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Factor);
		CMWeb_ConfigurationPage.txtFactor().clear();
		CMWeb_ConfigurationPage.txtFactor().sendKeys(sFactor);
		logger.info(sFactor + " Factor of Purchasing Set of Price to Main Purchasing Set of Price was entered");
	}

	// save purchasing set of price
	public static void SavePurchasingPrice(int iTestCaseRow) throws Exception {

		// Click save button
		CMWeb_ConfigurationPage.btnSaveKeyword().click();
		Thread.sleep(45000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		/*
		 * Thread.sleep(5000); CMWeb_ConfigurationPage.alertOkay().accept();
		 */
		logger.pass("Purchasing set of Price was successfully saved.");
	}

	// Search Purchase Set
	public static void SearchPurchaseSet(int iTestCaseRow) throws Exception {

		// search nutrient set
		String sPurchasePrice = ExcelUtils.getCellData(iTestCaseRow,Constant.Col_PurchasePrice);
		CMWeb_ConfigurationPage.txtSearchKeyword().sendKeys(sPurchasePrice);
		logger.info("Purchasing set name: " + sPurchasePrice + " was entered");
		CMWeb_ConfigurationPage.btnSearchKeyword().click();
		if (CMWeb_ConfigurationPage.chckboxPurchasingSet().isDisplayed()) {
			logger.pass("Purchasing set was successfully searched");
		} else {
			logger.fail("No records existing");
		}
	}

	// Edit purchasing set
	public static void EditPurchasingSet(int iTestCaseRow) throws Exception {

		// Click Edit button
		CMWeb_ConfigurationPage.btnEditPurchasingSet().click();
		if (CMWeb_ConfigurationPage.txtFactor().isDisplayed()) {
			logger.pass("Purchasing Set of Price was able to edit.");
		} else {
			logger.fail("Edit Button was not clicked.");
		}

		// input Factor of Purchasing Set of Price to Main Purchasing Set of Price
		 String sFactor = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Factor);
		CMWeb_ConfigurationPage.txtFactor().clear();
		CMWeb_ConfigurationPage.txtFactor().sendKeys(sFactor);
		logger.info("New Factor of Purchasing Set of Price to Main Purchasing Set of Price was set to: " + sFactor);

	}

	// Delete Purchasing Set
	public static void DeletePurchasingSet(int iTestCaseRow) throws Exception {
		String sPurchasePrice = ExcelUtils.getCellData(iTestCaseRow,Constant.Col_PurchasePrice);
		CMWeb_ConfigurationPage.chckboxPurchasingSet().click();
		logger.info("Purchasing Set: " + sPurchasePrice + " to delete was selected");

		// click delete button
		CMWeb_ConfigurationPage.btnDeleteKeyword().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		Thread.sleep(30000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass(sPurchasePrice + " Purchasing Set was successfully deleted.");

	}
}
