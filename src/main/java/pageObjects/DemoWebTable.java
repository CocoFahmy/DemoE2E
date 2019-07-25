package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebTable {

	WebDriver driver;

	public DemoWebTable(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Title
	@FindBy(xpath = "//h1[contains(.,'Automation Demo Site')]")
	WebElement title;
	
	// Notes
	@FindBy(xpath = "//h4[contains(.,'- Double Click on Edit Icon to EDIT the Table Row.')]")
	WebElement editNote;

	@FindBy(xpath = "//h4[contains(.,'- Right Click on Delete Icon to DELETE the Table Row.')]")
	WebElement deleteNote;
	
	//Column name
	@FindBy(xpath = "//div[@role='button'][contains(.,'Email  1')]")
	WebElement email;
	
	@FindBy(xpath = "//span[contains(.,'First Name')]")
	WebElement firstName;
	
	@FindBy(xpath = "//span[contains(.,'Gender')]")
	WebElement gender;
	
	@FindBy(xpath = "//div[@role='button'][contains(.,'Last Name  1')]")
	WebElement lastName;
	
	@FindBy(xpath = "//span[contains(.,'Phone')]")
	WebElement phone;
	
	@FindBy(xpath = "//span[contains(.,'Action')]")
    WebElement action;

	//Table footnote
	@FindBy(xpath = "//span[contains(.,'items per page')]")
	WebElement itempPage; 
	
	@FindBy(xpath = "//span[contains(@ng-show,'grid.options.totalItems > 0')]")
	WebElement totalItems;
	
	//Buttons
	@FindBy(xpath = "(//i[@class='fa fa-pencil'])[1]")
	WebElement editbnt;
	
	@FindBy(xpath = "(//button[contains(@type,'button')])[1]")
	WebElement savebnt;
	
	@FindBy(xpath = "(//button[@type='button'][contains(.,'Cancel')])[1]")
	WebElement ecancelbnt;
	
	@FindBy(xpath = "(//ul[contains(.,'Delete Cancel')])[1]")
	WebElement deletebnt;
	
	@FindBy(xpath = "(//button[contains(.,'Delete')])[1]")
	WebElement delete2bnt;
	
	@FindBy(xpath = "(//button[contains(.,'Cancel')])[5]")
	WebElement dcancelbnt;
	
	@FindBy(xpath = "(//div[contains(.,'Sambit3533@gmail.com')])[11]")
	WebElement emailtobeEdited;
	

	public WebElement title() {
		return title;
	}

	public WebElement editNote() {
		return editNote;
	}

	public WebElement deleteNote() {
		return deleteNote;
	}
	
	public WebElement email() {
		return email;
	}
	
	public WebElement firstName() {
		return firstName;
	}
	
	public WebElement gender() {
		return gender;
	}
	
	public WebElement lastName() {
		return lastName;
	}
	
	public WebElement phone() {
		return phone;
	}
	
	public WebElement action() {
		return action;
	}
	
	public WebElement editbnt() {
		return editbnt;
	}
	
	public WebElement savebnt() {
		return savebnt;
	}
	
	public WebElement ecancelbnt() {
		return ecancelbnt;
	}
	
	public WebElement deletebnt() {
		return deletebnt;
	}
	
	public WebElement delete2bnt() {
		return delete2bnt;
	}
	
	public WebElement dcancelbnt() {
		return dcancelbnt;
	}
	
	public WebElement itempPage() {
		return itempPage;
	}
	
	public WebElement totalItems() {
		return totalItems;
	}
	
	public WebElement emailtobeEdited() {
		return emailtobeEdited;
	}
}
