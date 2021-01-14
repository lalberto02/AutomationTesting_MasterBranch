package FunctionLibraries;

import ObjectRepository.CMWeb_MerchandisePage;
import ObjectRepository.CMWeb_RecipePage;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Report;

public class RecipeFunction extends Report {
	
	//Go to Merchandise tab
	public static void GoToRecipe(int iTestCaseRow) throws Exception{
		
		// Click Merchandise
		CMWeb_RecipePage.btnRecipe().click();
			// reporting validation
		if (CMWeb_RecipePage.lblRecipe().isDisplayed()) {
			logger.pass("Recipe Tab was displayed");
		} else {
			logger.fail("Recipe button was not clicked");
		}
			// screenshot
		
	}
	
	// Fill up Recipe Main Page
		public static void CreateRecipeMain(int iTestCaseRow) throws Exception{
			
			//Click new recipe button
			CMWeb_RecipePage.btnNewRecipe().click();
					// reporting
			if (CMWeb_RecipePage.txtRecipeName().isDisplayed()) {
				logger.pass("Create Recipe tab was displayed.");		
			} else {
				logger.fail("New button was not clicked.");
			}
			
			//Input Recipe Name
				String sRecipeName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
				CMWeb_RecipePage.txtRecipeName().sendKeys(sRecipeName);
						// Reporting
				logger.info(sRecipeName + " was entered");
				
				//input Number
				if (CMWeb_RecipePage.txtNumber().isEnabled()) {
					String sNumber = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Number);
					CMWeb_RecipePage.txtNumber().sendKeys(sNumber);
					logger.info(sNumber + " was entered");
				} else {
					// report
					logger.info("Autonumbering was enabled.");
				}
				
			//select category
				String sCategory = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Category);
				CMWeb_RecipePage.drpdownCategory().click();
				CMWeb_RecipePage.drpdownCategory().sendKeys(sCategory);
							// Reporting	
				logger.info(sCategory + " category was selected.");
				
			//select source
				String sSource = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Source);
				CMWeb_RecipePage.drpdownSource().click();
				CMWeb_RecipePage.drpdownSource().sendKeys(sSource);
							// Reporting
				logger.info(sSource + " source was selected.");
				
			//Input Yield
					String sYield = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Yield);
					CMWeb_RecipePage.txtYield().clear();
					CMWeb_RecipePage.txtYield().sendKeys(sYield);
							// Reporting
					logger.info(sYield + " yield was entered.");
					
			//Select Yield
					String sYield2 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Yield2);
					CMWeb_RecipePage.drpdownYield().click();
					CMWeb_RecipePage.drpdownYield().sendKeys(sYield2);
							// Reporting	
					logger.info(sYield2 + " yield was selected.");
					
			//Click calculate
					CMWeb_RecipePage.btnCalculate().click();
					if (CMWeb_RecipePage.btnYesCalculate().isDisplayed()) {
						CMWeb_RecipePage.btnYesCalculate().click();
						logger.pass("Serving was calculated");
					} else {
						logger.fail("Calculate button was disabled.");
					}
			
			// main tab reporting		
			logger.pass("Create Recipe Main Tab was populated");		
		}
		
	// add ingredient and procedure
		public static void AddIngredientProcedure(int iTestCaseRow) throws Exception{
			
			// go to ingredient and procedure tab
			CMWeb_RecipePage.btnIngredientProd().click();
			//validation
			if (CMWeb_RecipePage.txtSearchIngredient().isDisplayed()) {
				logger.pass("Ingredient and Procedure tab was displayed.");	
			} else {
				logger.fail("Ingredient and procedure button ");
			}
			
			//search ingredient
			String sSearch = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_SearchRecipe);
			CMWeb_RecipePage.txtSearchIngredient().sendKeys(sSearch);
			logger.info(sSearch + " was entered");
			CMWeb_RecipePage.btnSearch().click();
			if (CMWeb_RecipePage.txtNetQty().isDisplayed()) {
				//Enter Net Quantity
				String sNetQTY = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NetQTY);
				CMWeb_RecipePage.txtNetQty().sendKeys(sNetQTY);
				// add ingredient
				CMWeb_RecipePage.btnAddIngredient().click();
				// reporting
				logger.pass(sSearch + " was added as ingredient.");
			} else {
				logger.fail("No ingredient was searched.");
			}
			
		}
		
		// add Nutrient
		public static void AddNutrient(int iTestCaseRow) throws Exception{
			
			// go to nutrient tab
			CMWeb_RecipePage.btnNutrient().click();
			//validation
			if (CMWeb_RecipePage.txtImposedNutrient().isDisplayed()) {
				// input Imposed Nutrient
				String sNutrient = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ImposedNutrient);
				CMWeb_RecipePage.txtImposedNutrient().clear();
				CMWeb_RecipePage.txtImposedNutrient().sendKeys(sNutrient);
				logger.pass(sNutrient + " nutrient/s was added.");
			} else {
				logger.fail("No nutrient was added.");
			}
					
		}
		
		// save merchandise
		public static void SaveRecipe(int iTestCaseRow) throws Exception{
			String sRecipeName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			// Click save button
			CMWeb_RecipePage.btnSave().click();	
			//validation reporting screenshot
			Thread.sleep(5000);
			CMWeb_RecipePage.alertOkay().accept();
			logger.pass(sRecipeName + " was saved.");
		}
		
		// search created Recipe
		public static void SearchCreatedRecipe(int iTestCaseRow) throws Exception{
			
			// click list button
			CMWeb_RecipePage.btnList().click();
			Thread.sleep(5000);
			CMWeb_RecipePage.alertLeave().accept();
			if(CMWeb_RecipePage.txtSearchRecipe().isDisplayed()) {
				String sRecipeName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
				CMWeb_RecipePage.txtSearchRecipe().sendKeys(sRecipeName);
				CMWeb_RecipePage.btnSearchRecipe().click();
				if (CMWeb_RecipePage.linkSearchedRecipe().isDisplayed()) {
					logger.pass(sRecipeName + " was successfully created");
				} else {
					logger.fail(sRecipeName + " was not included in the recipe list.");
				} 
				
			}else {
				logger.fail("List Button was not clicked.");
			}
			
			
		}
		
		// search Recipe
		public static void SearchRecipe(int iTestCaseRow) throws Exception{
			
			// click list button
			CMWeb_RecipePage.btnList().click();
			if(CMWeb_RecipePage.txtSearchRecipe().isDisplayed()) {
				String sRecipeName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
				CMWeb_RecipePage.txtSearchRecipe().sendKeys(sRecipeName);
				CMWeb_RecipePage.btnSearchRecipe().click();
				if (CMWeb_RecipePage.linkSearchedRecipe().isDisplayed()) {
					logger.pass(sRecipeName + " was included in the recipe list.");
				} else {
					logger.fail(sRecipeName + " was not included in the recipe list.");
				} 
				
			}else {
				logger.fail("List Button was not clicked.");
			}
			
			
		}
		
		// view recent merchandise
		public static void ViewRecentRecipe(int iTestCaseRow) throws Exception{
			CMWeb_MerchandisePage.linkHistory().click();
			 //validation reporting and screenshot
			
		}
		

}
