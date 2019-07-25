package DemoAuto;

import org.hamcrest.CoreMatchers;
import org.hamcrest.core.StringContains;
import org.junit.Assert;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import junit.framework.Assert;
import resources.driverBase;
import pageObjects.DemoRegister;

public class DemoRegisterTest extends driverBase {
	
	WebDriver driver;
	WebDriverWait wait;

	@BeforeTest
	public void initialization() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();

	}

	// Navigate to the register page
	@Test(priority = 1)
	public void NavigateRegister() {
		driver.findElement(By.xpath("//button[contains(.,'Skip Sign In')]")).click();
	}

	// Validate all the elements on the page
	@Test(priority = 2)
	public void ValidateElements() throws InterruptedException {

		// Fetch all the links present on register page
		// Get list of web-elements with tagName - a
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		// Traversing through the list and printing its text along with link address
		for (WebElement link : allLinks) {
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}

		// Fetch all the labels present on register page
		// Get list of web-element with xpath contains - //label
		List<WebElement> allLabels = driver.findElements(By.tagName("label"));
		System.out.println("Lables on the Register page");
		// Traversing through the list and printing its text
		for (WebElement lable : allLabels) {
			System.out.println(lable.getText());
		}

		// Validate the tiles, copy right and the image of the photo on the register page
		DemoRegister dr2 = new DemoRegister (driver);
		Assert.assertEquals(dr2.title().getText(), "Automation Demo Site");
		Assert.assertEquals(dr2.registerL().getText(), "Register");
		Assert.assertTrue(dr2.photoImage().isDisplayed());
		/***********************************************************************************************?
		 * String s = dr.copyright().getText();
		 * Assert.assertThat("The copy right contains test", s,
		 * CoreMatchers.containsString("@ 2016 Automation Testing All Rights Reserved"))
		 * ;
		 */
       }
	
	// Check the refresh button
	@Test(priority = 3)
	public void checkRefreshbtn() {
		WebElement firstname =  driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstname.sendKeys("Coco");
		driver.findElement(By.id("Button1")).click();
		//Verify the blank first name field after refreshing 
		//Assert.assertEquals(firstname.getAttribute("class"), "form-control ng-pristine ng-invalid ng-invalid-required ng-touched");
		
	}
	
	// Fill in the registration form
	@Test(priority = 4)
	public void RegisterForm() {
		 DemoRegister dr4 = new DemoRegister (driver);//how can I define it globally*********************?
		 //Enter the fields
		 dr4.firstname().sendKeys("Coco");
		 dr4.lastname().sendKeys("Fahmy");
		 dr4.address().sendKeys("123 Ave,Gaithersburg, MD 20878");
		 dr4.email().sendKeys("qatester194@gmail.com");
		 dr4.phone().sendKeys("0134567890");
		 //Click the check boxes
		 dr4.female().click();
		 dr4.movies().click();
		 
		 Select drpSkills = new Select(dr4.skills());
		 drpSkills.selectByVisibleText("Java");
		 
		 Select drpCountries = new Select(dr4.countries());
		 drpCountries.selectByVisibleText("China");
		 
		 Select drpYear = new Select(dr4.yearbox());
		 drpYear.selectByVisibleText("2000");
		 Select drpMonth = new Select(dr4.monthbox());
		 drpMonth.selectByVisibleText("July");
		 Select drpDay = new Select(dr4.daybox());
		 drpDay.selectByVisibleText("3");
		 
		 dr4.firstpassword().sendKeys("Password101");
		 dr4.secondpassword().sendKeys("Password101");
	}
	
	//Check auto complete selection 
	@Parameters({"textToSelect"})
	@Test(priority = 5)
	public void AutoSelect(@Optional String textToSelect) {
		
		try {
			//Verify all the text values
			Thread.sleep(5000);
			WebElement autoOptions = driver.findElement(By.id("msdd"));
			autoOptions.click();
			List<WebElement> ele = driver.findElements(By.xpath("//div[contains(@id,'msdd')]/..//li"));
			for(int i =1;i<=ele.size();i++) {
				String text = driver.findElement(By.xpath("//div[contains(@id,'msdd')]/..//li["+i+"]/a")).getText();
				System.out.println(text);
			}
			autoOptions.click();
			
			//Add values to the auto complete box
			List<String> values = new ArrayList<String>();
			values.add("Bulgarian");
			values.add("Catalan");
			
			//Click the text values
			for(int i=0;i<=values.size();i++) {
				
				By linkText = By.linkText(values.get(i));
				driver.findElement(linkText).click();
				System.out.println("");
			}
			
		}catch (NoSuchElementException e) {
			System.out.println(e.getStackTrace());
		}
		catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		
	}
	
	//Select combo-box
	@Test(priority = 6)
	public void SelectCombo() throws InterruptedException{
	Actions clickArrow = new Actions( driver );
	WebElement comboBox = driver.findElement(By.className("select2-selection__arrow"));
	clickArrow.click(comboBox).build().perform();
	
	Select select = new Select(driver.findElement(By.id("country")));
    select.selectByVisibleText("United States of America");
	 }

	//Load picture
	@Test(priority = 7)
	public void LoadPhoto() {
	WebElement UploadImg = driver.findElement(By.id("imagesrc"));
	UploadImg.sendKeys("C:\\Upload\\IMG_3295.jpg");
	}

	//Submit the form
	@Test(priority = 8)
	public void SubmitForm() {
		driver.findElement(By.id("submitbtn")).click();
	}
	
	//Verify the next page
	@Test(priority = 9)
	public void verifyNextPage() throws InterruptedException {
		Thread.sleep(5000);
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "http://demo.automationtesting.in/WebTable.html" );
		//how to verify the highlighted link**************************************************?
	}
	
	/*
	 //Close browser
	  @AfterTest public void closeBrowser(){
	 
	   driver.close(); 
	   driver=null; 
	 }
	 */
}