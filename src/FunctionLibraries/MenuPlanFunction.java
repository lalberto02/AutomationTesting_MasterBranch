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
			
		    //Go to Category
			public static void GoToMenuPlanCategoryTab(int iTestCaseRow) throws Exception{
				
				// Click Category
				CMWeb_MenuPlanPage.btnMPCategory().click();
				if (CMWeb_MenuPlanPage.btnNewMPConfig().isDisplayed()) {
					logger.pass("Menu Plan Category tab is displayed");
				} else {
					logger.fail("Menu Plan Category button was not click");
				}				
			}
			
			//Create new Category
			public static void CreateNewCategory(int iTestCaseRow) throws Exception{
				 
				// Click add category
				CMWeb_MenuPlanPage.btnNewMPConfig().click();
				if (CMWeb_MenuPlanPage.txtEnglishName().isDisplayed()) {
					logger.pass("Category create page was displayed");
				} else {
					logger.fail("New Button was not clicked.");
				}	
				
				// Input Category name
				 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
				CMWeb_MenuPlanPage.txtEnglishName().sendKeys(sName);
				logger.info("Category name: " + sName + " was entered");

			}
			
		    // Save Configuration
			public static void SaveConfiguration(int iTestCaseRow) throws Exception{
				String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
				// Click Save
				CMWeb_MenuPlanPage.btnSaveMPConfig().click();
				Thread.sleep(5000);
				CMWeb_ConfigurationPage.alertOkay().accept(); 
				logger.info(sName + " was successfully saved");		
			}
			
		    // Search Config
			public static void SearchConfigCategory(int iTestCaseRow) throws Exception{

				// search config
				String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
				CMWeb_MenuPlanPage.txtSearchMPConfig().sendKeys(sName);
				logger.info(sName + " was entered");
				CMWeb_MenuPlanPage.btnSearchMPConfig().click();
				Thread.sleep(5000);
					if (CMWeb_MenuPlanPage.chckboxMPCategory().isDisplayed()) {
						logger.pass(sName + " category was successfully searched");
					} else {
						logger.fail("No records existing");
					}
			}
			
			// delete config category
			public static void DeleteConfigCategory(int iTestCaseRow) throws Exception{
				String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
				// tick item to delete
				CMWeb_MenuPlanPage.chckboxMPCategory().click();
				logger.info("Item to delete was selected");
					
				//click delete button
				CMWeb_MenuPlanPage.btnDeleteMPConfig().click();
				Thread.sleep(5000);
				CMWeb_ConfigurationPage.alertOkay().accept();
				Thread.sleep(5000);
				CMWeb_ConfigurationPage.alertOkay().accept();
				logger.info(sName + " was successfully deleted");
				
			}
			
			// Edit Category
			public static void EditCategory(int iTestCaseRow) throws Exception {

				// tick category to edit
				CMWeb_MenuPlanPage.chckboxMPCategory().click();
				if (CMWeb_MenuPlanPage.txtFrenchName().isDisplayed()) {
					logger.pass("Category was able to edit.");
				} else {
					logger.fail("Edit button was not clicked.");
				}

				// add french Translation
				 String sFrench = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_French);
				CMWeb_MenuPlanPage.txtFrenchName().sendKeys(sFrench);
				logger.info("Category french translation " + sFrench + " was added");

			}
			
		    //Go to Season
			public static void GoToMenuPlanSeasonTab(int iTestCaseRow) throws Exception{
				
				// Click Category
				CMWeb_MenuPlanPage.btnMPSeason().click();
				if (CMWeb_MenuPlanPage.btnNewMPConfig().isDisplayed()) {
					logger.pass("Menu Plan Season tab is displayed");
				} else {
					logger.fail("Menu Plan Season button was not click");
				}				
			}
			
			//Create new season
			public static void CreateNewSeason(int iTestCaseRow) throws Exception{
				 
				// Click add season
				CMWeb_MenuPlanPage.btnNewMPConfig().click();
				if (CMWeb_MenuPlanPage.txtEnglishName().isDisplayed()) {
					logger.pass("Season create page was displayed");
				} else {
					logger.fail("New Button was not clicked.");
				}	
				
				// Input Category name
				 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
				CMWeb_MenuPlanPage.txtEnglishName().sendKeys(sName);
				logger.info("Season name: " + sName + " was entered");

			}
			
			// Edit Season
			public static void EditSeason(int iTestCaseRow) throws Exception {

				// tick category to edit
				CMWeb_MenuPlanPage.chckboxMPSeason().click();
				if (CMWeb_MenuPlanPage.txtFrenchSeasonName().isDisplayed()) {
					logger.pass("Season was able to edit.");
				} else {
					logger.fail("Edit button was not clicked.");
				}

				// add french Translation
				 String sFrench = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_French);
				CMWeb_MenuPlanPage.txtFrenchSeasonName().sendKeys(sFrench);
				logger.info("Season french translation: " + sFrench + " was added");
			}
			
		    // Search Config season
			public static void SearchConfigSeason(int iTestCaseRow) throws Exception{

				// search config
				String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
				CMWeb_MenuPlanPage.txtSearchMPConfig().sendKeys(sName);
				logger.info(sName + " was entered");
				CMWeb_MenuPlanPage.btnSearchMPConfig().click();
				Thread.sleep(5000);
					if (CMWeb_MenuPlanPage.chckboxMPSeason().isDisplayed()) {
						logger.pass(sName + " season was successfully searched");
					} else {
						logger.fail("No records existing");
					}
			}
			
			// delete config Season
			public static void DeleteConfigSeason(int iTestCaseRow) throws Exception{
				String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
				// tick item to delete
				CMWeb_MenuPlanPage.chckboxMPSeason().click();
				logger.info("Item to delete was selected");

					
				//click delete button
				CMWeb_MenuPlanPage.btnDeleteMPConfig().click();
				Thread.sleep(5000);
				CMWeb_ConfigurationPage.alertOkay().accept();
				Thread.sleep(5000);
				CMWeb_ConfigurationPage.alertOkay().accept();
				logger.info(sName + " was successfully deleted");
				
			}
			
			//Go to type of service
			public static void GoToMenuPlanServiceTab(int iTestCaseRow) throws Exception{
				
				// Click Category
				CMWeb_MenuPlanPage.btnMPService().click();
				if (CMWeb_MenuPlanPage.btnNewMPConfig().isDisplayed()) {
					logger.pass("Menu Plan Type of Service tab is displayed");
				} else {
					logger.fail("Menu Plan Type of Service button was not click");
				}				
			}
			
			//Create new service
			public static void CreateNewService(int iTestCaseRow) throws Exception{
				 
				// Click add type of service
				CMWeb_MenuPlanPage.btnNewMPConfig().click();
				if (CMWeb_MenuPlanPage.txtEnglishName().isDisplayed()) {
					logger.pass("Type of service create page was displayed");
				} else {
					logger.fail("New Button was not clicked.");
				}	
				
				// Input Type of service name
				 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
				CMWeb_MenuPlanPage.txtEnglishName().sendKeys(sName);
				logger.info("Type of service name: " + sName + " was entered");

			}
			
		    // Search Config Type of service
			public static void SearchConfigService(int iTestCaseRow) throws Exception{

				// search config
				String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
				CMWeb_MenuPlanPage.txtSearchMPConfig().sendKeys(sName);
				logger.info(sName + " was entered");
				CMWeb_MenuPlanPage.btnSearchMPConfig().click();
				Thread.sleep(5000);
					if (CMWeb_MenuPlanPage.chckboxMPService().isDisplayed()) {
						logger.pass(sName + " type of service was successfully searched");
					} else {
						logger.fail("No records existing");
					}
			}
			
			// Edit type of service
			public static void EditService(int iTestCaseRow) throws Exception {

				// tick type of service to edit
				CMWeb_MenuPlanPage.chckboxMPService().click();
				if (CMWeb_MenuPlanPage.txtFrenchSeasonName().isDisplayed()) {
					logger.pass("Type of service was able to edit.");
				} else {
					logger.fail("Edit button was not clicked.");
				}

				// add french Translation
				 String sFrench = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_French);
				CMWeb_MenuPlanPage.txtFrenchSeasonName().sendKeys(sFrench);
				logger.info("Type of service french translation: " + sFrench + " was added");
			}
			
			// delete config type of service
			public static void DeleteConfigService(int iTestCaseRow) throws Exception{
				String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
				// tick item to delete
				CMWeb_MenuPlanPage.chckboxMPService().click();
				logger.info("Item to delete was selected");

					
				//click delete button
				CMWeb_MenuPlanPage.btnDeleteMPConfig().click();
				Thread.sleep(5000);
				CMWeb_ConfigurationPage.alertOkay().accept();
				Thread.sleep(5000);
				CMWeb_ConfigurationPage.alertOkay().accept();
				logger.info(sName + " was successfully deleted");
				
			}
						
			
}
