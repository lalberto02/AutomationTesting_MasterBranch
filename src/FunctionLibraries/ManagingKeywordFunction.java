package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class ManagingKeywordFunction extends Report {

	public static void GoToMerchandiseTab(int iTestCaseRow) throws Exception {
		// Click Merchandise Button
		CMWeb_ConfigurationPage.btnMerchandise().click();
		if (CMWeb_ConfigurationPage.btnKeyword().isDisplayed()) {
			logger.pass("Merchandise tab was displayed.");
		} else {
			logger.fail("Merchandise button was not clicked.");
		}
	}

	public static void GoToRecipeTab(int iTestCaseRow) throws Exception {
		// Click Recipe Button
		CMWeb_ConfigurationPage.btnRecipe().click();
		if (CMWeb_ConfigurationPage.btnKeyword().isDisplayed()) {
			logger.pass("Recipe tab was displayed.");
		} else {
			logger.fail("Recipe button was not clicked.");
		}
	}

	public static void GoToMenuTab(int iTestCaseRow) throws Exception {
		// Click Menu Button
		CMWeb_ConfigurationPage.btnMenu().click();
		if (CMWeb_ConfigurationPage.btnKeywordMenu().isDisplayed()) {
			logger.pass("Menu tab was displayed.");
		} else {
			logger.fail("Menu button was not clicked.");
		}
	}

	public static void GoToKeyword(int iTestCaseRow) throws Exception {
		// Click Keyword Button
		CMWeb_ConfigurationPage.btnKeyword().click();
		if (CMWeb_ConfigurationPage.btnNewKeyword().isDisplayed()) {
			logger.pass("Keyword tab was displayed.");
		} else {
			logger.fail("Keyword button was not clicked.");
		}
	}

	public static void GoToKeywordMenu(int iTestCaseRow) throws Exception {
		// Click Keyword Button
		CMWeb_ConfigurationPage.btnKeywordMenu().click();
		if (CMWeb_ConfigurationPage.btnNewKeyword().isDisplayed()) {
			logger.pass("Keyword tab was displayed.");
		} else {
			logger.fail("Keyword button was not clicked.");
		}
	}

	public static void AddNewKeywordMenu(int iTestCaseRow) throws Exception {
		// Click New Button
		CMWeb_ConfigurationPage.btnNewKeyword().click();
		if (CMWeb_ConfigurationPage.txtParent().isDisplayed()) {
			logger.pass("Keyword create page was displayed");
		} else {
			logger.fail("New Button was not clicked.");
		}

		// input parent name
		String sParent = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Parent);
		CMWeb_ConfigurationPage.txtParent().sendKeys(sParent);
		logger.info(sParent + " parent keyword was entered");

		// input English Keyword
		String sEnglish = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		CMWeb_ConfigurationPage.txtEnglish().sendKeys(sEnglish);
		logger.info("English tab was populated");

		// input French Keyword
		String sFrench = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_French);
		CMWeb_ConfigurationPage.txtFrench().sendKeys(sFrench);
		logger.info("French tab was populated");

		// input German Keyword
		String sGerman = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_German);
		CMWeb_ConfigurationPage.txtGerman().sendKeys(sGerman);
		logger.info("German tab was populated");

		// input Italian Keyword
		String sItalian = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Italian);
		CMWeb_ConfigurationPage.txtItalian().sendKeys(sItalian);
		logger.info("Italian tab was populated");

		// tick sharing
		// sSharing = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Sharing);
		String sSharing = "Global";
		if (sSharing.equals("Global")) {
			CMWeb_ConfigurationPage.chckboxGlobal().click();
			logger.info("Global sharing was ticked");
		} else if (sSharing.equals("HQ")) {
			CMWeb_ConfigurationPage.chckboxHQ().click();
			logger.info("HQ sharing was ticked");
		}
	}

	public static void AddNewKeyword(int iTestCaseRow) throws Exception {
		// Click New Button
		CMWeb_ConfigurationPage.btnNewKeyword().click();
		if (CMWeb_ConfigurationPage.txtParent().isDisplayed()) {
			logger.pass("Keyword create page was displayed");
		} else {
			logger.fail("New Button was not clicked.");
		}

		// input parent name
		String sParent = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Parent);
		CMWeb_ConfigurationPage.txtParent().sendKeys(sParent);
		logger.info(sParent + " parent keyword was entered");

		// input English Keyword
		String sEnglish = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		CMWeb_ConfigurationPage.txtEnglish().sendKeys(sEnglish);
		logger.info("English tab was populated");

		// input French Keyword
		String sFrench = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_French);
		CMWeb_ConfigurationPage.txtFrench().sendKeys(sFrench);
		logger.info("French tab was populated");

		// input German Keyword
		String sGerman = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_German);
		CMWeb_ConfigurationPage.txtGerman().sendKeys(sGerman);
		logger.info("German tab was populated");

		// input Italian Keyword
		String sItalian = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Italian);
		CMWeb_ConfigurationPage.txtItalian().sendKeys(sItalian);
		logger.info("Italian tab was populated");

		// tick inheritable
		CMWeb_ConfigurationPage.chckboxInheritable().click();
		logger.info("Inheritable was ticked");

		// tick sharing
		String sSharing = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Sharing);
		if (sSharing.equals("Global")) {
			CMWeb_ConfigurationPage.chckboxGlobal().click();
			logger.info("Global sharing was ticked");
		} else if (sSharing.equals("HQ")) {
			CMWeb_ConfigurationPage.chckboxHQ().click();
			logger.info("HQ sharing was ticked");
		}
	}

	// save keyword
	public static void SaveKeyword(int iTestCaseRow) throws Exception {

		// Click save button
		CMWeb_ConfigurationPage.btnSaveKeyword().click();
		// validation reporting screenshot
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass("Keyword was successfully saved");
	}

	// Edit Keyword
	public static void EditKeyword(int iTestCaseRow) throws Exception {

		// change English Translation
		String sEnglish = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		String sNewEnglish = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NewEnglish);
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.txtEnglish().clear();
		CMWeb_ConfigurationPage.txtEnglish().sendKeys(sNewEnglish);
		logger.info(sEnglish + " was changed to " + sNewEnglish);

		// Change German Translation
		String sGerman = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_German);
		CMWeb_ConfigurationPage.txtGerman().clear();
		CMWeb_ConfigurationPage.txtGerman().sendKeys(sGerman);
		logger.info("German translation was changed to " + sGerman);

	}

	// Search Keyword
	public static void SearchKeyword(int iTestCaseRow) throws Exception {

		// search role
		String sEnglish = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		CMWeb_ConfigurationPage.txtSearchKeyword().sendKeys(sEnglish);
		CMWeb_ConfigurationPage.btnSearchKeyword().click();
		logger.info(sEnglish + " was entered");

		// tick keyword to edit
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.chckboxKeyword().click();
		if (CMWeb_ConfigurationPage.txtParent().isDisplayed()) {
			logger.pass("Keyword was able to edit.");
		} else {
			logger.fail("Edit button was not clicked.");
		}

	}

	// Delete keyword
	public static void DeleteKeyword(int iTestCaseRow) throws Exception {
		String sEnglish = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		// click delete button
		CMWeb_ConfigurationPage.btnDeleteKeyword().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass(sEnglish + " was successfully deleted.");

	}

}
