package ObjectRepository;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CMWeb_MainPage extends BaseClass {
	private static WebElement Element;
    
	public CMWeb_MainPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
    // Support Button
    public static WebElement btnSupport() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.name("header"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"btnSupport\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Welcome to Support label
	public static WebElement lblWelcomeSupport() throws Exception {
		Element = null;
		try {
			//Get handles of the windows
			driver.switchTo().defaultContent();
			String MainWindow = driver.getWindowHandle();
		    System.out.println("Main window handle is " + MainWindow);
		 
		    // To handle all new opened window
		    Set<String> s1 = driver.getWindowHandles();
		    System.out.println("Child window handle is" + s1);
		    Iterator<String> i1 = s1.iterator();
		 
		    // Here we will check if child window has other child windows and when child window
		    //is the main window it will come out of loop.
		      while (i1.hasNext()) {
		          String ChildWindow = i1.next();
		          if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
		              driver.switchTo().window(ChildWindow);
		              Element = driver.findElement(By.xpath("//*[@id=\"WelcomeSupport\"]"));
		           }
		       }     
		} catch (Exception e) {
			throw(e);
		}
		return Element;
	}
	
    // English Manual download link
    public static WebElement lnkEnglishManual() throws Exception {
    	Element = null;
    	try {
    		// change frame
    	   /* WebElement frame  = driver.findElement(By.name("header"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ManualFile1\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // German Manual download link
    public static WebElement lnkGermanManual() throws Exception {
    	Element = null;
    	try {
    		// change frame
    	   /* WebElement frame  = driver.findElement(By.name("header"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ManualFile2\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // French Manual download link
    public static WebElement lnkFrenchManual() throws Exception {
    	Element = null;
    	try {
    		// change frame
    	   /* WebElement frame  = driver.findElement(By.name("header"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ManualFile3\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }

}
