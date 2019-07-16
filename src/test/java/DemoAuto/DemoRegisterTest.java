package DemoAuto;

import org.hamcrest.CoreMatchers;
import org.hamcrest.core.StringContains;
import org.junit.Assert;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import junit.framework.Assert;
import resources.driverBase;
import pageObjects.DemoRegister;

public class DemoRegisterTest extends driverBase{
	
	@BeforeTest
	public void initialization() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	   
	}

	 @Test
	    public void DemoRegister() throws InterruptedException{
		 
		 //Navigate to the register page
		 driver.findElement(By.xpath("//button[contains(.,'Skip Sign In')]")).click() ;
		 
		 //Fetch all the links present on register page 
		 //Get list of web-elements with tagName  - a
			List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			
		 //Traversing through the list and printing its text along with link address
			for(WebElement link:allLinks){
				System.out.println(link.getText() + " - " + link.getAttribute("href"));
			}
		
		 //Validate the tile and copy right on the register page
			DemoRegister dr = new DemoRegister(driver);
			Assert.assertEquals(dr.title().getText(),"Automation Demo Site");
			String s =  dr.copyright().getText();
			Assert.assertThat("The copy right contains test", s, CoreMatchers.containsString("@ 2016 Automation Testing All Rights Reserved"));
			
		 //Fetch all the labels present on register page
		 //Get list of web-element with xpath contains - //label
		
			//xpath = "//label
		 
	    }
	 /*
	 @AfterTest
	    public void closeBrowser(){
	    
	       driver.close();
	       driver=null;
	    }
	    */
}