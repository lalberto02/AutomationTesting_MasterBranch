package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import Utility.Report;

public class ManagingBreadcrumbsFunction extends Report {
	
	// Go to Breadcrumbs Tab
		public static void GoToBreadcrumbsTab(int iTestCaseRow) throws Exception {

			// Click breadcrumbs
			CMWeb_ConfigurationPage.btnBreadcrumbs().click();
			if (CMWeb_ConfigurationPage.drpdwnUser().isDisplayed()) {
				logger.pass("Breadcrumbs tab is displayed");
			} else {
				logger.fail("Breadcrumbs tab is not displayed");
			}
		}
		
	// Search breadcrumbs
		public static void SearchBreadcrumbs(int iTestCaseRow) throws Exception {
				
			//select user
			// String sUser = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_BreadcrumbsUser);
			CMWeb_ConfigurationPage.drpdwnUser().click();
			CMWeb_ConfigurationPage.drpdwnUser().sendKeys("Admin");
			
			// tick date
			// String sCheckDate = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_DateCheckbox);
			String sCheckDate = "Yes";
			if (sCheckDate.equals("Yes")) {
				CMWeb_ConfigurationPage.chckboxDate().click();
				logger.info("Date checkbox was ticked.");
				// String sDate = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Date);
				//CMWeb_ConfigurationPage.txtDate().click();
				//CMWeb_ConfigurationPage.txtDate().sendKeys("04/04/2021");
			} else {
				logger.info("Date checkbox was ticked.");
			}
		
			//select user
			// String sItemtype = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ItemType);
			CMWeb_ConfigurationPage.drpdwnItemType().click();
			CMWeb_ConfigurationPage.drpdwnItemType().sendKeys("Configuration");
			
			// search breadcrumbs
			CMWeb_ConfigurationPage.btnSearchBreadcrumbs().click();
			Thread.sleep(5000);
			if (CMWeb_ConfigurationPage.chckboxBreadcrumbs().isDisplayed()) {
				logger.pass("Breadcrumbs was successfully searched");
			} else {
				logger.fail("No records existing");
			}
			
		}
		
		// Delete breadcrumbs
		public static void DeleteBreadcrumbs(int iTestCaseRow) throws Exception {
			// select breadcrumbs
			CMWeb_ConfigurationPage.chckboxBreadcrumbs().click();
			logger.info(" Breadcrumbs to delete was selected");

			// click delete button
			CMWeb_ConfigurationPage.btnDeleteBreadcrumbs().click();
			Thread.sleep(5000);
			logger.pass("Breadcrumbs was successfully deleted");
		}
				
}
