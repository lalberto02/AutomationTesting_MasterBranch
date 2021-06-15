package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class ManagingCategoryFunction extends Report {

	public static void GoToCategory(int iTestCaseRow) throws Exception {
		// Click Keyword Button
		CMWeb_ConfigurationPage.btnCategory().click();
		if (CMWeb_ConfigurationPage.btnNewKeyword().isDisplayed()) {
			logger.pass("Category tab was displayed.");
		} else {
			logger.fail("Category button was not clicked.");
		}
	}
	
	public static void GoToMenuCategory(int iTestCaseRow) throws Exception {
		// Click Keyword Button
		CMWeb_ConfigurationPage.btnMenuCategory().click();
		if (CMWeb_ConfigurationPage.btnNewKeyword().isDisplayed()) {
			logger.pass("Category tab was displayed.");
		} else {
			logger.fail("Category button was not clicked.");
		}
	}

	public static void AddNewCategory(int iTestCaseRow) throws Exception {
		// Click New Button0
		CMWeb_ConfigurationPage.btnNewKeyword().click();
		if (CMWeb_ConfigurationPage.txtEnglishCategory().isDisplayed()) {
			logger.pass("Category create page was displayed");
		} else {
			logger.fail("New Button was not clicked.");
		}

		// input English Keyword
		String sEnglish = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		CMWeb_ConfigurationPage.txtEnglishCategory().sendKeys(sEnglish);
		logger.info("English tab was populated " + sEnglish);

		// input French Keyword
		String sFrench = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_French);
		CMWeb_ConfigurationPage.txtFrenchCategory().sendKeys(sFrench);
		logger.info("French tab was populated " + sFrench);


		// tick sharing
		String sSharing = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Sharing);
		if (sSharing.equals("Global")) {
			CMWeb_ConfigurationPage.chckboxGlobalTax().click();
			logger.info("Global sharing was ticked");
		} else if (sSharing.equals("HQ")) {
			CMWeb_ConfigurationPage.chckboxHQTax().click();
			CMWeb_ConfigurationPage.chckboxHQTax().click();
			logger.info("HQ sharing was ticked");
		}
	}

	// save Category
	public static void SaveCategory(int iTestCaseRow) throws Exception {
		 String sEnglish = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		// Click save button
		CMWeb_ConfigurationPage.btnSaveKeyword().click();
		// validation reporting screenshot
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass(sEnglish + " Category was successfully saved");
	}



	// Edit  Category
	public static void EditCategory(int iTestCaseRow) throws Exception {
		// tick category to edit
		CMWeb_ConfigurationPage.chckboxCategory().click();
		if (CMWeb_ConfigurationPage.txtEnglishCategory().isDisplayed()) {
			logger.pass("Category was able to edit.");
		} else {
			logger.fail("Edit button was not clicked.");
		}

		// change English Translation
		 String sFrench = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_French);
		 String sNewFrench = ExcelUtils.getCellData(iTestCaseRow,
		 Constant.Col_NewEnglish);
		CMWeb_ConfigurationPage.txtFrenchCategory().clear();
		CMWeb_ConfigurationPage.txtFrenchCategory().sendKeys(sNewFrench);
		logger.info(sFrench + " was changed to " + sNewFrench);

	}


	// Search category
	public static void SearchCategory(int iTestCaseRow) throws Exception {

		// search role
		 String sEnglish = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		CMWeb_ConfigurationPage.txtSearchKeyword().sendKeys(sEnglish);
		CMWeb_ConfigurationPage.btnSearchKeyword().click();
		if (CMWeb_ConfigurationPage.chckboxCategory().isDisplayed()) {
			logger.pass("Category: " + sEnglish + " was successfully searched");
		} else {
			logger.fail("No records existing");
		}

	}


	// Delete Menu category
	public static void DeleteCategory(int iTestCaseRow) throws Exception {
		 String sEnglish = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);

		// tick category to delete
		CMWeb_ConfigurationPage.chckboxCategory().click();
		logger.pass("Category to delete was ticked");

		// click delete button
		CMWeb_ConfigurationPage.btnDeleteKeyword().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass(sEnglish + " was successfully deleted.");

	}

}
