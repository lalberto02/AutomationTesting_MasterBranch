package FunctionLibraries;

import ObjectRepository.CMWeb_MerchandisePage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class MerchadiseFunction extends Report {

	// Go to Merchandise tab
	public static void GoToMerchandise(int iTestCaseRow) throws Exception {

		// Click Merchandise
		CMWeb_MerchandisePage.btnMerch().click();
		// reporting validation
		if (CMWeb_MerchandisePage.lblMerchandise().isDisplayed()) {
			logger.pass("Merchandise Tab was displayed");
		} else {
			logger.fail("Merchadise button was not clicked");
		}

	}

	// Fill up Merchandise Main Page
	public static void CreateMerchandiseMain(int iTestCaseRow) throws Exception {

		// Click new merchandise button
		CMWeb_MerchandisePage.btnNewMerch().click();
		// reporting
		if (CMWeb_MerchandisePage.txtMerchName().isDisplayed()) {
			logger.pass("Create Merchandise tab was displayed.");
		} else {
			logger.fail("New button was not clicked.");
		}

		// Input Merchandise Name
		String sMerchName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_MerchandisePage.txtMerchName().sendKeys(sMerchName);
		// Reporting
		logger.info(sMerchName + " was entered");

		// input Number
		if (CMWeb_MerchandisePage.txtNumber().isEnabled()) {
			String sNumber = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Number);
			CMWeb_MerchandisePage.txtNumber().sendKeys(sNumber);
			logger.info(sNumber + " was entered");
		} else {
			// report
			logger.info("Autonumbering was enabled.");
		}

		// select brand
		String sBrand = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Brand);
		CMWeb_MerchandisePage.drpdownBrand().click();
		CMWeb_MerchandisePage.drpdownBrand().sendKeys(sBrand);
		// Reporting
		logger.info(sBrand + " brand was selected.");

		// select category
		String sCategory = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Category);
		CMWeb_MerchandisePage.drpdownCategory().click();
		CMWeb_MerchandisePage.drpdownCategory().sendKeys(sCategory);
		// Reporting
		logger.info(sCategory + " category was selected.");

		// select supplier
		String sSupplier = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Supplier);
		CMWeb_MerchandisePage.drpdownSupplier().click();
		CMWeb_MerchandisePage.drpdownSupplier().sendKeys(sSupplier);
		logger.info(sSupplier + " supplier was selected.");

		// Input Wastage
		String sWastage = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Wastage);
		CMWeb_MerchandisePage.txtWastage().clear();
		CMWeb_MerchandisePage.txtWastage().sendKeys(sWastage);
		logger.info(sWastage + " wastage was entered.");

		// Click calculate
		CMWeb_MerchandisePage.btnCalculate().click();
		logger.pass("Wastage was calculated");

		// Input Price
		String sPrice = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Price);
		CMWeb_MerchandisePage.txtPrice().clear();
		CMWeb_MerchandisePage.txtPrice().sendKeys(sPrice);
		logger.info(sPrice + " price was entered.");

		// select Unit
		String sUnit = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Unit);
		CMWeb_MerchandisePage.drpdownUnit().click();
		CMWeb_MerchandisePage.drpdownUnit().sendKeys(sUnit);
		logger.info(sUnit + " unit was selected.");

		// main tab reporting
		logger.pass("Create Merchandise Main Tab was populated");
	}

	// Link Nutrient to Merchandise
	public static void LinkNutrientMerchandise(int iTestCaseRow) throws Exception {

		// go to nutrient tab
		CMWeb_MerchandisePage.btnNutrient().click();
		if (CMWeb_MerchandisePage.btnLink().isDisplayed()) {
			logger.pass("Nutrient tab was displayed");
		} else {
			// report
			logger.info("Nutrient button was not clicked.");
		}

		// search Merchandise
		CMWeb_MerchandisePage.btnLink().click();
		if (CMWeb_MerchandisePage.txtSearchMerchNut().isDisplayed()) {
			String sSearch = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_SearchName);
			CMWeb_MerchandisePage.txtSearchMerchNut().sendKeys(sSearch);
			CMWeb_MerchandisePage.btnSearchNut().click();
			if (CMWeb_MerchandisePage.linkMerchandise().isDisplayed()) {
				logger.pass(sSearch + " was displayed");
			} else {
				logger.fail(sSearch + " was not displayed");
			}
		}

		// link merchandise
		CMWeb_MerchandisePage.linkMerchandise().click();
		if (CMWeb_MerchandisePage.txtEnergy().isDisplayed()) {
			logger.pass("Merchandise was linked.");
		} else {
			logger.fail("Unsucessful linking.");
		}

	}

	// Add allergen to Merchandise
	public static void AddAllergensMerchandise(int iTestCaseRow) throws Exception {

		// click allergen tab
		CMWeb_MerchandisePage.btnAllergen().click();
		if (CMWeb_MerchandisePage.chckboxAllergenContains().isDisplayed()) {
			logger.pass("Allergen tab was displayed");
		} else {
			logger.fail("Allergen button was not clicked");
		}
		CMWeb_MerchandisePage.chckboxAllergenContains().click();
		logger.info("Allergen was checked.");
		CMWeb_MerchandisePage.chckboxAllergenNon().click();
		logger.info("non allergen was checked");

	}

	// save merchandise
	public static void SaveMerchandise(int iTestCaseRow) throws Exception {
		String sMerchName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		// Click save button
		CMWeb_MerchandisePage.btnSave().click();
		// validation reporting screenshot
		Thread.sleep(5000);
		CMWeb_MerchandisePage.alertOkay().accept();

		logger.pass(sMerchName + " was saved.");
	}

	// search merchandise
	public static void SearchMerchandise(int iTestCaseRow) throws Exception {

		// click list button
		CMWeb_MerchandisePage.btnList().click();
		if (CMWeb_MerchandisePage.txtSearchMerch().isDisplayed()) {
			String sMerchName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			CMWeb_MerchandisePage.txtSearchMerch().sendKeys(sMerchName);
			CMWeb_MerchandisePage.drpdownSearchCondi().sendKeys("and");
			CMWeb_MerchandisePage.btnSearchMerch().click();
			if (CMWeb_MerchandisePage.linkSearchedMerchandise().isDisplayed()) {
				logger.pass(sMerchName + " was successfully displayed");
			} else {
				logger.fail(sMerchName + " was not included in the merchandise list.");
			}

		} else {
			logger.fail("List Button was not clicked.");
		}

	}

	// view recent merchandise
	public static void ViewRecentMerchandise(int iTestCaseRow) throws Exception {
		CMWeb_MerchandisePage.linkHistory().click();
		// validation reporting 
		if (CMWeb_MerchandisePage.lblMerchandiseName().isDisplayed()) {
			logger.pass("Successfully viewed Merchandise from History");
		} else {
			logger.fail("No Records in the history pane");
		
		}

	}

	// populate information tab (Ingredient and Specific determination)
	public static void PopulateInformationMerchandise(int iTestCaseRow) throws Exception {

		CMWeb_MerchandisePage.btnInformation().click();
		if (CMWeb_MerchandisePage.txtIngredient().isDisplayed()) {
			logger.pass("Information ta was displayed");
		} else {
			logger.fail("Information button was not clicked.");
		}

		String sIngredient = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Ingredient);
		CMWeb_MerchandisePage.txtIngredient().sendKeys(sIngredient);
		logger.info(sIngredient + " was entered");

		String sDetermination = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Determination);
		CMWeb_MerchandisePage.txtSpecification().sendKeys(sDetermination);
		logger.info(sDetermination + " was entered");
	}

	// tick global sharing
	public static void GlobalSharingMerchandise(int iTestCaseRow) throws Exception {

		CMWeb_MerchandisePage.btnSharing().click();
		if (CMWeb_MerchandisePage.chckboxGlobal().isDisplayed()) {
			CMWeb_MerchandisePage.chckboxGlobal().click();
			logger.pass("Global sharing was ticked.");
		} else {
			logger.fail("Sharing button was not clicked.");
		}

	}
}
