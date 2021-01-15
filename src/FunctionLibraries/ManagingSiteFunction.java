package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class ManagingSiteFunction extends Report {
	
	public static void GoToAccount(int iTestCaseRow) throws Exception{
		// click configuration tab
		CMWeb_ConfigurationPage.btnAccount().click();
		
	}
	
	public static void GoToSiteTab(int iTestCaseRow) throws Exception{
		// Click Roles Button
		CMWeb_ConfigurationPage.btnSite().click();
		if (CMWeb_ConfigurationPage.txtSearch().isDisplayed()) {
			logger.pass("Site tab was displayed");			
		} else {
			logger.fail("Site button was not clicked.");
		}
	}
	
	// Edit Site
	public static void EditSite(int iTestCaseRow) throws Exception{
			
			//search role
		    String sSiteName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			CMWeb_ConfigurationPage.txtSearch().sendKeys(sSiteName);
			CMWeb_ConfigurationPage.btnSearch().click();
			logger.info(sSiteName + " was entered");
		
			// Click Edit button
			CMWeb_ConfigurationPage.btnEdit().click();
			if (CMWeb_ConfigurationPage.txtSiteName().isDisplayed()) {
				// change role name
				String sNewSiteName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NewName);
				CMWeb_ConfigurationPage.txtSiteName().clear();
				CMWeb_ConfigurationPage.txtSiteName().sendKeys(sNewSiteName);
				logger.pass(sNewSiteName + " was able to edit.");				
			} else {
				logger.fail("Edit button was not clicked.");
			}			
		}
	
	// save Site
	public static void SaveSite(int iTestCaseRow) throws Exception{
		String sNewSiteName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NewName);
		// Click save button
		CMWeb_ConfigurationPage.btnSaveSite().click();	
		//validation reporting screenshot
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass(sNewSiteName + " site was edited.");
		
	}
	
	// Delete Site
	public static void DeleteSite(int iTestCaseRow) throws Exception{
					
		//search role
		String sSiteName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtSearch().sendKeys(sSiteName);
		CMWeb_ConfigurationPage.btnSearch().click();
		logger.info(sSiteName + " was entered");
				
		// Click Role Checkbox to delete
		CMWeb_ConfigurationPage.chckboxSite().click();
		logger.info(sSiteName + " was clicked.");
					
		// click delete button
		CMWeb_ConfigurationPage.btnDelete().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass(sSiteName + " was successfully deleted.");
	}
					

}
