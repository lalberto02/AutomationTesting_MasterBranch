package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class ManagingRolesFunction extends Report {
	
	public static void GoToConfiguration(int iTestCaseRow) throws Exception{
		// click configuration tab
		CMWeb_ConfigurationPage.btnConfig().click();
		if (CMWeb_ConfigurationPage.lblConfig().isDisplayed()) {
			logger.pass("Configuration tab was displayed.");
		} else {
			logger.fail("Configuration Button was not clicked.");
		}
		
	}
	
	public static void GoToRolesTab(int iTestCaseRow) throws Exception{
		// Click Roles Button
		CMWeb_ConfigurationPage.btnRoles().click();
		if (CMWeb_ConfigurationPage.txtRoleName().isDisplayed()) {
			logger.pass("Role tab was displayed.");		
		} else {
			logger.fail("Role button was not clicked.");
		}
	}
	
	public static void AddNewRole(int iTestCaseRow) throws Exception{
		// Click New Button
		CMWeb_ConfigurationPage.btnNew().click();
		
		if (CMWeb_ConfigurationPage.txtRoleName().isDisplayed()) {
			logger.pass("Role create page was displayed");
		} else {
			logger.fail("New Button was not clicked.");
		}
		
		// Input Role Name
		String sRoleName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtRoleName().sendKeys(sRoleName);
		logger.info(sRoleName  + " was entered.");
		
		// Select Role Type
		String sRoleType = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_RoleType);
		CMWeb_ConfigurationPage.drpdwnRoleType().click();
		CMWeb_ConfigurationPage.drpdwnRoleType().sendKeys(sRoleType);
		logger.info(sRoleType + " was selected.");
		
		// Select Role Level
		String sRoleLevel = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_RoleLevel);
		if (sRoleLevel.equals("Property")) {
			CMWeb_ConfigurationPage.chckboxPropertyLevel().click();	
			logger.info(sRoleLevel + " was checked.");
		} else if
			(sRoleLevel.equals("Site")) {
			CMWeb_ConfigurationPage.chckboxSiteLevel().click();
			logger.info(sRoleLevel + " was checked.");
		} else if
			(sRoleLevel.equals("Basic")) {
			CMWeb_ConfigurationPage.chckboxBasicLevel().click();
			logger.info(sRoleLevel + " was checked.");
		} 
		
		// click check all for all tabs
		CMWeb_ConfigurationPage.btnCheckAll().click();
		logger.info(" Check all was checked.");
		
	}
	
	// save role
	public static void SaveRole(int iTestCaseRow) throws Exception{
		String sRoleName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		// Click save button
		CMWeb_ConfigurationPage.btnSaveRole().click();	
		//validation reporting screenshot
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass(sRoleName + " was successfully saved");
	}
	
	// Edit role
	public static void EditRole(int iTestCaseRow) throws Exception{
			
			//search role
		    String sRoleName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			CMWeb_ConfigurationPage.txtSearch().sendKeys(sRoleName);
			CMWeb_ConfigurationPage.btnSearch().click();
			logger.info(sRoleName + " was entered");
		
			// Click Edit button
			CMWeb_ConfigurationPage.btnEdit().click();
			if (CMWeb_ConfigurationPage.txtRoleName().isDisplayed()) {
				// change role name
				String sNewRoleName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NewName);
				CMWeb_ConfigurationPage.txtRoleName().clear();
				CMWeb_ConfigurationPage.txtRoleName().sendKeys(sNewRoleName);
				logger.pass(sNewRoleName + " was able to edit.");				
			} else {
				logger.fail("Edit button was not clicked.");
			}
			
			
			
			// Select Role Level
			String sRoleLevel = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_RoleLevel);
			if (sRoleLevel.equals("Property")) {
				CMWeb_ConfigurationPage.chckboxPropertyLevel().click();	
				logger.info(sRoleLevel + " was checked.");
			} else if
				(sRoleLevel.equals("Site")) {
				CMWeb_ConfigurationPage.chckboxSiteLevel().click();
				logger.info(sRoleLevel + " was checked.");
			} else if
				(sRoleLevel.equals("Basic")) {
				CMWeb_ConfigurationPage.chckboxBasicLevel().click();
				logger.info(sRoleLevel + " was checked.");
			} 
			
		}
	
	// Clear Search
	public static void ClearSearch(int iTestCaseRow) throws Exception{
			//Click clear
			CMWeb_ConfigurationPage.btnClear().click();
			logger.info("Search textbox was cleared.");
			
		}
		
	// Delete role
	public static void DeleteRole(int iTestCaseRow) throws Exception{
				
			//search role
			String sRoleName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			CMWeb_ConfigurationPage.txtSearch().sendKeys(sRoleName);
			CMWeb_ConfigurationPage.btnSearch().click();
			logger.info(sRoleName + " was entered");
			
			// Click Role Checkbox to delete
			CMWeb_ConfigurationPage.chckboxRole().click();
			logger.info(sRoleName + " was clicked.");
				
			// click delete button
			CMWeb_ConfigurationPage.btnDelete().click();
			Thread.sleep(5000);
			CMWeb_ConfigurationPage.alertOkay().accept();
			Thread.sleep(5000);
			CMWeb_ConfigurationPage.alertOkay().accept();
			logger.pass(sRoleName + " was successfully deleted.");
				
			}	

}
