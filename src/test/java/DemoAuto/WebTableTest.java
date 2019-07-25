package DemoAuto;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.DemoWebTable;
import resources.driverBase;

public class WebTableTest extends driverBase {

	WebDriver driver;
	WebDriverWait wait;

	@BeforeTest
	public void initialization() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();

	}

	// Navigate to the main page
	@Test(priority = 1)
	public void NavigateWebTable() {
		driver.findElement(By.xpath("//button[contains(.,'Skip Sign In')]")).click();
		driver.findElement(By.linkText("WebTable")).click();
	}

	// Validate the elements on the page
	/*
	 * @Test(priority = 2) public void validateElements() { DemoWebTable drwt2 = new
	 * DemoWebTable(driver); Assert.assertEquals(drwt2.title().getText(),
	 * "Automation Demo Site"); Assert.assertEquals(drwt2.editNote().getText(),
	 * "- Double Click on Edit Icon to EDIT the Table Row.");
	 * Assert.assertEquals(drwt2.deleteNote().getText(),
	 * "- Right Click on Delete Icon to DELETE the Table Row.");
	 * Assert.assertTrue(drwt2.email().isDisplayed());
	 * Assert.assertTrue(drwt2.firstName().isDisplayed());
	 * Assert.assertTrue(drwt2.lastName().isDisplayed());
	 * Assert.assertTrue(drwt2.gender().isDisplayed());
	 * Assert.assertTrue(drwt2.phone().isDisplayed());
	 * Assert.assertTrue(drwt2.action().isDisplayed());
	 * Assert.assertTrue(drwt2.itempPage().isDisplayed());
	 * Assert.assertTrue(drwt2.totalItems().isDisplayed()); }
	 */

	// Edit table
	@Test(priority = 3)
	public void editTable() {

		int isPresent = driver.findElements(By
				.xpath("//div[@class='ui-grid-cell-contents ng-binding ng-scope'][contains(.,'Sambit3533@gmail.com')]"))
				.size();
		if (isPresent > 0) {

			// Click edit button
			Actions doubleClick = new Actions(driver);
			DemoWebTable drwt3 = new DemoWebTable(driver);
			WebElement editbnt = drwt3.editbnt();
			doubleClick.doubleClick(editbnt).build().perform();
			// Edit email address
			String oldEmail = drwt3.emailtobeEdited().getText();
			String newEmail = "Sambit353@gmail.com";
			String editedEmail = oldEmail.replace(oldEmail, newEmail);
			System.out.println(oldEmail);
			System.out.println(editedEmail);

		} else {
			System.out.println("The email was not found in the table");
		}

	}

}
