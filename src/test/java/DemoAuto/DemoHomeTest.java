package DemoAuto;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test; ??????

import pageObjects.DemoHome;
import resources.driverBase;


public class DemoHomeTest extends driverBase{
	
	@BeforeTest
	public void initialization() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	   
	}
	
	 @Test
	    public void validatePageElements() throws InterruptedException 
	    {
	     
		   DemoHome dh = new DemoHome(driver);
	       //validate all the elements on the home page
	       AssertJUnit.assertTrue(dh.email().isDisplayed());
	       //log.info("Text box for entering email address is Displayed");
	       AssertJUnit.assertTrue(dh.enter().isDisplayed());
	       //log.info("Enter icon is Displayed");
	       AssertJUnit.assertTrue(dh.signin().isDisplayed());
	       //log.info("Sign in button is Displayed");
	       AssertJUnit.assertTrue(dh.nosignin().isDisplayed());
	       
	       
	       Actions action=new Actions(driver);
	   	   action.sendKeys(dh.email(), "qatester198@gmail.com").perform();
	       action.click(dh.enter()).perform();
	       //validate the tile of next page "Automation Demo Site"?
	       driver.navigate().back();
	       action.click(dh.signin()).perform();
	       driver.navigate().back();
	       action.click(dh.nosignin()).perform();
	       driver.navigate().back();
	     }
	    
	    @AfterTest
	    public void closeBrowser()
	    {
	       driver.close();
	       driver=null;
	    }
}  