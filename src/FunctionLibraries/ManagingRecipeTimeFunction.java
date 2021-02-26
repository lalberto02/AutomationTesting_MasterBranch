package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class ManagingRecipeTimeFunction extends Report {

	// Go to Recipe Time tab
	public static void GoToRecipeTimeTab(int iTestCaseRow) throws Exception {

		// Click tax rate
		CMWeb_ConfigurationPage.btnRecipeTime().click();
		if (CMWeb_ConfigurationPage.btnNewPublication().isDisplayed()) {
			logger.pass("Recipe Time tab is displayed");
		} else {
			logger.fail("Recipe Time tab is not displayed");
		}
	}

	// create new recipe time
	public static void AddNewRecipeTime(int iTestCaseRow) throws Exception {
		// Click New Button
		CMWeb_ConfigurationPage.btnNewPublication().click();
		if (CMWeb_ConfigurationPage.txtTimeName().isDisplayed()) {
			logger.pass("Recipe Time create page was displayed");
		} else {
			logger.fail("New Button was not clicked.");
		}

		// input Recipe Time name
		 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtTimeName().sendKeys(sName);
		logger.info("Recipe Time name: " + sName + " was entered.");

		// input Recipe Time french
		 String sFrench = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		CMWeb_ConfigurationPage.txtTimeFrench().sendKeys(sFrench);
		logger.info(sFrench + " Recipe Time french translation was entered.");

		// tick total time
		String sTotalTime = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UseParentPub);
		if (sTotalTime.equals("Yes")) {
			CMWeb_ConfigurationPage.chckboxTotalTime().click();
			logger.info("Total time was ticked.");
		} else {
			logger.info("Total time was not ticked.");
		}

		// tick sharing
		String sSharing = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_SharingPub);
		if (sSharing.equals("Global")) {
			CMWeb_ConfigurationPage.chckboxGlobalTime().click();
			logger.info("Global Sharing was ticked.");
		} else if (sSharing.equals("HQ")) {
			CMWeb_ConfigurationPage.chckboxHQTime().click();
			CMWeb_ConfigurationPage.chckboxHQTime().click();
			logger.info("HQ Sharing was ticked.");
		}

	}
	
	// Save recipe time
	public static void SaveRecipeTime(int iTestCaseRow) throws Exception {
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		// Click Save
		CMWeb_ConfigurationPage.btnSaveKeyword().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass(sName + " Recipe time was successfully saved");
	}
	
	// Search Recipe Time
	public static void SearchRecipeTime(int iTestCaseRow) throws Exception {

		// search Recipe Time
		 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtSearchKeyword().sendKeys(sName);
		logger.info("Recipe time name: " + sName + " was entered");
		CMWeb_ConfigurationPage.btnSearchKeyword().click();
		Thread.sleep(5000);
		if (CMWeb_ConfigurationPage.chckboxRecipeTime().isDisplayed()) {
			logger.pass("Recipe time was successfully searched");
		} else {
			logger.fail("No records existing");
		}

	}
	
	// Edit recipe time
	public static void EditRecipeTime(int iTestCaseRow) throws Exception {

		// tick recipe time to edit
		CMWeb_ConfigurationPage.chckboxRecipeTime().click();
		if (CMWeb_ConfigurationPage.txtTimeFrench().isDisplayed()) {
			logger.pass("Recipe Time was able to edit.");
		} else {
			logger.fail("Edit button was not clicked.");
		}
		
		// change french Translation
		 String sFrench = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		String sNewFrench = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NewPubName);
		CMWeb_ConfigurationPage.txtTimeFrench().clear();
		CMWeb_ConfigurationPage.txtTimeFrench().sendKeys(sNewFrench);
		logger.info(sFrench + " was changed to " + sNewFrench);

	}
	
	// Delete recipe time 
	public static void DeleteRecipeTime(int iTestCaseRow) throws Exception {
		// select Recipe time
		 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.chckboxRecipeTime().click();
		logger.info(sName + " recipe time to delete was selected");

		// click delete button
		CMWeb_ConfigurationPage.btnDeleteKeyword().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass("recipe time was successfully deleted.");
	}

}
