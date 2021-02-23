package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class ManagingPublicationFunction extends Report {

	// Go to Publication tab
	public static void GoToPublicationTab(int iTestCaseRow) throws Exception {

		// Click tax rate
		CMWeb_ConfigurationPage.btnPublication().click();
		if (CMWeb_ConfigurationPage.btnNewPublication().isDisplayed()) {
			logger.pass("Publication tab is displayed");
		} else {
			logger.fail("Publication tab is not displayed");
		}
	}

	// create new recipe publication
	public static void AddNewPublication(int iTestCaseRow) throws Exception {
		// Click New Button
		CMWeb_ConfigurationPage.btnNewPublication().click();
		if (CMWeb_ConfigurationPage.drpdwnPubParent().isDisplayed()) {
			logger.pass("Publication create page was displayed");
		} else {
			logger.fail("New Button was not clicked.");
		}

		// select parent brand
		 String sParent = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Parent);
		CMWeb_ConfigurationPage.drpdwnPubParent().click();
		CMWeb_ConfigurationPage.drpdwnPubParent().sendKeys(sParent);
		logger.info(sParent + " Parent publication was selected.");

		// input publication name
		 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		CMWeb_ConfigurationPage.txtPubName().sendKeys(sName);
		logger.info("Publication name: " + sName + " was entered.");

		// tick used as a parent publication
		String sUseParent = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UseParentPub);	
		if (sUseParent.equals("Yes")) {
			CMWeb_ConfigurationPage.chckboxParentPub().click();
			logger.info("Can be used as a parent was ticked.");
		} else {
			logger.info("Can be used as a parent was not ticked.");
		}

		// tick sharing
		String sSharing = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_SharingPub);
		if (sSharing.equals("Global")) {
			CMWeb_ConfigurationPage.chckboxGlobal().click();
			logger.info("Global Sharing was ticked.");
		} else if (sSharing.equals("HQ")) {
			CMWeb_ConfigurationPage.chckboxHQPub().click();
			CMWeb_ConfigurationPage.chckboxHQPub().click();
			logger.info("HQ Sharing was ticked.");
		}

	}

	// Save publication
	public static void SavePublication(int iTestCaseRow) throws Exception {
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		// Click Save
		CMWeb_ConfigurationPage.btnSaveKeyword().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass(sName + " Publication was successfully saved");
	}

	// Search Publication
	public static void SearchPublication(int iTestCaseRow) throws Exception {

		// search publication
		 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		CMWeb_ConfigurationPage.txtSearchKeyword().sendKeys(sName);
		logger.info("Publication name: " + sName + " was entered");
		CMWeb_ConfigurationPage.btnSearchKeyword().click();
		Thread.sleep(5000);
		if (CMWeb_ConfigurationPage.chckboxPublication().isDisplayed()) {
			logger.pass("Publication was successfully searched");
		} else {
			logger.fail("No records existing");
		}

	}
	
	// Edit publication
	public static void EditPublication(int iTestCaseRow) throws Exception {

		// tick publication to edit
		CMWeb_ConfigurationPage.chckboxPublication().click();
		if (CMWeb_ConfigurationPage.txtPubName().isDisplayed()) {
			logger.pass("Publication was able to edit.");
		} else {
			logger.fail("Edit button was not clicked.");
		}

		// change publication name
		 String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		String sNewName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NewPubName);
		CMWeb_ConfigurationPage.txtPubName().clear();
		CMWeb_ConfigurationPage.txtPubName().sendKeys(sNewName);
		logger.info(sName + " was changed to " + sNewName);

	}
	
	// Delete publication
	public static void DeletePublication(int iTestCaseRow) throws Exception {
		// select publication
		String sNewName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NewPubName);
		CMWeb_ConfigurationPage.txtSearchKeyword().sendKeys(sNewName);
		CMWeb_ConfigurationPage.btnSearchKeyword().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.chckboxPublication().click();
		logger.info(" Publication to delete was selected");

		// click delete button
		CMWeb_ConfigurationPage.btnDeleteKeyword().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass(sNewName + " Publication was successfully deleted.");
	}

}
