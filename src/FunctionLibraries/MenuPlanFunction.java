package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import ObjectRepository.CMWeb_MenuPlanPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class MenuPlanFunction extends Report {
	
    //Go to Menu Plan tab
	public static void GoToMenuPlan(int iTestCaseRow) throws Exception{
		
		// Click Merchandise
		CMWeb_MenuPlanPage.btnMenuPlan().click();
		if (CMWeb_MenuPlanPage.lblMenuPlan().isDisplayed()) {
			logger.pass("Menu Plan tab is displayed");
		} else {
			logger.fail("Menu Plan tab is not displayed");
		}
			// screenshot			
	}
	
    //Go to Configuration tab
	public static void GoToConfiguration(int iTestCaseRow) throws Exception{
		
		// Click Merchandise
		CMWeb_MenuPlanPage.btnConfiguration().click();
		if (CMWeb_MenuPlanPage.btnRestauTab().isDisplayed()) {
			logger.pass("Menu Plan Configuration Page is displayed");
		} else {
			logger.fail("Configuration button was not click");
		}
	}
	
    //Go to Restaurant / Master Plan tab
	public static void GoToRestaurant(int iTestCaseRow) throws Exception{
		
		// Click Merchandise
		CMWeb_MenuPlanPage.btnRestauTab().click();
		if (CMWeb_MenuPlanPage.txtSearchRestau().isDisplayed()) {
			logger.pass("Restaurant / Master Plan tab is displayed");
		} else {
			logger.fail("Restaurant / Master Plan button was not click");
		}				
	}
	
	//Create new master plan
	public static void CreateMasterplan(int iTestCaseRow) throws Exception{
		
		// Click add master plan
		CMWeb_MenuPlanPage.btnAddMenuPlan().click();
		if (CMWeb_MenuPlanPage.txtMasterPlanGroup().isDisplayed()) {
			logger.pass("Master Plan create page was displayed");
		} else {
			logger.fail("New Button was not clicked.");
		}
		
		//select master plan group
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
	
	//Create new restaurant
	public static void CreateRestaurant(int iTestCaseRow) throws Exception{
		 
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
	public static void SaveRestaurant(int iTestCaseRow) throws Exception{
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		// Click Save
		CMWeb_MenuPlanPage.btnSaveRestau().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.info(sName + " Restaurant was successfully saved");		
	}
	
    // Save Master Plan
	public static void SaveMasterPlan(int iTestCaseRow) throws Exception{
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		// Click Save
		CMWeb_MenuPlanPage.btnSaveMasterPlan().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.info(sName + " Master Plan was successfully saved");		
	}
	
    // Search Restaurant
	public static void SearchRestaurant(int iTestCaseRow) throws Exception{
		
		// Input search
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_MenuPlanPage.txtSearchRestau().sendKeys(sName);
		logger.info(sName + " restaurant name was entered");
		
		// click search 
		CMWeb_MenuPlanPage.btnSearch().click();
		logger.info(sName + " Restaraunt was selected");
	}
	
	// delete restaurant
	public static void DeleteRestaurant(int iTestCaseRow) throws Exception{
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		//click remove button
		CMWeb_MenuPlanPage.btnRemoveRestau().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.info(sName + " Restaurant was successfully deleted");
		
	}
	
	// delete masterplan
	public static void DeleteMasterplan(int iTestCaseRow) throws Exception{
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
}
