package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class ManagingAutoNumberingFunction extends Report {

	// Go to Tools Tab
	public static void GoToToolsTab(int iTestCaseRow) throws Exception {

		// Click tax rate
		CMWeb_ConfigurationPage.btnTools().click();
		if (CMWeb_ConfigurationPage.btnAutoNum().isDisplayed()) {
			logger.pass("Tools tab is displayed");
		} else {
			logger.fail("Tools tab is not displayed");
		}
	}

	// Go to Auto Numbering Tab
	public static void GoToAutoNumTab(int iTestCaseRow) throws Exception {

		// Click tax rate
		CMWeb_ConfigurationPage.btnAutoNum().click();
		if (CMWeb_ConfigurationPage.btnSaveAutoNumbering().isDisplayed()) {
			logger.pass("Auto Numbering tab is displayed");
		} else {
			logger.fail("Auto Numbering is not displayed");
		}
	}

	// Activate Merchandise Auto Number
	public static void ActivateMerchandise(int iTestCaseRow) throws Exception {

		// tick merchandise auto numbering
		CMWeb_ConfigurationPage.chckboxMerchandiseNumber().click();
		logger.pass("Merchandise Auto Number was ticked.");

		// input prefix
		String sPrefix = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Prefix);
		CMWeb_ConfigurationPage.txtMerchPrefix().clear();
		CMWeb_ConfigurationPage.txtMerchPrefix().sendKeys(sPrefix);
		logger.info("Prefix: " + sPrefix + " was entered.");
		
		// input Start with
		String sStartWith = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_StartsWith);
		CMWeb_ConfigurationPage.txtMerchStartWith().click();
		CMWeb_ConfigurationPage.txtMerchStartWith().clear();
		CMWeb_ConfigurationPage.txtMerchStartWith().sendKeys(sStartWith);
		logger.info("Starts with: " + sStartWith + " was entered.");
	}
	
	// Activate Recipe Auto Number
	public static void ActivateRecipe(int iTestCaseRow) throws Exception {

		// tick merchandise auto numbering
		CMWeb_ConfigurationPage.chckboxRecipeNumber().click();
		logger.pass("Recipe Auto Number was ticked.");

		// input prefix
		String sPrefix = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Prefix);
		CMWeb_ConfigurationPage.txtRecipePrefix().clear();
		CMWeb_ConfigurationPage.txtRecipePrefix().sendKeys(sPrefix);
		logger.info("Prefix: " + sPrefix + " was entered.");
		
		// input Start with
		String sStartWith = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_StartsWith);
		CMWeb_ConfigurationPage.txtRecipeStartWith().click();
		CMWeb_ConfigurationPage.txtRecipeStartWith().clear();
		CMWeb_ConfigurationPage.txtRecipeStartWith().sendKeys(sStartWith);
		logger.info("Starts with: " + sStartWith + " was entered.");
	}
	
	// Activate Menu Auto Number
	public static void ActivateMenu(int iTestCaseRow) throws Exception {

		// tick merchandise auto numbering
		CMWeb_ConfigurationPage.chckboxMenuNumber().click();
		logger.pass("Menu Auto Number was ticked.");

		// input prefix
		String sPrefix = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Prefix);
		CMWeb_ConfigurationPage.txtMenuPrefix().clear();
		CMWeb_ConfigurationPage.txtMenuPrefix().sendKeys(sPrefix);
		logger.info("Prefix: " + sPrefix + " was entered.");
		
		// input Start with
		String sStartWith = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_StartsWith);
		CMWeb_ConfigurationPage.txtMenuStartWith().click();
		CMWeb_ConfigurationPage.txtMenuStartWith().clear();
		CMWeb_ConfigurationPage.txtMenuStartWith().sendKeys(sStartWith);
		logger.info("Starts with: " + sStartWith + " was entered.");
	}
	
	// Activate Menu Plan Auto Number
	public static void ActivateMenuPlan(int iTestCaseRow) throws Exception {

		// tick merchandise auto numbering
		CMWeb_ConfigurationPage.chckboxMenuPlanNumber().click();
		logger.pass("Menu Plan Auto Number was ticked.");

		// input prefix
		String sPrefix = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Prefix);
		CMWeb_ConfigurationPage.txtMenuPlanPrefix().click();
		CMWeb_ConfigurationPage.txtMenuPlanPrefix().clear();
		CMWeb_ConfigurationPage.txtMenuPlanPrefix().sendKeys(sPrefix);
		logger.info("Prefix: " + sPrefix + " was entered.");
		
		// input Start with
		String sStartWith = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_StartsWith);
		CMWeb_ConfigurationPage.txtMenuPlanStartWith().click();
		CMWeb_ConfigurationPage.txtMenuPlanStartWith().clear();
		CMWeb_ConfigurationPage.txtMenuPlanStartWith().sendKeys(sStartWith);
		logger.info("Starts with: " + sStartWith + " was entered.");
	}

	// Save Auto numbering
	public static void SaveAutoNumbering(int iTestCaseRow) throws Exception {
		// Click Save
		CMWeb_ConfigurationPage.btnSaveAutoNumbering().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass(" Auto Numbering was successfully activated");
	}
}
