package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSignin {
	 WebDriver driver;

	   public DemoSignin(WebDriver driver) {
	      this.driver = driver;
	      PageFactory.initElements(driver,this);
	   }

	   @FindBy(xpath = "//input[@ng-model='Email']")
	   WebElement email;
	   
	   @FindBy(xpath = "//input[contains(@ng-model,'Password')]")
	   WebElement password;
	   
	   @FindBy(xpath = "//img[@id='enterbtn']")
	   WebElement enterbtn;
	   
	   public WebElement email() {
			return email;
		}
	   
	   public WebElement password() {
			return password;
		}
	   
	   public WebElement enterbtn() {
			return enterbtn;
		}
}

