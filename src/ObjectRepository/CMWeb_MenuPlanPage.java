package ObjectRepository;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CMWeb_MenuPlanPage extends BaseClass {
	private static WebElement Element;
    
	public CMWeb_MenuPlanPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	
    // Menu Plan Button
    public static WebElement btnMenuPlan() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.name("header"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"RadTabStrip1\"]/div/ul/li[4]/a"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Menu Plan label
    public static WebElement lblMenuPlan() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    		WebElement frame  = driver.findElement(By.name("main"));
	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageTitle_lblTitle\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Configuration Button
    public static WebElement btnConfiguration() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.name("header"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl15\"]/div/div/div/ul/li[3]/a/span/span/span/span"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Restaurant tab Button
    public static WebElement btnRestauTab() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    		WebElement frame  = driver.findElement(By.name("main"));
	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl00_hypname\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // add Restaurant tab Button
    public static WebElement btnAddRestau() throws Exception {
    	Element = null;
    	try {
    		// change frame
    	    /*WebElement frame  = driver.findElement(By.name("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_lnkBtnAddRestaurant\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // add Menu PLan tab Button
    public static WebElement btnAddMenuPlan() throws Exception {
    	Element = null;
    	try {
    		// change frame
    	    /*WebElement frame  = driver.findElement(By.name("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_lnkBtnAddMasterPlan\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // save restaurant button
	public static WebElement btnSaveRestau() throws Exception {
		Element = null;
		try {
			// change frame
		    /*WebElement frame  = driver.findElement(By.name("main"));
		    	driver.switchTo().frame(frame);*/
		    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_lnkBtnSave\"]"));
		} catch (Exception e) {
			throw(e);
		}
		return Element;
	}
	
    // save master plan button
	public static WebElement btnSaveMasterPlan() throws Exception {
		Element = null;
		try {
			// change frame
		    /*WebElement frame  = driver.findElement(By.name("main"));
		    	driver.switchTo().frame(frame);*/
		    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_lnkBtnSave2\"]"));
		} catch (Exception e) {
			throw(e);
		}
		return Element;
	}
	
    // search button
	public static WebElement btnSearch() throws Exception {
		Element = null;
		try {
			// change frame
		    /*WebElement frame  = driver.findElement(By.name("main"));
		    	driver.switchTo().frame(frame);*/
		    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_lnkBtnSearchRestaurant\"]"));
		} catch (Exception e) {
			throw(e);
		}
		return Element;
	}
	
    // remove restaurant button
	public static WebElement btnRemoveRestau() throws Exception {
		Element = null;
		try {
			// change frame
    		driver.switchTo().defaultContent();
    		WebElement frame  = driver.findElement(By.name("main"));
	    	driver.switchTo().frame(frame);
		    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_dgRestaurant_ctl02_lnkRemoveRestaurant\"]"));
		} catch (Exception e) {
			throw(e);
		}
		return Element;
	}
	
    // remove masterplan button
    public static WebElement btnRemoveMenuPlan() throws Exception {
    	Element = null;
    	try {
    		// change frame
    	    /*WebElement frame  = driver.findElement(By.name("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_lnkBtnRemoveMasterPlan\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // delete masterplan button
    public static WebElement btnDeleteMenuPlan() throws Exception {
    	Element = null;
    	try {
    		// change frame
    	    /*WebElement frame  = driver.findElement(By.name("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_lnkBtnDeleteMasterPlan\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }

	// txtRestauName
	public static WebElement txtRestauName() throws Exception {
		Element = null;
		try {
			// change frame
			/*driver.switchTo().defaultContent();
		    WebElement frame  = driver.findElement(By.id("main"));
		    	driver.switchTo().frame(frame);*/
		    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_txtNameMasterPlanEdit\"]"));
		} catch (Exception e) {
			throw(e);
		}
		return Element;
	}
	
	// txtMasterPlanName
	public static WebElement txtMasterPlanName() throws Exception {
		Element = null;
		try {
			// change frame
			/*driver.switchTo().defaultContent();
		    WebElement frame  = driver.findElement(By.id("main"));
		    	driver.switchTo().frame(frame);*/
		    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_txtNameMasterPlanAdd\"]"));
		} catch (Exception e) {
			throw(e);
		}
		return Element;
	}
	
	// txtMasterPlanGroup
	public static WebElement txtMasterPlanGroup() throws Exception {
		Element = null;
		try {
			// change frame
			/*driver.switchTo().defaultContent();
		    WebElement frame  = driver.findElement(By.id("main"));
		    	driver.switchTo().frame(frame);*/
		    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_drpGroup\"]"));
		} catch (Exception e) {
			throw(e);
		}
		return Element;
	}
	
	// txtMasterPlanFrench
	public static WebElement txtMasterPlanFrench() throws Exception {
		Element = null;
		try {
			// change frame
			/*driver.switchTo().defaultContent();
		    WebElement frame  = driver.findElement(By.id("main"));
		    	driver.switchTo().frame(frame);*/
		    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_grvMPTranslation_ctl02_txtName\"]"));
		} catch (Exception e) {
			throw(e);
		}
		return Element;
	}
	
	// txtSearchRestau
	public static WebElement txtSearchRestau() throws Exception {
		Element = null;
		try {
			// change frame
			/*driver.switchTo().defaultContent();
		    WebElement frame  = driver.findElement(By.id("main"));
		    	driver.switchTo().frame(frame);*/
		    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_txtNameSearch\"]"));
		} catch (Exception e) {
			throw(e);
		}
		return Element;
	}

	// Master Menu Plan checkbox
    public static WebElement chckboxMasterMenuPlan() throws Exception {
    	Element = null;
    	try {
    		// change frame
    	    /*WebElement frame  = driver.findElement(By.name("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_chkMasterPlan_7\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
	// Menu Plan checkbox
    public static WebElement chckboxMenuPlan() throws Exception {
    	Element = null;
    	try {
    		// change frame
    	    /*WebElement frame  = driver.findElement(By.name("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_dgRemoveMasterPlan_ctl19_chkSelect\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
}
