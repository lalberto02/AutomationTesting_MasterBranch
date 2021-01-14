package FunctionLibraries;

import ObjectRepository.CMWeb_LoginPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class LoginFunction extends Report {
	public static void Execute(int iTestCaseRow) throws Exception {

		// insert username
		String sUserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UserName);
		CMWeb_LoginPage.txtUserName().sendKeys(sUserName);
		// reporting
		logger.info("Username was entered.");

		// insert password
		String sPassword = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Password);
		CMWeb_LoginPage.txtPassword().sendKeys(sPassword);
		// reporting
		logger.info("Password was entered.");

		// click sign in
		CMWeb_LoginPage.btnSignIn().click();
		// validation
		if (CMWeb_LoginPage.lblUser().isDisplayed()) {
			logger.pass(sUserName + " was successfully login.");
		} else {
			logger.fail(sUserName + " unable to login.");
		}

	}

}
