package FunctionLibraries;

import java.io.IOException;

import ObjectRepository.CMWeb_ConfigurationPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class ManagingBrandFunction extends Report {

	// Go to brand tab
	public static void GoToBrandTab(int iTestCaseRow) throws Exception {

		// Click tax rate
		CMWeb_ConfigurationPage.btnMerchBrand().click();
		if (CMWeb_ConfigurationPage.btnNewKeyword().isDisplayed()) {
			logger.pass("Brand tab is displayed");
		} else {
			logger.fail("Brand tab is not displayed");
		}
	}

	// create new mechandise brand
	public static void AddNewBrand(int iTestCaseRow) throws Exception {
		// Click New Button
		CMWeb_ConfigurationPage.btnNewKeyword().click();
		if (CMWeb_ConfigurationPage.drpdwnParentBrand().isDisplayed()) {
			logger.pass("Brand create page was displayed");
		} else {
			logger.fail("New Button was not clicked.");
		}

		// select parent brand
		 String sParent = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Parent);
		CMWeb_ConfigurationPage.drpdwnParentBrand().click();
		CMWeb_ConfigurationPage.drpdwnParentBrand().sendKeys(sParent);
		logger.info("Parent Brand: " + sParent + " was selected.");

		// input english translation
		 String sEnglish = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		CMWeb_ConfigurationPage.txtTaxRate().sendKeys(sEnglish);
		logger.info(sEnglish + " English Translation was entered.");

		// input french translation
		 String sFrench = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_French);
		CMWeb_ConfigurationPage.txtFrenchBrand().sendKeys(sFrench);
		logger.info(sFrench + " French Translation was entered.");

		// input german translation
		 String sGerman = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_German);
		CMWeb_ConfigurationPage.txtGermanBrand().sendKeys(sGerman);
		logger.info(sGerman + " German Translation was entered.");

		// input italian translation
		 String sItalian = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Italian);
		CMWeb_ConfigurationPage.txtItalianBrand().sendKeys(sItalian);
		logger.info(sItalian + " Italian Translation was entered.");

		// tick used as a parent brand
		 String sUseParent = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UseParent);
		if (sUseParent.equals("Yes")) {
			CMWeb_ConfigurationPage.chckboxParentBrand().click();
			logger.info("Can be used as a parent was ticked.");
		} else {
			logger.info("Can be used as a parent was not ticked.");
		}

		// tick sharing
		String sSharing = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Sharing);
		if (sSharing.equals("Global")) {
			CMWeb_ConfigurationPage.chckboxGlobalTax().click();
			logger.info("Global Sharing was ticked.");
		} else if (sSharing.equals("HQ")) {
			CMWeb_ConfigurationPage.chckboxHQTax().click();
			CMWeb_ConfigurationPage.chckboxHQTax().click();
			logger.info("HQ Sharing was ticked.");
		}

	}
	
	// Save Brand
		public static void SaveBrand(int iTestCaseRow) throws Exception {
			String sEnglish = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
			// Click Save
			CMWeb_ConfigurationPage.btnSaveKeyword().click();
			Thread.sleep(5000);
			CMWeb_ConfigurationPage.alertOkay().accept();
			logger.pass(sEnglish + " Brand was successfully saved");
		}
		
		// Search Brand
		public static void SearchBrand(int iTestCaseRow) throws Exception {

			// search brand
			String sEnglish = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
			CMWeb_ConfigurationPage.txtSearchKeyword().sendKeys(sEnglish);
			logger.info("Brand name: " + sEnglish + " was entered");
			CMWeb_ConfigurationPage.btnSearchKeyword().click();
			Thread.sleep(5000);
			if (CMWeb_ConfigurationPage.chckboxBrand().isDisplayed()) {
				logger.pass("Brand was successfully searched");
			} else {
				logger.fail("No records existing");
			}

		}
		
		// Edit brand
		public static void EditBrand(int iTestCaseRow) throws Exception {

			// tick brand to edit
			CMWeb_ConfigurationPage.chckboxBrand().click();
			if (CMWeb_ConfigurationPage.txtTaxRate().isDisplayed()) {
				logger.pass("Brand was able to edit.");
			} else {
				logger.fail("Edit button was not clicked.");
			}

			// change german Translation
			 String sGerman = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_German);
			String sNewGerman = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NewEnglish);
			CMWeb_ConfigurationPage.txtGermanBrand().clear();
			CMWeb_ConfigurationPage.txtGermanBrand().sendKeys(sNewGerman);
			logger.info(sGerman + " was changed to " + sNewGerman);

		}
		
		// Delete brand
		public static void DeleteBrand(int iTestCaseRow) throws Exception {
			// select print profile
			 String sNewEnglish = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NewEnglish);
			CMWeb_ConfigurationPage.chckboxBrand().click();
			logger.info(" Brand to delete was selected");

			// click delete button
			CMWeb_ConfigurationPage.btnDeleteKeyword().click();
			Thread.sleep(5000);
			CMWeb_ConfigurationPage.alertOkay().accept();
			Thread.sleep(5000);
			CMWeb_ConfigurationPage.alertOkay().accept();
			logger.pass(sNewEnglish + " Brand was successfully deleted.");
		}

}
