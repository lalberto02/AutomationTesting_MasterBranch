package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class ManagingNutrientSetFunction extends Report {

	// Go to Nutrient Set tab
	public static void GoToNutrientSetTab(int iTestCaseRow) throws Exception {

		// Click Merchandise
		CMWeb_ConfigurationPage.btnNutrientSet().click();
		if (CMWeb_ConfigurationPage.btnNew().isDisplayed()) {
			logger.pass("Nutrient Set tab is displayed");
		} else {
			logger.fail("Nutrient Set tab is not displayed");
		}
	}

	// Create Nutrient Set
	public static void CreateNutrientSet(int iTestCaseRow) throws Exception {

			// Click new button
			CMWeb_ConfigurationPage.btnNew().click();
			if (CMWeb_ConfigurationPage.txtNutrientSet().isDisplayed()) {
				logger.pass("Nutrient set create page was displayed");
			} else {
				logger.fail("New Button was not clicked.");
			}
			
			// input nutrient set name
			 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			CMWeb_ConfigurationPage.txtNutrientSet().sendKeys(sName);
			logger.info(sName + " Nutrient Set was entered.");
			
			// select translation
			 String sDatabase = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Database);
			CMWeb_ConfigurationPage.drpdwnDatabase().click();
			CMWeb_ConfigurationPage.drpdwnDatabase().sendKeys(sDatabase);
			logger.info(sDatabase + " Database was selected.");
			
			
	}
	
	// Save Nutrient Set
	public static void SaveNutrientSet(int iTestCaseRow) throws Exception {
			 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			// Click Save
			CMWeb_ConfigurationPage.btnSave().click();
			Thread.sleep(5000);
			CMWeb_ConfigurationPage.alertOkay().accept();
			logger.pass(sName + " Nutrient set was successfully saved");
		}
		
	// Search Nutrient Set
	public static void SearchNutrientSet(int iTestCaseRow) throws Exception {

			// search nutrient set
			 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			CMWeb_ConfigurationPage.txtSearch().sendKeys(sName);
			logger.info("Nutrient set name: " + sName + " was entered");
			CMWeb_ConfigurationPage.btnSearch().click();
			if (CMWeb_ConfigurationPage.chckboxNutrientSet().isDisplayed()) {
				logger.pass("Nutrient set was successfully searched");
			} else {
				logger.fail("No records existing");
			}
		}
	
	// Edit nutrient set
		public static void EditNutrientSet(int iTestCaseRow) throws Exception {

			// Click Edit button
			CMWeb_ConfigurationPage.btnEditNutrientSet().click();
			if (CMWeb_ConfigurationPage.txtNutrientSet().isDisplayed()) {
				logger.pass("Nutrient Set was able to edit.");
			} else {
				logger.fail("Edit Button was not clicked.");
			}

			// change role name
			 String sNewNutrientSetName = ExcelUtils.getCellData(iTestCaseRow,
			 Constant.Col_NewName);
			CMWeb_ConfigurationPage.txtNutrientSet().clear();
			CMWeb_ConfigurationPage.txtNutrientSet().sendKeys(sNewNutrientSetName);
			logger.info("Nutrient set name was changed to " + sNewNutrientSetName);

		}

		// Delete NutrientSet
		public static void DeleteNutrientSet(int iTestCaseRow) throws Exception {
			// select print profile
			 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			CMWeb_ConfigurationPage.chckboxNutrientSet().click();
			logger.info(sName + " Nutrient set to delete was selected");

			// click delete button
			CMWeb_ConfigurationPage.btnDelete().click();
			Thread.sleep(5000);
			CMWeb_ConfigurationPage.alertOkay().accept();
			Thread.sleep(5000);
			CMWeb_ConfigurationPage.alertOkay().accept();
			logger.pass("Nutrient set was successfully deleted.");
		}

}
