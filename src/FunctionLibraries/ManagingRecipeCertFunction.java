package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class ManagingRecipeCertFunction extends Report {

	// Go to Recipe Certification tab
	public static void GoToRecipeCertification(int iTestCaseRow) throws Exception {

		// Click tax rate
		CMWeb_ConfigurationPage.btnRecipeCertification().click();
		if (CMWeb_ConfigurationPage.btnNewKeyword().isDisplayed()) {
			logger.pass("Recipe Certification tab is displayed");
		} else {
			logger.fail("Recipe Certification tab is not displayed");
		}
	}

	// create Recipe Certification
	public static void AddNewRecipeCertification(int iTestCaseRow) throws Exception {
		// Click New Button
		CMWeb_ConfigurationPage.btnNewKeyword().click();
		if (CMWeb_ConfigurationPage.txtEnglishCategory().isDisplayed()) {
			logger.pass("Recipe Certification create page was displayed");
		} else {
			logger.fail("New Button was not clicked.");
		}

		// input Recipe Certification name
		 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtEnglishCategory().sendKeys(sName);
		logger.info("Recipe Certification name: " + sName + " was entered.");

		// input Recipe Certification french
		 String sFrench = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		CMWeb_ConfigurationPage.txtFrenchRecipeCert().sendKeys(sFrench);
		logger.info(sFrench + " Recipe Certification french translation was entered.");
	}
	
	// Save Recipe Certification
	public static void SaveRecipeCertification(int iTestCaseRow) throws Exception {
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		// Click Save
		CMWeb_ConfigurationPage.btnSaveKeyword().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass(sName + " Recipe Certification was successfully saved");
	}
	
	// Search Recipe Certification
	public static void SearchRecipeCertification(int iTestCaseRow) throws Exception {

		// search Packaging Method
		 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtSearchKeyword().sendKeys(sName);
		logger.info("Recipe Certification name: " + sName + " was entered");
		CMWeb_ConfigurationPage.btnSearchKeyword().click();
		Thread.sleep(5000);
		if (CMWeb_ConfigurationPage.chckboxNotes().isDisplayed()) {
			logger.pass("Recipe Certification was successfully searched");
		} else {
			logger.fail("No records existing");
		}

	}
	
	// Edit Recipe Certification
	public static void EditRecipeCertifcation(int iTestCaseRow) throws Exception {

		// tick Recipe Certification to edit
		CMWeb_ConfigurationPage.chckboxNotes().click();
		if (CMWeb_ConfigurationPage.txtFrenchRecipeCert().isDisplayed()) {
			logger.pass("Recipe Certification was able to edit.");
		} else {
			logger.fail("Edit button was not clicked.");
		}
		
		// change french Translation
		String sFrench = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		String sNewFrench = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NewPubName);
		CMWeb_ConfigurationPage.txtFrenchRecipeCert().clear();
		CMWeb_ConfigurationPage.txtFrenchRecipeCert().sendKeys(sNewFrench);
		logger.info(sFrench + " was changed to " + sNewFrench);

	}
	
	// Delete Recipe Certification
	public static void DeleteRecipeCertification(int iTestCaseRow) throws Exception {
		// select Recipe Certification
		 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.chckboxNotes().click();
		logger.info(sName + " Recipe Certification to delete was selected");

		// click delete button
		CMWeb_ConfigurationPage.btnDeleteKeyword().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass("Recipe Certification was successfully deleted.");
	}

}
