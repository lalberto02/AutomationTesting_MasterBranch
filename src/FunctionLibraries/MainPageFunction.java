package FunctionLibraries;

import ObjectRepository.CMWeb_MainPage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class MainPageFunction extends Report {
	
    //Go to view/support tab
	public static void GoToViewHelpSupport(int iTestCaseRow) throws Exception{
		
		// Click Help/Support button
		CMWeb_MainPage.btnSupport().click();
		if (CMWeb_MainPage.lblWelcomeSupport().isDisplayed()) {
			logger.pass("Help/Support tab is displayed");
		} else {
			logger.fail("Help/Support tab is not displayed");
		}		
	}
	
    // Download Manual
	public static void DownloadManual(int iTestCaseRow) throws Exception{
		
		// Download manual document 
		String sLanguage = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		if (sLanguage.equals("English")) {
			CMWeb_MainPage.lnkEnglishManual().click();
			logger.info("English Manual has been downloaded.");
		} else if (sLanguage.equals("German")) {
			CMWeb_MainPage.lnkGermanManual().click();
			logger.info("German Manual has been downloaded.");
		} else if (sLanguage.equals("French")) {
			CMWeb_MainPage.lnkFrenchManual().click();
			logger.info("French Manual has been downloaded.");
		}
	}
	

}