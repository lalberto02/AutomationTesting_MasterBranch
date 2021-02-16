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

	public static void AddNewCategory(int iTestCaseRow) throws Exception {
		// Click New Button
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

/*	public static void AddNewCategoryMenu(int iTestCaseRow) throws Exception {
		// Click New Button
		CMWeb_ConfigurationPage.btnNewKeyword().click();
		if (CMWeb_ConfigurationPage.txtEnglishCategory().isDisplayed()) {
			logger.pass("Category create page was displayed");
		} else {
			logger.fail("New Button was not clicked.");
		}

		// input English Keyword
		 String sEnglish = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		CMWeb_ConfigurationPage.txtEnglishCategory().sendKeys(sEnglish);
		logger.info("English tab was populated " + sEnglish );

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
			CMWeb_ConfigurationPage.chckboxHQCategory().click();
			CMWeb_ConfigurationPage.chckboxHQCategory().click();
			logger.info("HQ sharing was ticked");
		}
	}*/

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

	// Edit Category
	public static void EditCategory(int iTestCaseRow) throws Exception {
		// tick category to edit
		CMWeb_ConfigurationPage.chckboxKeyword().click();
		if (CMWeb_ConfigurationPage.txtParent().isDisplayed()) {
			logger.pass("Category was able to edit.");
		} else {
			logger.fail("Edit button was not clicked.");
		}

		// change English Translation
		 String sEnglish = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		 String sNewEnglish = ExcelUtils.getCellData(iTestCaseRow,
		 Constant.Col_NewEnglish);
		CMWeb_ConfigurationPage.txtEnglish().clear();
		CMWeb_ConfigurationPage.txtEnglish().sendKeys(sNewEnglish);
		logger.info(sEnglish + " was changed to " + sNewEnglish);

		// Change German Translation
		 String sGerman = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_German);
		CMWeb_ConfigurationPage.txtGerman().clear();
		CMWeb_ConfigurationPage.txtGerman().sendKeys(sGerman);
		logger.info("German translation was changed to " + sGerman);

	}

	// Edit Menu Category
	public static void EditMenuCategory(int iTestCaseRow) throws Exception {
		// tick category to edit
		CMWeb_ConfigurationPage.chckboxCategory().click();
		if (CMWeb_ConfigurationPage.txtEnglishCategory().isDisplayed()) {
			logger.pass("Category was able to edit.");
		} else {
			logger.fail("Edit button was not clicked.");
		}

		// change English Translation
		 String sEnglish = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		 String sNewEnglish = ExcelUtils.getCellData(iTestCaseRow,
		 Constant.Col_NewEnglish);
		CMWeb_ConfigurationPage.txtEnglishCategory().clear();
		CMWeb_ConfigurationPage.txtEnglishCategory().sendKeys(sNewEnglish);
		logger.info(sEnglish + " was changed to " + sNewEnglish);

	}

	// Search category
	public static void SearchCategory(int iTestCaseRow) throws Exception {

		// search role
		 String sEnglish = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		CMWeb_ConfigurationPage.txtSearchKeyword().sendKeys(sEnglish);
		CMWeb_ConfigurationPage.btnSearchKeyword().click();
		if (CMWeb_ConfigurationPage.chckboxKeyword().isDisplayed()) {
			logger.pass("Category: " + sEnglish + " was successfully searched");
		} else {
			logger.fail("No records existing");
		}

	}

	// Search Menu category
	public static void SearchMenuCategory(int iTestCaseRow) throws Exception {

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

	// Delete category
	public static void DeleteCategory(int iTestCaseRow) throws Exception {
		 String sEnglish = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);

		// tick category to delete
		CMWeb_ConfigurationPage.chckboxKeyword().click();
		logger.pass("Category to delete was ticked");

		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass(sEnglish + " was successfully deleted.");

	}

	// Delete Menu category
	public static void DeleteMenuCategory(int iTestCaseRow) throws Exception {
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
