package Utility;


import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Utils extends Report {
		public static WebDriver driver = null;
	public static WebDriver OpenBrowser(int iTestCaseRow) throws Exception{
		String sURL;
		String sBrowserName;
		
		sBrowserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Browser);
		if(sBrowserName.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
			driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    sURL = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_URL);
		    driver.get(sURL);
		    driver.manage().window().maximize();
		    Thread.sleep(1000);
		    logger.info("Chrome application launched successfully");
		}
		
		else if
			(sBrowserName.equals("Edge")) {
			System.setProperty("webdriver.edge.driver","C:\\Browser driver\\msedgedriver.exe");
			driver = new EdgeDriver();
			//Log.info("New driver instantiated");
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    //Log.info("Implicit wait applied on the driver for 10 seconds");
		    String sURL1 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_URL);
		    driver.get(sURL1);
		    driver.manage().window().maximize();
		    Thread.sleep(1000);
		    logger.info("Edge application launched successfully");
			}
		
		return driver;
	}
	
	
	
	public static String getTestCaseName(String sTestCase)throws Exception{
		String value = sTestCase;
		try{
			int posi = value.indexOf("@");
			value = value.substring(0, posi);
			posi = value.lastIndexOf(".");	
			value = value.substring(posi + 1);
			return value;
				}catch (Exception e){
			//Log.error("Class Utils | Method getTestCaseName | Exception desc : "+e.getMessage());
			throw (e);
					}
			}
	

	 public static void waitForElement(WebElement element, String string){
		 
		 WebDriverWait wait = new WebDriverWait(driver, 10);
	     wait.until(ExpectedConditions.elementToBeClickable(element));
	 	}
	 
	 public static String getCurrentDateTime() {
		 DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		 Date currentDate = new Date();
		 return customFormat.format(currentDate);
	 }
		
	 public static String takeScreenshot(WebDriver driver) {
			try{
				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(scrFile,new File(Constant.Path_ScreenShot ));
				//new File(Constant.Path_ScreenShot + sTestCaseName +".jpg"
			} catch (Exception e){
				logger.error("Class Utils | Method takeScreenshot | Exception occured while capturing ScreenShot : "+e.getMessage());
			}
			
			return Constant.Path_ScreenShot;
		}
	 
	 
	}
