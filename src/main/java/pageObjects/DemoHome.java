package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoHome {
	
	WebDriver driver;

	   public DemoHome(WebDriver driver) {
	      this.driver = driver;
	      PageFactory.initElements(driver,this);
	   }
	   
	   @FindBy(xpath = "//input[contains(@id,'email')]")
	   WebElement email;
	   
	   @FindBy(xpath = "//img[contains(@id,'enterimg')]")
	   WebElement enter;
	  
	   @FindBy(xpath = "//button[contains(@id,'btn1')]")
	   WebElement signin;
	   
	   @FindBy(xpath = "//button[contains(@id,'btn2')]")
	   WebElement nosignin;
	   
	   public WebElement email() {
			return email;
		}
	   
	   public WebElement enter() {
			return enter;
		}
	   
	   public WebElement signin() {
			return signin;
		}
	   
	   public WebElement nosignin() {
			return nosignin;
		}
}
