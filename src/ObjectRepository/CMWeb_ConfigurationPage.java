package ObjectRepository;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CMWeb_ConfigurationPage extends BaseClass {

	private static WebElement Element;
	private static Alert alert;
	
	public CMWeb_ConfigurationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// configuration tab
	public static WebElement btnConfig() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.name("header"));
			driver.switchTo().frame(frame);
			Element = driver.findElement(By.xpath("//*[@id=\"RadTabStrip1\"]/div/ul/li[5]/a"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// system tab
	public static WebElement btnSystem() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.name("main"));
			driver.switchTo().frame(frame);
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_mnu_mnuMainn0\"]/table/tbody/tr/td/a"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// merchandise tab
	public static WebElement btnMerchandise() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.name("main"));
			driver.switchTo().frame(frame);
			Element = driver
					.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_mnu_mnuMainn2\"]/table/tbody/tr/td/a"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Recipe tab
	public static WebElement btnRecipe() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.name("main"));
			driver.switchTo().frame(frame);
			Element = driver
					.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_mnu_mnuMainn3\"]/table/tbody/tr/td/a"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Menu tab
	public static WebElement btnMenu() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.name("main"));
			driver.switchTo().frame(frame);
			Element = driver
					.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_mnu_mnuMainn4\"]/table/tbody/tr/td/a"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// account tab
	public static WebElement btnAccount() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.name("main"));
			driver.switchTo().frame(frame);
			Element = driver
					.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_mnu_mnuMainn1\"]/table/tbody/tr/td/a"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// role button
	public static WebElement btnRoles() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.id("main"));
			driver.switchTo().frame(frame);
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl07_hypname\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Site button
	public static WebElement btnSite() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.id("main"));
			driver.switchTo().frame(frame);
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl01_hypname\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Keyword button
	public static WebElement btnKeyword() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.id("main"));
			driver.switchTo().frame(frame);
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl02_hypname\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Keyword button
	public static WebElement btnKeywordMenu() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.id("main"));
			driver.switchTo().frame(frame);
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl01_hypname\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Users button
	public static WebElement btnUsers() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.id("main"));
			driver.switchTo().frame(frame);
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl02_hypname\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// new button
	public static WebElement btnNew() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.id("main"));
			driver.switchTo().frame(frame);
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucMenu_ucCBtn1_lnkBtn\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// new keyword button
	public static WebElement btnNewKeyword() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.id("main"));
			driver.switchTo().frame(frame).switchTo().frame("ctl00_cphPageContent_configframe");
			Element = driver.findElement(By.xpath("//*[@id=\"managetplclearfix\"]/span[1]/a"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// txtRoleName
	public static WebElement txtRoleName() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_tbxField2\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// txtName
	public static WebElement txtName() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditUser_tbxName\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// txtEmail
	public static WebElement txtEmail() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditUser_tbxEmail\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// txtUsername
	public static WebElement txtUsername() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditUser_tbxUID\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// txtPassword
	public static WebElement txtPassword() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditUser_tbxPWD\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// txtSiteName
	public static WebElement txtSiteName() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditorSite_tbxName\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// txtParent
	public static WebElement txtParent() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[2]/div/div[1]/div/div/div/select"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// txtEnglish
	public static WebElement txtEnglish() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[2]/div/div[2]/div[1]/div/input"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// txtFrench
	public static WebElement txtFrench() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[2]/div/div[2]/div[2]/div/input"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// txtGerman
	public static WebElement txtGerman() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[2]/div/div[2]/div[3]/div/input"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// txtItalian
	public static WebElement txtItalian() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[2]/div/div[2]/div[4]/div/input"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Role type dropdown
	public static WebElement drpdwnRoleType() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_cmbRoleType\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// property role level checkbox
	public static WebElement chckboxPropertyLevel() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_rdoProperty\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// site role type checkbox
	public static WebElement chckboxSiteLevel() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_rdoSite\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// basic role type checkbox
	public static WebElement chckboxBasicLevel() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_rdoBasic\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// user role type checkbox
	public static WebElement chckboxUserRole() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditUser_chkRoles_3\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Check all button
	public static WebElement btnCheckAll() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath(
					"//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_rtbRoleRights\"]/div/div/div/ul/li[1]/a/span/span/span/span"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// save Role button
	public static WebElement btnSaveRole() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_lnkBtnSave\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// save Site button
	public static WebElement btnSaveSite() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditorSite_lnkBtnSave\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// save user button
	public static WebElement btnSaveUser() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditUser_lnkBtnSave\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// save Keyword button
	public static WebElement btnSaveKeyword() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[1]/div/a[2]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Ok Alert
	public static Alert alertOkay() throws Exception {
		alert = null;
		try {
			alert = driver.switchTo().alert();
		} catch (Exception e) {
			throw (e);
		}
		return alert;
	}

	// Edit Role button
	public static WebElement btnEdit() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_Grid_ctl03_lnkBtnEdit\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Edit User button
	public static WebElement btnEditUser() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_Grid_ctl03_lnkbtnEdit\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// txtSearch
	public static WebElement txtSearch() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucMenu_tbxSearch\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// txtSearchKeyword
	public static WebElement txtSearchKeyword() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.id("main"));
			driver.switchTo().frame(frame).switchTo().frame("ctl00_cphPageContent_configframe");
			Element = driver.findElement(By.xpath("//*[@id=\"managetplclearfix2\"]/input"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Search Keyword Button
	public static WebElement btnSearchKeyword() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"managetplclearfix2\"]/button[1]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Search Button
	public static WebElement btnSearch() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucMenu_lnkBtnSearch\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Clear Button
	public static WebElement btnClear() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucMenu_lblClear\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// role checkbox
	public static WebElement chckboxRole() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_Grid_ctl03_chkSelect\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// keyword checkbox
	public static WebElement chckboxKeyword() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver
					.findElement(By.xpath("//*[@id=\"manageOptions\"]/div/div[4]/div/div/div[2]/div/ul/li/span/input"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// site checkbox
	public static WebElement chckboxSite() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_Grid_ctl03_chkselect\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// global sharing checkbox
	public static WebElement chckboxGlobal() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[3]/div[1]/label/input"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// HQ sharing checkbox
	public static WebElement chckboxHQ() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(
					By.xpath("//*[@id=\"managetplrow2\"]/div[3]/div[1]/div/ul/li/div/div/ul/li/span/input"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Inhheritable checkbox
	public static WebElement chckboxInheritable() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"cbInheritable\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// delete Button
	public static WebElement btnDelete() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucMenu_ucCBtn2_lnkBtn\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// delete keyword Button
	public static WebElement btnDeleteKeyword() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"managetplclearfix\"]/span[3]/a"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// deactivate Button
	public static WebElement btnDeactivate() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.id("main"));
			driver.switchTo().frame(frame).switchTo().frame("ctl00_cphPageContent_configframe");
			Element = driver
					.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucMenu_ucCBtnDeactivate_lnkBtn\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Configuration label
	public static WebElement lblConfig() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.name("main"));
			driver.switchTo().frame(frame);
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageTitle_lblTitle\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

//  
	// tools tab
	public static WebElement btnTools() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.name("main"));
			driver.switchTo().frame(frame);
			Element = driver
					.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_mnu_mnuMainn5\"]/table/tbody/tr/td/a"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Print Profile button
	public static WebElement btnPrintProfile() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.id("main"));
			driver.switchTo().frame(frame);
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl06_hypname\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// What to print dropdown
	public static WebElement drpdwnWhatPrint() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_drpPrintType\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// txtProfileName
	public static WebElement txtProfileName() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_tbxName\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// global yes checkbox
	public static WebElement chckboxGlobalYes() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_chk8\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// print style dropdown
	public static WebElement drpdwnPrintStyle() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_drpStyle\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// save print profile button
	public static WebElement btnSave() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_lnkBtnSave\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// What to print filter
	public static WebElement drpdwnWhatPrintFilter() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucMenu_drpCustomFilter\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// print profile checkbox
	public static WebElement chckboxPrintProfile() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_Grid_ctl03_chkselect\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// translation tab
	public static WebElement btnTranslation() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.name("main"));
			driver.switchTo().frame(frame);
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl02_hypname\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Dictionary dropdown
	public static WebElement drpdwnDictionary() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_drp\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// txtTranslation
	public static WebElement txtTranslationName() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_tbxField2\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// translation checkbox
	public static WebElement chckboxTranslation() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_Grid_ctl03_chkSelect\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Nutrient Set button
	public static WebElement btnNutrientSet() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.id("main"));
			driver.switchTo().frame(frame);
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl03_hypname\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// txtNutrientSet
	public static WebElement txtNutrientSet() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_tbxField2\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Database dropdown
	public static WebElement drpdwnDatabase() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_drpUser\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// nutrient set checkbox
	public static WebElement chckboxNutrientSet() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath(
					"//*[@id=\"ctl00_cphPageContent_ctl00_RGrid_ctl00_ctl04_ClientSelectColumnSelectCheckBox\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Edit Nutrient Set button
	public static WebElement btnEditNutrientSet() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_RGrid_ctl00__0\"]/td[4]/a"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Purchase Set of Price tab
	public static WebElement btnPurchaseSet() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.name("main"));
			driver.switchTo().frame(frame);
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl08_hypname\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Currency dropdown
	public static WebElement drpdwnCurrency() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"aaa\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// txtSetPrice
	public static WebElement txtSetPrice() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[2]/div/div/div/div[2]/div/input"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// txtFactor
	public static WebElement txtFactor() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[2]/div/div/div/div[3]/div/input"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Purchasing set checkbox
	public static WebElement chckboxPurchasingSet() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"setPriceCheckBox\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Edit purchasing set button
	public static WebElement btnEditPurchasingSet() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"tblSetPrice\"]/tbody/tr/td[6]/span/img"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}


	// Tax Rates button
	public static WebElement btnTaxRates() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.id("main"));
			driver.switchTo().frame(frame);
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl09_hypname\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// txtTaxName
	public static WebElement txtTaxName() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[2]/div/div/div/div[1]/div/input"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// txtTaxRate
	public static WebElement txtTaxRate() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[2]/div/div/div/div[2]/div/input"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Global sharing Tax rate checkbox
	public static WebElement chckboxGlobalTax() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[3]/div[1]/div[1]/label/input"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// HQ sharing Tax rate checkbox
	public static WebElement chckboxHQTax() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(
					By.xpath("//*[@id=\"managetplrow2\"]/div[3]/div[1]/div[2]/ul/li/div[1]/div/ul/li/span/input"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// tax rate checkbox
	public static WebElement chckboxTaxRate() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"tblTax\"]/tbody/tr/td[1]/input"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Merchandise Brand button
	public static WebElement btnMerchBrand() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.id("main"));
			driver.switchTo().frame(frame);
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl00_hypname\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// parent brand dropdown
	public static WebElement drpdwnParentBrand() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"ParentDropDownManageBrand\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// txtFrenchBrand
	public static WebElement txtFrenchBrand() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[2]/div/div/div/div[3]/div/input"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// txtGermanBrand
	public static WebElement txtGermanBrand() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[2]/div/div/div/div[4]/div/input"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// txtItalianBrand
	public static WebElement txtItalianBrand() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[2]/div/div/div/div[5]/div/input"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// parent brand checkbox
	public static WebElement chckboxParentBrand() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[2]/div/div/div/div[6]/label/input"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Brand checkbox
	public static WebElement chckboxBrand() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By
					.xpath("//*[@id=\"manageOptions\"]/div/div[4]/div/div/div[2]/div/ul/li/div/div/ul/li/span/input"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Merchandise Category button
	public static WebElement btnCategory() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.id("main"));
			driver.switchTo().frame(frame);
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl01_hypname\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// txtEnglishCategory
	public static WebElement txtEnglishCategory() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"DeutschTextfield\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// txtFrenchCategory
	public static WebElement txtFrenchCategory() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"Text1\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// Menu Category button
	public static WebElement btnMenuCategory() throws Exception {
		Element = null;
		try {
			// change frame
			driver.switchTo().defaultContent();
			WebElement frame = driver.findElement(By.id("main"));
			driver.switchTo().frame(frame);
			Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl00_hypname\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// HQ sharing menu category checkbox
	public static WebElement chckboxHQCategory() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(
					By.xpath("//*[@id=\"managetplrow2\"]/div[3]/div[1]/div[3]/ul/li/div[1]/div/ul/li/span/input"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}

	// category checkbox
	public static WebElement chckboxCategory() throws Exception {
		Element = null;
		try {
			// change frame
			/*
			 * driver.switchTo().defaultContent(); WebElement frame =
			 * driver.findElement(By.id("main")); driver.switchTo().frame(frame);
			 */
			Element = driver.findElement(By.xpath("//*[@id=\"tblCategory\"]/tbody/tr/td[1]/input"));
		} catch (Exception e) {
			throw (e);
		}
		return Element;
	}
	
    // Recipe publication button
    public static WebElement btnPublication() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl03_hypname\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    //  new publication button
    public static WebElement btnNewPublication() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame).switchTo().frame("ctl00_cphPageContent_configframe");
    	    	Element = driver.findElement(By.xpath("//*[@id=\"managetplclearfix\"]/span[1]/a"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    //drpdwnPubParent
    public static WebElement drpdwnPubParent() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[2]/div/div/div/div[1]/div/select"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtPubName
    public static WebElement txtPubName() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[2]/div/div/div/div[2]/div/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // parent publication checkbox
    public static WebElement chckboxParentPub() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[2]/div/div/div/div[3]/label/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // HQ sharing publication checkbox
    public static WebElement chckboxHQPub() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[3]/div[1]/div[1]/ul/li/div[1]/div/ul/li/span/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // publication checkbox
    public static WebElement chckboxPublication() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"manageOptions\"]/div/div[4]/div/div/div/div[1]/ul/li/span/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // recipe time button
    public static WebElement btnRecipeTime() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl05_hypname\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtTimeName
    public static WebElement txtTimeName() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[2]/div/div[1]/div/div/div[2]/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtTimeFrench
    public static WebElement txtTimeFrench() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[2]/div/div[2]/div/div/div/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // total time checkbox
    public static WebElement chckboxTotalTime() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[3]/div[2]/div/div[2]/label/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // global time sharing checkbox
    public static WebElement chckboxGlobalTime() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[4]/div[1]/div[1]/label/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // HQ time sharing checkbox
    public static WebElement chckboxHQTime() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[4]/div[1]/div[2]/ul/li/div[1]/div/ul/li/span/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Recipe time checkbox
    public static WebElement chckboxRecipeTime() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"tblTime\"]/tbody/tr/td[1]/div/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // source button
    public static WebElement btnSource() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl06_hypname\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtSourceName
    public static WebElement txtSourceName() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[2]/div[2]/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
 
 
    // source checkbox
    public static WebElement chckboxSource() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"tblSources\"]/tbody/tr[1]/td[1]/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Recipe production location button
    public static WebElement btnProductionLoc() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl08_hypname\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // product location checkbox
    public static WebElement chckboxProductionLoc() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"tblSources\"]/tbody/tr/td[1]/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Recipe Notes button
    public static WebElement btnNotes() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl09_hypname\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtFrenchNotes
    public static WebElement txtFrenchNotes() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"EnglishTextfield\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // notes checkbox
    public static WebElement chckboxNotes() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"tblDictionary\"]/tbody/tr/td[1]/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // search dropdown
    public static WebElement drpdwnSearch() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"repeatSelect\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
 // Packaging Method button
    public static WebElement btnPackagingMethod() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl10_hypname\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
 // recipe certification tab
    public static WebElement btnRecipeCertification() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    		WebElement frame  = driver.findElement(By.name("main"));
	    	driver.switchTo().frame(frame);
    		Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl11_hypname\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtFrenchRecipeCert
    public static WebElement txtFrenchRecipeCert() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"EnglishTextfield\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Auto numbering button
    public static WebElement btnAutoNum() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl00_hypname\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // save autonum button
    public static WebElement btnSaveAutoNumbering() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_lnkBtnSave\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Merchandise Numbering checkbox
    public static WebElement chckboxMerchandiseNumber() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_chkActivateAutoNumber\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Recipe Numbering checkbox
    public static WebElement chckboxRecipeNumber() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_chkActivateAutoNumber2\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Menu Numbering checkbox
    public static WebElement chckboxMenuNumber() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_chkActivateAutoNumber3\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Menu Plan Numbering checkbox
    public static WebElement chckboxMenuPlanNumber() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_chkActivateAutoNumber4\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtMerchPrefix
    public static WebElement txtMerchPrefix() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_txtPrefix\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtRecipePrefix
    public static WebElement txtRecipePrefix() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_txtPrefix2\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtMenuPrefix
    public static WebElement txtMenuPrefix() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_txtPrefix3\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtMenuPlanPrefix
    public static WebElement txtMenuPlanPrefix() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_txtPrefix4\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Keep Length Merch checkbox
    public static WebElement chckboxMerchKeepLength() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_chkKeepLength\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Keep Length Recipe checkbox
    public static WebElement chckboxRecipeKeepLength() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_chkKeepLength2\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Keep Length Menu checkbox
    public static WebElement chckboxMenuKeepLength() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_chkKeepLength3\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Keep Length Menu Plan checkbox
    public static WebElement chckboxMenuPlanKeepLength() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_chkKeepLength4\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtMerchStartWith
    public static WebElement txtMerchStartWith() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_txtStartWith\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtRecipeStartWith
    public static WebElement txtRecipeStartWith() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_txtStartWith2\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtMenuStartWith
    public static WebElement txtMenuStartWith() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_txtStartWith3\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtMenuPlanStartWith
    public static WebElement txtMenuPlanStartWith() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_txtStartWith4\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Kiosk button
    public static WebElement btnKiosk() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl00_hypname\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // kiosk checkbox
    public static WebElement chckboxKiosk() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"tblKiosk\"]/tbody/tr[1]/td[1]/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    
    // Property button
    public static WebElement btnProperty() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl00_hypname\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtPropertyName
    public static WebElement txtPropertyName() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditorProperty_tbxName\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // assign button
    public static WebElement btnAssign() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditorProperty_lnkBtnAssign\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // remove button
    public static WebElement btnRemove() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditorProperty_lnkBtnRemove\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtOption
    public static WebElement txtOption() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditorProperty_lstGroups\"]/option[1]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtUnassigned
    public static WebElement txtUnassigned() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditorProperty_lstUnassigned\"]/option"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // save Property button
    public static WebElement btnSaveProperty() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditorProperty_lnkBtnSave\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
}
