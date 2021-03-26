package FunctionLibraries;

import ObjectRepository.CMWeb_MenuPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class MenuFunction extends Report {

	// Go to Menu tab
	public static void GoToMenu(int iTestCaseRow) throws Exception {

		// Click Menu
		CMWeb_MenuPage.btnMenu().click();
		// reporting validation
		if (CMWeb_MenuPage.lblMenu().isDisplayed()) {
			logger.pass("Menu Tab was displayed");
		} else {
			logger.fail("Menu button was not clicked");
		}

	}
	
	// Fill up Menu Main Page
		public static void CreateMenuMain(int iTestCaseRow) throws Exception {

			// Click new merchandise button
			CMWeb_MenuPage.btnNewMenu().click();
			// reporting
			if (CMWeb_MenuPage.txtMenuName().isDisplayed()) {
				logger.pass("Create Menu tab was displayed.");
			} else {
				logger.fail("New button was not clicked.");
			}
			
			// Input Menu Name
			String sMenuName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			CMWeb_MenuPage.txtMenuName().sendKeys(sMenuName);
			// Reporting
			logger.info("Menu name: " + sMenuName + " was entered");
			
			// select category
			String sCategory = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_MenuCategory);
			CMWeb_MenuPage.drpdownCategory().click();
			CMWeb_MenuPage.drpdownCategory().sendKeys(sCategory);
			// Reporting
			logger.info(sCategory + " Menu category was selected.");
			
			// select source
			String sSource = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_MenuSource);
			CMWeb_MenuPage.drpdownSource().click();
			CMWeb_MenuPage.drpdownSource().sendKeys(sSource);
			// Reporting
			logger.info(sSource + " Menu source was selected.");
			
			// Input Portion
			String sPortion = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_MenuPortion);
			CMWeb_MenuPage.txtPortion().clear();
			CMWeb_MenuPage.txtPortion().sendKeys(sPortion);
			// Reporting
			logger.info( sPortion + " portion was entered.");
			
			//click calculate
			CMWeb_MenuPage.btnCalculate().click();
			Thread.sleep(5000);
			CMWeb_MenuPage.alertOkay().accept();
			logger.info( "Calculate button was clicked.");
			
			// main tab reporting
			logger.pass("Create Menu Main Tab was populated");
		}
		
		// add item and procedure
		public static void AddItemProcedure(int iTestCaseRow) throws Exception {

			// go to item and procedure tab
			CMWeb_MenuPage.btnItemProd().click();
			// validation
			if (CMWeb_MenuPage.txtSearchItem().isDisplayed()) {
				logger.pass("Item and Procedure tab was displayed.");
			} else {
				logger.fail("Item and procedure button was not clicked");
			}

			// search item
			String sSearch = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_MenuItem);
			CMWeb_MenuPage.txtSearchItem().sendKeys(sSearch);
			logger.info(" Item was entered");
			CMWeb_MenuPage.btnSearch().click();
			if (CMWeb_MenuPage.txtNetQty().isDisplayed()) {
				// Enter Net Quantity
				String sNetQTY = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_MenuNeyQTY);
				CMWeb_MenuPage.txtNetQty().sendKeys(sNetQTY);
				// add ingredient
				CMWeb_MenuPage.btnAddItem().click();
				// reporting
				logger.pass(sSearch + " was added as item.");
			} else {
				logger.fail("No item was searched.");
			}

		}
		
		// add Nutrient
		public static void AddNutrient(int iTestCaseRow) throws Exception {

			// go to nutrient tab
			CMWeb_MenuPage.btnNutrient().click();
			// validation
			if (CMWeb_MenuPage.txtImposedNutrient().isDisplayed()) {
				// input Imposed Nutrient
				String sNutrient = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ImposedNutrient);
				CMWeb_MenuPage.txtImposedNutrient().clear();
				CMWeb_MenuPage.txtImposedNutrient().sendKeys(sNutrient);
				logger.pass(sNutrient + " nutrient/s was added.");
			} else {
				logger.fail("No nutrient was added.");
			}

		}
		
		// save menu 
		public static void SaveMenu(int iTestCaseRow) throws Exception {
			String sMenuName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			// Click save button
			CMWeb_MenuPage.btnSave().click();
			// validation reporting screenshot
			Thread.sleep(5000);
			CMWeb_MenuPage.alertOkay().accept();
			logger.pass(sMenuName + " menu was saved.");
		}
		
		// search created menu
		public static void SearchCreatedMenu(int iTestCaseRow) throws Exception {

			// click list button
			CMWeb_MenuPage.btnList().click();
			Thread.sleep(5000);
			if (CMWeb_MenuPage.txtSearchMenu().isDisplayed()) {
				String sMenuName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
				CMWeb_MenuPage.txtSearchMenu().sendKeys(sMenuName);
				CMWeb_MenuPage.btnSearchMenu().click();
				if (CMWeb_MenuPage.linkSearchedMenu().isDisplayed()) {
					logger.pass(sMenuName + " was successfully created");
				} else {
					logger.fail(sMenuName + " was not included in the menu list.");
				}

			} else {
				logger.fail("List Button was not clicked.");
			}

		}
		
		// view recent menu
		public static void ViewRecentMenu(int iTestCaseRow) throws Exception {
			CMWeb_MenuPage.linkHistory().click();
			// validation reporting
			if (CMWeb_MenuPage.lblMenuName().isDisplayed()) {
				logger.pass("Successfully viewed Menu from History");
			} else {
				logger.fail("No Records in the history pane");
			}
		}

}
