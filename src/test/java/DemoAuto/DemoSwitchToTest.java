package DemoAuto;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.DemoSwitchTo;
import resources.driverBase;

public class DemoSwitchToTest extends driverBase {

	WebDriver driver;

	@BeforeTest
	public void initialization() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(.,'Skip Sign In')]")).click();
	}

	// Select Alerts

	@Test(priority = 1)
	public void Alerts() throws InterruptedException {

		DemoSwitchTo dr1 = new DemoSwitchTo(driver);
		dr1.switchTo().click();
		dr1.alrets().click();

		// Verification
		Thread.sleep(5000);
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "http://demo.automationtesting.in/Alerts.html");
		Assert.assertTrue(dr1.okTab().isDisplayed());

		// Alert with OK*************************************************
		dr1.okbnt().click();
		Thread.sleep(5000);
		String alertOK = driver.switchTo().alert().getText();
		Assert.assertEquals(alertOK, "I am an alert box!");
		driver.switchTo().alert().accept();

		// Alert with OK & cancel*****************************************
		dr1.cancelTab().click();
		dr1.confirmbnt().click();
		Thread.sleep(5000);
		String alertOnC = driver.switchTo().alert().getText();
		Assert.assertEquals(alertOnC, "Press a Button !");
		driver.switchTo().alert().accept(); // Click OK
		String okNote = dr1.okNote().getText();
		Assert.assertEquals(okNote, "You pressed Ok");
		dr1.confirmbnt().click();
		driver.switchTo().alert().dismiss(); // Click cancel
		String cancelNote = dr1.cancelNote().getText();
		Assert.assertEquals(cancelNote, "You Pressed Cancel");

		// Alert with text box ********************************************
		dr1.textboxTab().click();
		dr1.prompbnt().click();
		driver.switchTo().alert().sendKeys("Coco");
		driver.switchTo().alert().accept(); // Click OK
		String prompNote = dr1.prompNote().getText();
		Assert.assertEquals(prompNote, "Hello Coco How are you today");
		dr1.prompbnt().click();
		driver.switchTo().alert().dismiss(); // Click cancel
	}

	// Select Windows
	@Test(priority = 2)
	public void Windows() throws InterruptedException {

		DemoSwitchTo dr2 = new DemoSwitchTo(driver);
		dr2.switchTo().click();
		dr2.windows().click();

		Thread.sleep(5000);
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "http://demo.automationtesting.in/Windows.html");

		// Open new tabbed windows****************************************
		Assert.assertTrue(dr2.nwTab().isDisplayed());
		String nwNote = dr2.nwNote().getText();
		Assert.assertEquals(nwNote,
				"If you set the target attribute to \"_blank\" , the link will open in a new browser window or a new tab");
		dr2.nwbnt().click();

		// store instance of main window first
		String winHandleBefore = driver.getWindowHandle();

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		// Perform the actions on new window
		String URLnw = driver.getCurrentUrl();
		Assert.assertEquals(URLnw, "http://www.sakinalium.in/");
		driver.close(); // close new opened window
		// switch back to main window
		driver.switchTo().window(winHandleBefore);

		// Open new separate windows***********************************
		Assert.assertTrue(dr2.nwsTab().isDisplayed());
		dr2.nwsTab().click();
		String nswNote = dr2.nwsNote().getText();
		// stem.out.print(nswNote);

		Assert.assertEquals(nswNote, "click the button to open a new window with some specifications");
		dr2.nwsbnt().click();

		// store instance of main window first
		String winHandleBefore2 = driver.getWindowHandle();

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		// Perform the actions on new window
		String URLnws = driver.getCurrentUrl();
		Assert.assertEquals(URLnws, "http://www.sakinalium.in/");
		driver.close(); // close new opened window
		// switch back to main window
		driver.switchTo().window(winHandleBefore2);

		// Open separate multiple windows********************************
		Assert.assertTrue(dr2.mwTab().isDisplayed());
		dr2.mwTab().click();
		String mwNote = dr2.mwNote().getText();

		Assert.assertEquals(mwNote, "Click the button to open multiple windows");
		dr2.mwbnt().click();

		// store instance of main window first
		String winHandleBefore3 = driver.getWindowHandle();

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		// Perform the actions on new window
		String URLmw = driver.getCurrentUrl();
		Assert.assertEquals(URLmw, "http://demo.automationtesting.in/Index.html");
		driver.close(); // close new opened window
		// switch back to main window
		driver.switchTo().window(winHandleBefore3);
	}

	// Select Frames
	@Test(priority = 3)
	public void Frames() throws InterruptedException {

		DemoSwitchTo dr3 = new DemoSwitchTo(driver);
		dr3.switchTo().click();
		dr3.frames().click();

		// Verification
		Thread.sleep(5000);
		String URLf = driver.getCurrentUrl();
		Assert.assertEquals(URLf, "http://demo.automationtesting.in/Frames.html");

		// Single iframe******************************************
		dr3.sframebnt().click();
		// Switch to the iframe through ID
		driver.switchTo().frame("singleframe");
		dr3.sframeText().sendKeys("Coco Fahmy");
		driver.switchTo().parentFrame();

		// iframe within an iframe********************************
		dr3.iframebnt().click();
		Thread.sleep(5000);
		// Find out how many iframes on the page
		int sizef = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total IFrames --" + sizef);
		driver.switchTo().frame("Multiple"); // Switching the Outer Frame

		// Find out how many iframes inside outer frame
		// int sizeif = driver.findElements(By.tagName("iframe")).size();
		// System.out.println("Total IFrames inside the outer frame--" + sizeif);
		driver.switchTo().frame("Single"); // Switching to innerframe
		dr3.iframeText().sendKeys("How are you doing?");
		driver.switchTo().defaultContent();

	}
}
