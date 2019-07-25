package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSwitchTo {

	WebDriver driver;

	public DemoSwitchTo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='SwitchTo.html'][contains(.,'SwitchTo')]")
	WebElement switchTo;

	// Alerts
	@FindBy(xpath = "//a[@href='Alerts.html']")
	WebElement alerts;

	@FindBy(xpath = "//a[@href='#OKTab']")
	WebElement okTab;

	@FindBy(xpath = "//a[@href='#CancelTab']")
	WebElement cancelTab;

	@FindBy(xpath = "//a[@href='#Textbox'][contains(.,'Alert with Textbox')]")
	WebElement textboxTab;

	@FindBy(xpath = "//button[@onclick='alertbox()']")
	WebElement okbnt;

	@FindBy(xpath = "//button[@onclick='confirmbox()']")
	WebElement confirmbnt;

	@FindBy(xpath = "//p[contains(.,'You Pressed Cancel')]")
	WebElement cancelNote;

	@FindBy(xpath = "//p[contains(.,'You pressed Ok')]")
	WebElement okNote;

	@FindBy(xpath = "//button[contains(@onclick,'promptbox()')]")
	WebElement prompbnt;

	@FindBy(xpath = "//p[contains(@id,'demo1')]")
	WebElement promptNote;

	// Windows
	@FindBy(xpath = "//a[@href='Windows.html']")
	WebElement windows;
	
	@FindBy(xpath = "//a[@href='#Tabbed']")
	WebElement nwTab;

	@FindBy(xpath = "//p[contains(.,'If you set the target attribute to')]")
	WebElement nwNote;

	@FindBy(xpath = "(//button[contains(.,'click')])[1]")
	WebElement nwbnt;

	@FindBy(xpath = "//a[@href='#Seperate']")
	WebElement nwsTab;
	
	@FindBy(xpath = "//p[contains(.,'click the button to open a new window with some specifications')]")
	WebElement nwsNote;
	
    @FindBy(xpath = "//button[contains(@onclick,'newwindow()')]")
	WebElement nwsbnt;

	@FindBy(xpath = "//a[@href='#Multiple']")
	WebElement mwTab;
	
	@FindBy(xpath = "//p[contains(.,'Click the button to open multiple windows')]")
	WebElement mwNote;

	@FindBy(xpath = "//button[@onclick='multiwindow()']")
	WebElement mwbnt;

	//Frames
	@FindBy(xpath = "//a[@href='Frames.html']")
	WebElement frames;
	
	@FindBy(xpath = "//a[@href='#Single']")
	WebElement sframebnt;
	
	@FindBy(xpath = "//div[contains(@class,'row')]")
	WebElement sframe;
	
	@FindBy(xpath = "//input[contains(@type,'text')]")
	WebElement sframeText;
	
	@FindBy(xpath = "//a[@href='#Multiple'][contains(.,'Iframe with in an Iframe')]")
	WebElement iframebnt;
	
	@FindBy(xpath = "//input[contains(@type,'text')]")
	WebElement iframeText;
	
	// Alerts
	public WebElement switchTo() {
		return switchTo;
	}

	public WebElement alrets() {
		return alerts;
	}

	public WebElement okTab() {
		return okTab;
	}

	public WebElement cancelTab() {
		return cancelTab;
	}

	public WebElement textboxTab() {
		return textboxTab;
	}

	public WebElement okbnt() {
		return okbnt;
	}

	public WebElement confirmbnt() {
		return confirmbnt;
	}

	public WebElement cancelNote() {
		return cancelNote;
	}

	public WebElement okNote() {
		return okNote;
	}

	public WebElement prompbnt() {
		return prompbnt;
	}

	public WebElement prompNote() {
		return promptNote;
	}

	// Windows
	public WebElement windows() {
		return windows;
	}

	public WebElement nwTab() {
		return nwTab;
	}

	public WebElement nwNote() {
		return nwNote;
	}
	
	public WebElement nwbnt() {
		return nwbnt;
	}

	public WebElement nwsTab() {
		return nwsTab;
	}
	
	public WebElement nwsNote() {
		return nwsNote;
	}

	public WebElement nwsbnt() {
		return nwsbnt;
	}

	public WebElement mwTab() {
		return mwTab;
	}

	public WebElement mwNote() {
		return mwNote;
	}
	
	public WebElement mwbnt() {
		return mwbnt;
	}
	
	//Frames
	public WebElement frames() {
		return frames;
	}
	
	public WebElement sframebnt() {
		return sframebnt;
	}
	
	public WebElement sframe() {
		return sframe;
	}
	
	public WebElement sframeText() {
		return sframeText;
	}
	
	public WebElement iframebnt() {
		return iframebnt;
	}
	
	public WebElement iframeText() {
		return iframeText;
	}
	
}
