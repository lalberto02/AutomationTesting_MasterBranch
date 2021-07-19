package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class ManagingTranslationFunction extends Report {

	// Go to Translation tab
	public static void GoToTranslationTab(int iTestCaseRow) throws Exception {

		// Click Merchandise
		CMWeb_ConfigurationPage.btnTranslation().click();
		if (CMWeb_ConfigurationPage.btnNew().isDisplayed()) {
			logger.pass("Translation tab is displayed");
		} else {
			logger.fail("Translation tab is not displayed");
		}
	}

	// Create Translation
	public static void CreateTranslation(int iTestCaseRow) throws Exception {

		// Click new button
		CMWeb_ConfigurationPage.btnNew().click();
		if (CMWeb_ConfigurationPage.drpdwnDictionary().isDisplayed()) {
			logger.pass("Translation create page was displayed");
		} else {
			logger.fail("New Button was not clicked.");
		}

		// select translation
		String sDictionary = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Dictionary);
		CMWeb_ConfigurationPage.drpdwnDictionary().click();
		CMWeb_ConfigurationPage.drpdwnDictionary().sendKeys(sDictionary);
		logger.info("Language: " + sDictionary + " was selected.");

		// input translation
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtTranslationName().sendKeys(sName);
		logger.info(sName + " Translation was entered.");
	}

	// Save Translation
	public static void SaveTranslation(int iTestCaseRow) throws Exception {
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		// Click Save
		CMWeb_ConfigurationPage.btnSave().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass(sName + " Translation was successfully saved");
	}

	// Search Translation
	public static void SearchTranslation(int iTestCaseRow) throws Exception {

		// search print profile
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtSearch().sendKeys(sName);
		logger.info("Translation name: " + sName + " was entered");
		CMWeb_ConfigurationPage.btnSearch().click();
		if (CMWeb_ConfigurationPage.chckboxTranslation().isDisplayed()) {
			logger.pass("Translation was successfully searched");
		} else {
			logger.fail("No records existing");
		}
	}

	// Delete Translation
	public static void DeleteTranslation(int iTestCaseRow) throws Exception {
		// select print profile
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.chckboxTranslation().click();
		logger.info(sName + " Translation to delete was selected");

		// click delete button
		CMWeb_ConfigurationPage.btnDelete().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass(sName + " Translation was successfully deleted.");
	}

	// Edit translation
	public static void EditTranslation(int iTestCaseRow) throws Exception {

		// Click Edit button
		CMWeb_ConfigurationPage.btnEdit().click();
		if (CMWeb_ConfigurationPage.drpdwnDictionary().isDisplayed()) {
			logger.pass("Translation was able to edit.");
		} else {
			logger.fail("Edit Button was not clicked.");
		}

		// change role name
		String sNewTranslationName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NewName);
		CMWeb_ConfigurationPage.txtTranslationName().clear();
		CMWeb_ConfigurationPage.txtTranslationName().sendKeys(sNewTranslationName);
		logger.info("Translation name was changed to " + sNewTranslationName);

	}

}
