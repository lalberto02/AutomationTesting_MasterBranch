package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class ManagingPropertyFunction extends Report {

	// go to property tab
	public static void GoToPropertyTab(int iTestCaseRow) throws Exception {
		// Click Roles Button
		CMWeb_ConfigurationPage.btnProperty().click();
		if (CMWeb_ConfigurationPage.txtSearch().isDisplayed()) {
			logger.pass("Property tab was displayed");
		} else {
			logger.fail("Property button was not clicked.");
		}
	}

	// create new property
	public static void AddNewProperty(int iTestCaseRow) throws Exception {
		// Click New Button
		CMWeb_ConfigurationPage.btnNew().click();
		if (CMWeb_ConfigurationPage.txtPropertyName().isDisplayed()) {
			logger.pass("Property create page was displayed");
		} else {
			logger.fail("New Button was not clicked.");
		}

		// input name
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtPropertyName().sendKeys("EGS Test Property");
		logger.info(sName + " Property name was entered.");

		// assign site
		CMWeb_ConfigurationPage.txtUnassigned().click();
		CMWeb_ConfigurationPage.btnAssign().click();
		logger.info("Successfully assigned site");

	}

	// save property
	public static void SaveProperty(int iTestCaseRow) throws Exception {
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		// Click save button
		CMWeb_ConfigurationPage.btnSaveProperty().click();
		// validation reporting screenshot
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass(sName + " Property was successfully saved");
	}

	// Search property
	public static void SearchProperty(int iTestCaseRow) throws Exception {

		// search Property
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtSearch().sendKeys(sName);
		logger.info("Property name: " + sName + " was entered");
		CMWeb_ConfigurationPage.btnSearch().click();
		Thread.sleep(5000);
		if (CMWeb_ConfigurationPage.chckboxSite().isDisplayed()) {
			logger.pass("Property was successfully searched");
		} else {
			logger.fail("No records existing");
		}

	}

	// Edit property
	public static void EditProperty(int iTestCaseRow) throws Exception {

		// Click Edit button
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.btnEdit().click();
		if (CMWeb_ConfigurationPage.txtPropertyName().isDisplayed()) {
			logger.pass(sName + " Property was able to edit.");
		} else {
			logger.fail("Edit button was not clicked.");
		}

		// unassigned site
		CMWeb_ConfigurationPage.txtOption().click();
		CMWeb_ConfigurationPage.btnRemove().click();
		logger.info("Successfully unassigned site");

	}

	// Delete Property
	public static void DeleteProperty(int iTestCaseRow) throws Exception {
		// select property
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.chckboxSite().click();
		logger.info(sName + " Property to delete was selected");

		// click delete button
		CMWeb_ConfigurationPage.btnDelete().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass("Property was successfully deleted.");
	}

}
