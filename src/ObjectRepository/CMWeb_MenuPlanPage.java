package ObjectRepository;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CMWeb_MenuPlanPage extends BaseClass {
	private static WebElement Element;
	private static Select select;
    
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
    
	// New Menu Plan Button
	public static WebElement btnNewMenuPlan() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.name("header"));
			driver.switchTo().frame(frame);
			Element = driver.findElement(By.xpath("//*[@id=\"ctl15\"]/div/div/div/ul/li[1]/a/span/span/span/span"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}
	
	// txtMenuPlanName
	public static WebElement txtMenuPlanName() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
		    WebElement frame  = driver.findElement(By.id("main"));
		    	driver.switchTo().frame(frame);
		    	Element = driver.findElement(By.xpath("//*[@id=\"txtName\"]"));
		} catch (Exception e) {
			throw(e);
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
    	    	Element = driver.findElement(By.xpath("//*[@id=\"drpCategory\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // restaurant dropdown
    public static WebElement drpdownRestaurant() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"drpRestaurantNameVal\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
	// txtPlanDate
	public static WebElement txtPlanDate() throws Exception {
		Element = null;
		try {
			// change frame
			/*driver.switchTo().defaultContent();
		    WebElement frame  = driver.findElement(By.id("main"));
		    	driver.switchTo().frame(frame);*/
		    	Element = driver.findElement(By.xpath("//*[@id=\"txtPlanungBis\"]"));
		} catch (Exception e) {
			throw(e);
		}
		return Element;
	}
	
	// txtStartDate
	public static WebElement txtStartDate() throws Exception {
		Element = null;
		try {
			// change frame
			/*driver.switchTo().defaultContent();
		    WebElement frame  = driver.findElement(By.id("main"));
		    	driver.switchTo().frame(frame);*/
		    	Element = driver.findElement(By.xpath("//*[@id=\"txtStartDate\"]"));
		} catch (Exception e) {
			throw(e);
		}
		return Element;
	}
	
	// txtDuration
	public static WebElement txtDuration() throws Exception {
		Element = null;
		try {
			// change frame
			/*driver.switchTo().defaultContent();
		    WebElement frame  = driver.findElement(By.id("main"));
		    	driver.switchTo().frame(frame);*/
		    	Element = driver.findElement(By.xpath("//*[@id=\"txtDuration\"]"));
		} catch (Exception e) {
			throw(e);
		}
		return Element;
	}
	
	// txtRecurrence
	public static WebElement txtRecurrence() throws Exception {
		Element = null;
		try {
			// change frame
			/*driver.switchTo().defaultContent();
		    WebElement frame  = driver.findElement(By.id("main"));
		    	driver.switchTo().frame(frame);*/
		    	Element = driver.findElement(By.xpath("//*[@id=\"txtRecurrence\"]"));
		} catch (Exception e) {
			throw(e);
		}
		return Element;
	}
	
    // save menu plan button
	public static WebElement btnSaveMenuPlan() throws Exception {
		Element = null;
		try {
			// change frame
		    /*WebElement frame  = driver.findElement(By.name("main"));
		    	driver.switchTo().frame(frame);*/
		    	Element = driver.findElement(By.xpath("//*[@id=\"btnSave\"]"));
		} catch (Exception e) {
			throw(e);
		}
		return Element;
	}
	
    // edit item button
	public static WebElement btnEditItem() throws Exception {
		Element = null;
		try {
			// change frame
		    /*WebElement frame  = driver.findElement(By.name("main"));
		    	driver.switchTo().frame(frame);*/
		    	Element = driver.findElement(By.xpath("//*[@id=\"DL_Monday_ctl00_BTN_EDIT_Monday\"]/img"));
		} catch (Exception e) {
			throw(e);
		}
		return Element;
	}
	
    // add item button
	public static WebElement btnAddItem() throws Exception {
		Element = null;
		try {
			//change frame
			//driver.switchTo().defaultContent();
			driver.switchTo().activeElement();
		    Element = driver.findElement(By.id("BTN_ADD"));
		               
		} catch (Exception e) {
			throw(e);
		}
		return Element;
	}
	
    // History Menu plan
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
    
    // List button
    public static WebElement btnList() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    		WebElement frame  = driver.findElement(By.name("header"));
	    	driver.switchTo().frame(frame);
    		Element = driver.findElement(By.xpath("//*[@id=\"ctl15\"]/div/div/div/ul/li[2]/a/span/span/span/span"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Search Menu plan textbox
    public static WebElement txtSearchMenuPlan() throws Exception {
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
    
    // Search Menu plan Button
    public static WebElement btnSearchMenuPlan() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div/div/div/div[1]/button[1]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // search menu plan link
    public static WebElement linkSearchedMenuPlan() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/table/tbody/tr/td[3]/a"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // more actions dropdown
    public static WebElement drpdownMoreAction() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"menuReport\"]/ul/li/a"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Export dropdown
    public static Select drpdownExport() throws Exception {
    	select = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	select = (Select) driver.findElement(By.xpath("//*[@id=\"menuReport\"]/ul/li/a/span"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return select;
    }
    
    
}
