package DemoAuto;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.DemoSignin;
import resources.driverBase;

public class DemoSigninTest extends driverBase {
	
	WebDriver driver;
	
	@BeforeTest
	public void initialization() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();

	}

	@Test
	public void Signin() {
		//Navigate to the Sign in page
		driver.findElement(By.id("btn1")).click();
		DemoSignin drs = new DemoSignin (driver);
		drs.email().sendKeys("qatester198@gmail.com");
		drs.password().sendKeys("Password101");
		drs.enterbtn().click();
	}
	
	@AfterTest 
	public void closeBrowser(){
		 
		   driver.close(); 
		   driver=null; 
	}

}
