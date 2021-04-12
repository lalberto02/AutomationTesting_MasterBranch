package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import ObjectRepository.CMWeb_MenuPlanPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class MenuPlanFunction extends Report {

	// Go to Menu Plan tab
	public static void GoToMenuPlan(int iTestCaseRow) throws Exception {

		// Click Merchandise
		CMWeb_MenuPlanPage.btnMenuPlan().click();
		if (CMWeb_MenuPlanPage.lblMenuPlan().isDisplayed()) {
			logger.pass("Menu Plan tab is displayed");
		} else {
			logger.fail("Menu Plan tab is not displayed");
		}
		// screenshot
	}

	// Go to Configuration tab
	public static void GoToConfiguration(int iTestCaseRow) throws Exception {

		// Click Merchandise
		CMWeb_MenuPlanPage.btnConfiguration().click();
		if (CMWeb_MenuPlanPage.btnRestauTab().isDisplayed()) {
			logger.pass("Menu Plan Configuration Page is displayed");
		} else {
			logger.fail("Configuration button was not click");
		}
	}

	// Go to Restaurant / Master Plan tab
	public static void GoToRestaurant(int iTestCaseRow) throws Exception {

		// Click Merchandise
		CMWeb_MenuPlanPage.btnRestauTab().click();
		if (CMWeb_MenuPlanPage.txtSearchRestau().isDisplayed()) {
			logger.pass("Restaurant / Master Plan tab is displayed");
		} else {
			logger.fail("Restaurant / Master Plan button was not click");
		}
	}

	// Create new master plan
	public static void CreateMasterplan(int iTestCaseRow) throws Exception {

		// Click add master plan
		CMWeb_MenuPlanPage.btnAddMenuPlan().click();
		if (CMWeb_MenuPlanPage.txtMasterPlanGroup().isDisplayed()) {
			logger.pass("Master Plan create page was displayed");
		} else {
			logger.fail("New Button was not clicked.");
		}

		// select master plan group
		String sGroup = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_MasterPlanGroup);
		CMWeb_MenuPlanPage.txtMasterPlanGroup().sendKeys(sGroup);
		logger.info(sGroup + " was entered as master plan group");

		// Input Master Plan name
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_MenuPlanPage.txtMasterPlanName().sendKeys(sName);
		logger.info(sName + " was entered.");

		// input French translation
		String sFrench = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_French);
		CMWeb_MenuPlanPage.txtMasterPlanFrench().sendKeys(sFrench);
		logger.info(sFrench + " french translation was entered.");

	}

	// Create new restaurant
	public static void CreateRestaurant(int iTestCaseRow) throws Exception {

		// Click add restaurant
		CMWeb_MenuPlanPage.btnAddRestau().click();
		if (CMWeb_MenuPlanPage.txtRestauName().isDisplayed()) {
			logger.pass("Restaurant create page was displayed");
		} else {
			logger.fail("New Button was not clicked.");
		}

		// Input Restaurant name
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_MenuPlanPage.txtRestauName().sendKeys(sName);
		logger.info(sName + " Restaurant was entered");

		// Select master plan
		CMWeb_MenuPlanPage.chckboxMasterMenuPlan().click();
		logger.info(" master plan was selected");
	}

	// Save Restaurant
	public static void SaveRestaurant(int iTestCaseRow) throws Exception {
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		// Click Save
		CMWeb_MenuPlanPage.btnSaveRestau().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.info(sName + " Restaurant was successfully saved");
	}

	// Save Master Plan
	public static void SaveMasterPlan(int iTestCaseRow) throws Exception {
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		// Click Save
		CMWeb_MenuPlanPage.btnSaveMasterPlan().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.info(sName + " Master Plan was successfully saved");
	}

	// Search Restaurant
	public static void SearchRestaurant(int iTestCaseRow) throws Exception {

		// Input search
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_MenuPlanPage.txtSearchRestau().sendKeys(sName);
		logger.info(sName + " restaurant name was entered");

		// click search
		CMWeb_MenuPlanPage.btnSearch().click();
		logger.info(sName + " Restaraunt was selected");
	}

	// delete restaurant
	public static void DeleteRestaurant(int iTestCaseRow) throws Exception {
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		// click remove button
		CMWeb_MenuPlanPage.btnRemoveRestau().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.info(sName + " Restaurant was successfully deleted");

	}

	// delete masterplan
	public static void DeleteMasterplan(int iTestCaseRow) throws Exception {
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		// click remove button
		CMWeb_MenuPlanPage.btnRemoveMenuPlan().click();
		logger.info(" Removed menu plan button was click");

		// select menu plan
		CMWeb_MenuPlanPage.chckboxMenuPlan().click();
		logger.info(sName + " Master Plan was selected");

		// click delete button
		CMWeb_MenuPlanPage.btnDeleteMenuPlan().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.info(sName + " Master Plan was successfully deleted");

	}

	// Create menu plan
	public static void CreateMenuPlan(int iTestCaseRow) throws Exception {

		// Click new merchandise button
		CMWeb_MenuPlanPage.btnNewMenuPlan().click();
		// reporting
		if (CMWeb_MenuPlanPage.txtMenuPlanName().isDisplayed()) {
			logger.pass("Create Menu Plan tab was displayed.");
		} else {
			logger.fail("New button was not clicked.");
		}

		// Input Menu Plan Name
		 String sMenuPlanName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_MenuPlanPage.txtMenuPlanName().sendKeys(sMenuPlanName);
		// Reporting
		logger.info("Menu plan name: " + sMenuPlanName + " was entered");

		// select category
		String sCategory = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_MenuCategory);
		CMWeb_MenuPlanPage.drpdownCategory().click();
		CMWeb_MenuPlanPage.drpdownCategory().sendKeys(sCategory);
		// Reporting
		logger.info(sCategory + " Menu plan category was selected.");

		// Input Planning Date
		String sPlanningDate = ExcelUtils.getCellData(iTestCaseRow,Constant.Col_PlanningDate);
		CMWeb_MenuPlanPage.txtPlanDate().sendKeys(sPlanningDate);
		// Reporting
		logger.info(sPlanningDate + " Planning date was entered");

		// select restaurant
		String sRestaurant = ExcelUtils.getCellData(iTestCaseRow,Constant.Col_Restaurant);
		CMWeb_MenuPlanPage.drpdownRestaurant().click();
		CMWeb_MenuPlanPage.drpdownRestaurant().sendKeys(sRestaurant);
		// Reporting
		logger.info(sRestaurant + " Menu plan restaurant was selected.");

		// Input Start Date
		String sStartDate = ExcelUtils.getCellData(iTestCaseRow,Constant.Col_StartDate);
		CMWeb_MenuPlanPage.txtStartDate().clear();
		CMWeb_MenuPlanPage.txtStartDate().sendKeys(sStartDate);
		// Reporting
		logger.info(sStartDate + " Start date was entered");

		// Input duration
		String sDuration = ExcelUtils.getCellData(iTestCaseRow,Constant.Col_Duration);
		CMWeb_MenuPlanPage.txtDuration().clear();
		CMWeb_MenuPlanPage.txtDuration().sendKeys(sDuration);
		// Reporting
		logger.info(sDuration + " Duration was entered");

		// Input recurrence
		String sRecurrence = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Recurrence);
		CMWeb_MenuPlanPage.txtRecurrence().clear();
		CMWeb_MenuPlanPage.txtRecurrence().sendKeys(sRecurrence);
		// Reporting
		logger.info(sRecurrence + " Recurrence was entered");

	}

	// save menu plan
	public static void SaveMenuPlan(int iTestCaseRow) throws Exception {
		String sMenuPlanName = ExcelUtils.getCellData(iTestCaseRow,Constant.Col_Name);
		// Click save button
		CMWeb_MenuPlanPage.btnSaveMenuPlan().click();
		// validation reporting screenshot
		logger.pass(sMenuPlanName + " Menu Plan was saved.");
	}

	// add menu plan item
	public static void AddMenuPlanItem(int iTestCaseRow) throws Exception {
		// click edit item
		CMWeb_MenuPlanPage.btnEditItem().click();
		if (CMWeb_MenuPlanPage.btnAddItem().isDisplayed()) {
			logger.pass("Edit item button was clicked");
		} else {
			logger.fail("Edit Button was not clicked.");
		}
		
		// add item
		// CMWeb_MenuPlanPage.btnAddItem().click();

	}

	// view recent menu
	public static void ViewRecentMenu(int iTestCaseRow) throws Exception {
		CMWeb_MenuPlanPage.linkHistory().click();
		// validation reporting
		if (CMWeb_MenuPlanPage.txtMenuPlanName().isDisplayed()) {
			logger.pass("Successfully viewed Menu Plan from History");
		} else {
			logger.fail("No Records in the history pane");
		}
	}

	// search created menu plan
	public static void SearchCreatedMenuPlan(int iTestCaseRow) throws Exception {

		// click list button
		CMWeb_MenuPlanPage.btnList().click();
		Thread.sleep(5000);
		if (CMWeb_MenuPlanPage.txtSearchMenuPlan().isDisplayed()) {
			String sMenuPlanName = ExcelUtils.getCellData(iTestCaseRow,Constant.Col_Name);
			CMWeb_MenuPlanPage.txtSearchMenuPlan().sendKeys(sMenuPlanName);
			CMWeb_MenuPlanPage.btnSearchMenuPlan().click();
			if (CMWeb_MenuPlanPage.linkSearchedMenuPlan().isDisplayed()) {
				CMWeb_MenuPlanPage.linkSearchedMenuPlan().click();
				logger.pass(sMenuPlanName + " was successfully created");
			} else {
				logger.fail(sMenuPlanName + " was not included in the menu plan list.");
			}

		} else {
			logger.fail("List Button was not clicked.");
		}

	}

	// Export menu plan
			public static void ExportMenuPlan(int iTestCaseRow) throws Exception {
				
				// click more actions
				CMWeb_MenuPlanPage.drpdownMoreAction().click();
				logger.info("More Action was successfully clicked");
				
				// click export
				CMWeb_MenuPlanPage.drpdownExport().click();
				logger.info("Export was successfully clicked");
				
				// choose selection to export
				String sExportSelection = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_MenuCategory);
				if (sExportSelection.equals("Recipe and Cost")){
					CMWeb_MenuPlanPage.btnRecipeCost().click();
					logger.pass("Recipe and Cost export was successfully downloaded.");						
				} else if (sExportSelection.equals("Recipe and Keywords")) {
					CMWeb_MenuPlanPage.btnRecipeKeyword().click();
					logger.pass("Recipe and Keywords export was successfully downloaded.");
				} else {
					logger.fail("No file was exported.");
				}
				
				
			}
}
