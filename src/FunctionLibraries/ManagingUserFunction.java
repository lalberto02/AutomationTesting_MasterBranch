package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class ManagingUserFunction extends Report {

	public static void GoToUsersTab(int iTestCaseRow) throws Exception {
		// Click Users Button
		CMWeb_ConfigurationPage.btnUsers().click();
		if (CMWeb_ConfigurationPage.btnNew().isDisplayed()) {
			logger.pass("User tab was displayed.");
		} else {
			logger.fail("User button was not clicked.");
		}
	}

	public static void AddNewUser(int iTestCaseRow) throws Exception {
		// Click New Button
		CMWeb_ConfigurationPage.btnNew().click();
		if (CMWeb_ConfigurationPage.txtName().isDisplayed()) {
			logger.pass("User create page was displayed");
		} else {
			logger.fail("New Button was not clicked.");
		}

		// input name
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtName().sendKeys(sName);
		logger.info(sName + " was entered.");

		// enter email address
		String sEmail = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Email);
		CMWeb_ConfigurationPage.txtEmail().sendKeys(sEmail);
		logger.info(sEmail + " was entered.");

		// enter username
		String sUser = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_User);
		CMWeb_ConfigurationPage.txtUsername().sendKeys(sUser);
		logger.info(sUser + " username was entered.");

		// enter password
		String sPass = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Pass);
		CMWeb_ConfigurationPage.txtPassword().sendKeys(sPass);
		logger.info("Password was entered.");

		// select role
		CMWeb_ConfigurationPage.chckboxUserRole().click();
		logger.info("User Role was selected.");

	}

	// save user
	public static void SaveUser(int iTestCaseRow) throws Exception {
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		// Click save button
		CMWeb_ConfigurationPage.btnSaveUser().click();
		// validation reporting screenshot
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass("User " + sName + " was successfully saved");
	}

	// Edit User
	public static void EditUser(int iTestCaseRow) throws Exception {

		// search role
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtSearch().sendKeys(sName);
		CMWeb_ConfigurationPage.btnSearch().click();
		logger.info(sName + " was searched.");

		// Click Edit button
		CMWeb_ConfigurationPage.btnEditUser().click();
		if (CMWeb_ConfigurationPage.txtUsername().isDisplayed()) {
			// change user username
			String sUser = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_User);
			CMWeb_ConfigurationPage.txtUsername().clear();
			CMWeb_ConfigurationPage.txtUsername().sendKeys(sUser);
			logger.pass("Username was changed to " + sUser);
		} else {
			logger.fail("Edit Button was not clicked.");
		}

	}

	// Delete User
	public static void DeleteUser(int iTestCaseRow) throws Exception {

		// search role
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtSearch().sendKeys(sName);
		CMWeb_ConfigurationPage.btnSearch().click();
		logger.info(sName + " was searched.");

		// Click Role Checkbox to delete
		CMWeb_ConfigurationPage.chckboxRole().click();
		logger.info(sName + " was clicked.");

		// click delete button
		CMWeb_ConfigurationPage.btnDelete().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass("User " + sName + " was successfully deleted.");
	}

	// Deactivate User
	public static void DeactivateUser(int iTestCaseRow) throws Exception {

		// search role
		String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtSearch().sendKeys(sName);
		CMWeb_ConfigurationPage.btnSearch().click();
		logger.info(sName + " was searched.");

		// Click Role Checkbox to delete
		CMWeb_ConfigurationPage.chckboxRole().click();
		logger.info(sName + " was clicked.");

		// click delete button
		CMWeb_ConfigurationPage.btnDeactivate().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		logger.pass("User " + sName + " was successfully deactivated.");
	}
}
