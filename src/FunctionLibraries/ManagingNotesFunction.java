package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class ManagingNotesFunction extends Report {

	// Go to Notes tab
	public static void GoToNotesTab(int iTestCaseRow) throws Exception {

		// Click tax rate
		CMWeb_ConfigurationPage.btnNotes().click();
		if (CMWeb_ConfigurationPage.btnNewKeyword().isDisplayed()) {
			logger.pass("Notes tab is displayed");
		} else {
			logger.fail("Notes tab is not displayed");
		}
	}

	// create new notes
	public static void AddNewNotes(int iTestCaseRow) throws Exception {
		// Click New Button
		CMWeb_ConfigurationPage.btnNewKeyword().click();
		if (CMWeb_ConfigurationPage.txtEnglishCategory().isDisplayed()) {
			logger.pass("Recipe notes create page was displayed");
		} else {
			logger.fail("New Button was not clicked.");
		}

		// input recipe notes name
		 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtEnglishCategory().sendKeys(sName);
		logger.info("Recipe notes name: " + sName + " was entered.");

		// input Recipe Notes french
		 String sFrench = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		CMWeb_ConfigurationPage.txtFrenchNotes().sendKeys(sFrench);
		logger.info(sFrench + "Recipe Notes french translation was entered.");
	}
	
	// Save recipe notes
	public static void SaveRecipeNotes(int iTestCaseRow) throws Exception {
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		// Click Save
		CMWeb_ConfigurationPage.btnSaveKeyword().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass(sName + " Recipe Notes was successfully saved");
	}
	
	// Search Recipe Notes
	public static void SearchRecipeNotes(int iTestCaseRow) throws Exception {

		// search Recipe Time
		 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtSearchKeyword().sendKeys(sName);
		logger.info("Recipe time name: " + sName + " was entered");
		CMWeb_ConfigurationPage.btnSearchKeyword().click();
		Thread.sleep(5000);
		if (CMWeb_ConfigurationPage.chckboxNotes().isDisplayed()) {
			logger.pass("Recipe notes was successfully searched");
		} else {
			logger.fail("No records existing");
		}

	}
	
	// Edit recipe note
	public static void EditRecipeNote(int iTestCaseRow) throws Exception {

		// tick recipe notes to edit
		CMWeb_ConfigurationPage.chckboxNotes().click();
		if (CMWeb_ConfigurationPage.txtFrenchNotes().isDisplayed()) {
			logger.pass("Recipe notes was able to edit.");
		} else {
			logger.fail("Edit button was not clicked.");
		}
		
		// change french Translation
		 String sFrench = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		String sNewFrench = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NewPubName);
		CMWeb_ConfigurationPage.txtFrenchNotes().clear();
		CMWeb_ConfigurationPage.txtFrenchNotes().sendKeys(sNewFrench);
		logger.info(sFrench + " was changed to " + sNewFrench);

	}
	
	// Delete recipe notes  
	public static void DeleteRecipeNotes(int iTestCaseRow) throws Exception {
		// select publication
		 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.chckboxNotes().click();
		logger.info(sName + " Recipe Notes to delete was selected");

		// click delete button
		CMWeb_ConfigurationPage.btnDeleteKeyword().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass("Recipe Notes was successfully deleted.");
	}

}
