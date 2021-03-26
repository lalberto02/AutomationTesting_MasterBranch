package ObjectRepository;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CMWeb_MenuPage extends BaseClass {

	private static WebElement Element;
	private static Alert alert;

	public CMWeb_MenuPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Menu Button
	public static WebElement btnMenu() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.name("header"));
			driver.switchTo().frame(frame);
			Element = driver.findElement(By.xpath("//*[@id=\"RadTabStrip1\"]/div/ul/li[3]/a/span/span/span"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Menu label
	public static WebElement lblMenu() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.id("main"));
			driver.switchTo().frame(frame);
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageTitle_lblTitle\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// New Menu Button
	public static WebElement btnNewMenu() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.name("header"));
			driver.switchTo().frame(frame);
			Element = driver.findElement(By.xpath("//*[@id=\"ctl13\"]/div/div/div/ul/li[1]/a/span/span/span/span"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// txtMenuName
	public static WebElement txtMenuName() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.id("main"));
			driver.switchTo().frame(frame);
			Element = driver.findElement(By.xpath("//*[@id=\"main-template\"]/div[1]/div[2]/table/tbody/tr[3]/td[2]/input"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}
	
    // category dropdown
    public static WebElement drpdownCategory() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"main-template\"]/div[1]/div[2]/table/tbody/tr[5]/td[2]/select"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // source dropdown
    public static WebElement drpdownSource() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"main-template\"]/div[1]/div[2]/table/tbody/tr[6]/td[2]/select"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
	// txtPortion
	public static WebElement txtPortion() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.id("main"));
			driver.switchTo().frame(frame);
			Element = driver.findElement(By.xpath("//*[@id=\"main-template\"]/div[1]/div[2]/table/tbody/tr[8]/td[2]/input[1]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}
	
    //Calculate button
    public static WebElement btnCalculate() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"main-template\"]/div[1]/div[2]/table/tbody/tr[8]/td[2]/span[2]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Ok Alert
    public static Alert alertOkay() throws Exception {
    	alert = null;
    	try {
    		alert = driver.switchTo().alert();
    	} catch (Exception e) {
    		throw(e);
    	}
    	return alert;
    }
    
    //Item and procedure button
    public static WebElement btnItemProd() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ingredient\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Search Menu Item textbox
    public static WebElement txtSearchItem() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ingredient-control-panel\"]/tbody/tr[2]/td/table/tbody/tr/td[2]/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    //Search button
    public static WebElement btnSearch() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ingredient-control-panel\"]/tbody/tr[3]/td/table/tbody/tr/td[2]/span[3]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Net QTY textbox
    public static WebElement txtNetQty() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ingredient-template\"]/div[1]/div[2]/div[2]/table/tbody/tr/td[1]/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    //Add item button
    public static WebElement btnAddItem() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ingredient-template\"]/div[1]/div[2]/div[2]/table/tbody/tr/td[6]/span"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    //Nutrient button
    public static WebElement btnNutrient() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"nutrition\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Imposed Nutrient textbox
    public static WebElement txtImposedNutrient() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"nutrition-template\"]/div/div[2]/div[1]/table/tbody/tr[1]/td[6]/input[1]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Save Button
    public static WebElement btnSave() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/input[2]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // List button
    public static WebElement btnList() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    		WebElement frame  = driver.findElement(By.name("header"));
	    	driver.switchTo().frame(frame);
    		Element = driver.findElement(By.xpath("//*[@id=\"ctl13\"]/div/div/div/ul/li[2]/a/span/span/span/span"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Search Menu textbox
    public static WebElement txtSearchMenu() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.id("txRecipe"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Search Menu Button
    public static WebElement btnSearchMenu() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div/div[1]/div[1]/button[1]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // search menu link
    public static WebElement linkSearchedMenu() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[3]/div[2]/table/tbody/tr/td[3]/a"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // History Menu
    public static WebElement linkHistory() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageDescription_ucDLHistory_Grid_ctl00_lnkBtnName\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Menu Name label
    public static WebElement lblMenuName() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"RADSearchListDetailsRecipe1_lblRecipeName\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }

}
