package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoRegister {
	 
	   WebDriver driver;

	   public DemoRegister(WebDriver driver) {
	      this.driver = driver;
	      PageFactory.initElements(driver,this);
	   }
	   //Title
	   @FindBy(xpath = "//h1[contains(.,'Automation Demo Site')]")
	   WebElement title;
	   
	   //Links
	   @FindBy(linkText  = "Home")
	   WebElement home;
	   @FindBy(linkText  = "Register")
	   WebElement register;
	   @FindBy(linkText  = "WebTable")
	   WebElement webtable;
	   @FindBy(linkText = "Practice Site")
	   WebElement practiceSite;
	   
	   //Copyright
	   @FindBy(xpath = "//div[@class='col-md-6 col-xs-6 col-sm-6']")
	   WebElement copyright;
	   
	   //Icons
	   @FindBy(xpath = "//span[@class='fa fa-facebook-square']")
	   WebElement facebook; 
	   @FindBy(xpath = "//span[@class='fa fa-twitter-square']")
	   WebElement twitter;   
	   @FindBy(xpath = "//span[@class='fa fa-linkedin-square']")
	   WebElement linkedin;
	   @FindBy(xpath = "//span[@class='fa fa-google-plus-square']")
	   WebElement google;
	   @FindBy(xpath = "//span[@class='fa fa-youtube-square']")
	   WebElement youtube;
	   
	   //Register label
	   @FindBy(xpath = "//h2[contains(.,'Register')]")
	   WebElement registerL;
	   @FindBy(xpath = "//label[contains(.,'Full Name*')]")
	   WebElement fullnameL;
	   @FindBy(xpath = "//label[contains(.,'Address')]")
	   WebElement addressL;
	   @FindBy(xpath = "//label[contains(.,'Email address*')]")
	   WebElement emailL;
	   @FindBy(xpath = "//label[contains(.,'Phone*')]")
	   WebElement phoneL;
	   @FindBy(xpath = "//label[contains(.,'Gender*')]")
	   WebElement genderL;
	   @FindBy(xpath = "(//label[contains(.,'Male')])[1]")
	   WebElement maleL;
	   @FindBy(xpath = "//label[contains(.,'FeMale')]")
	   WebElement femaleL;
	   @FindBy(xpath = "//label[contains(.,'Hobbies')]")
	   WebElement hobbiesL;
	   @FindBy(xpath = "//label[contains(.,'Cricket')]")
	   WebElement cricketL;
	   @FindBy(xpath = "//label[contains(.,'Movies')]")
	   WebElement moviesL;
	   @FindBy(xpath = "//label[contains(.,'Hockey')]")
	   WebElement hockeyL;
	   @FindBy(xpath = "//label[contains(.,'Languages')]")
	   WebElement languagesL;
	   @FindBy(xpath = "//label[contains(.,'Skills')]")
	   WebElement skillsL;
	   @FindBy(xpath = "//label[contains(.,'Country*')]")
	   WebElement countryL;
	   @FindBy(xpath = "//label[contains(.,'Select Country :')]")
	   WebElement selectCountryL;
	   @FindBy(xpath = "//label[contains(.,'Date Of Birth')]")
	   WebElement dobL;
	   @FindBy(xpath = "(//label[contains(.,'Password')])[1]")
	   WebElement passwordL;
	   @FindBy(xpath = "//label[contains(.,'Confirm Password')]")
	   WebElement confirmpwL;
	   //Photo
	   @FindBy(xpath = "//label[contains(.,'Photo')]")
	   WebElement photoL;
	   //Photo image
	   @FindBy(xpath = "//img[contains(@id,'imagetrgt')]")
	   WebElement photoImage;
	   
	   //Register form
	   @FindBy(xpath = "(//input[@type='text'])[1]")
	   WebElement firstname;
	   @FindBy(xpath = "(//input[@type='text'])[2]")
	   WebElement lastname;
	   @FindBy(xpath = "//textarea[contains(@ng-model,'Adress')]")
	   WebElement address;
	   @FindBy(xpath = "//input[contains(@type,'email')]")
	   WebElement email;
	   @FindBy(xpath = "//input[contains(@ng-model,'Phone')]")
	   WebElement phone;
	   @FindBy(xpath = "//input[@value='Male']")
	   WebElement male;
	   @FindBy(xpath = "//input[@value='FeMale']")
	   WebElement female;
	   @FindBy(xpath = "//input[@value='Cricket']")
	   WebElement cricket;
	   @FindBy(xpath = "//input[@value='Movies']")
	   WebElement movies;
	   @FindBy(xpath = "//input[@value='Hockey']")
	   WebElement hockey;
	   @FindBy(xpath = "//div[contains(@id,'msdd')]")
	   WebElement languages;
	   @FindBy(xpath = "//select[@id='Skills']")
	   WebElement skills;
	   @FindBy(xpath = "//select[@id='countries']")
	   WebElement countries;
	   @FindBy(xpath = "//span[@aria-labelledby='select2-country-container']")
	   WebElement selectCountry;
	   @FindBy(xpath = "//select[@id='yearbox']")
	   WebElement yearbox;
	   @FindBy(xpath = "//select[contains(@ng-model,'monthbox')]")
	   WebElement monthbox;
	   @FindBy(xpath = "//select[contains(@ng-model,'daybox')]")
	   WebElement daybox;
	   @FindBy(xpath = "//input[@id='firstpassword']")
	   WebElement firstpassword;
	   @FindBy(xpath = "//input[@id='secondpassword']")
	   WebElement secondpassword;
	   @FindBy(xpath = "//button[@id='submitbtn']")
	   WebElement submitbtn;
	   @FindBy(xpath = "//button[contains(@value,'Refresh')]")
	   WebElement refreshbtn;
	   //Image loading
	   @FindBy(xpath = "//input[contains(@type,'file')]")
	   WebElement chooseFile;
	  
	   public WebElement title() {
			return title;
		}
	   
	   public WebElement home() {
		    return home;
	   }
	   
	   public WebElement register() {
		    return register;
	   }
	   
	   public WebElement practiceSite() {
		    return practiceSite;
	   }
	   
	   public WebElement copyright() {
		    return copyright;
	   }
	   
	   public WebElement facebook() {
		    return facebook;
	   }
	   
	   public WebElement twitter() {
		    return twitter;
	   }
	   
	   public WebElement linkedin() {
		    return linkedin;
	   }
	   
	   public WebElement google() {
		    return google;
	   }
	   
	   public WebElement youtube() {
		    return youtube;
	   }
	   
	   //Register label
	   public WebElement registerL() {
		    return registerL;
	   }
	   public WebElement fullnameL() {
		    return fullnameL;
	   }
	   public WebElement addressL() {
		    return addressL;
	   }
	   public WebElement emailL() {
		    return emailL;
	   }
	   public WebElement phoneL() {
		    return phoneL;
	   }
	   public WebElement genderL() {
		    return genderL;
	   }
	   public WebElement maleL() {
		    return maleL;
	   }
	   public WebElement femaleL() {
		    return femaleL;
	   }
	   public WebElement hobbiesL() {
		    return hobbiesL;
	   }
	   public WebElement cricketL() {
		    return cricketL;
	   }
	   public WebElement moviesL() {
		    return moviesL;
	   }
	   public WebElement hockeyL() {
		    return hockeyL;
	   }
	   public WebElement languagesL() {
		    return languagesL;
	   }
	   public WebElement skillsL() {
		    return skillsL;
	   }
	   public WebElement countryL() {
		    return countryL;
	   }
	   public WebElement selectCountryL() {
		    return selectCountryL;
	   }
	   public WebElement dobL() {
		    return dobL;
	   }
	   public WebElement passwordL() {
		    return passwordL;
	   }
	   public WebElement confirmpwL() {
		    return confirmpwL;
	   }
	   public WebElement photoL() {
		    return photoL;
	   }
	   public WebElement photoImage() {
		    return photoImage;
	   }
	   
	   //Register form
	   public WebElement firstname() {
		    return firstname;
	   }
	   public WebElement lastname() {
		    return lastname;
	   }
	   public WebElement address() {
		    return address;
	   }
	   public WebElement email() {
		    return email;
	   }
	   public WebElement phone() {
		    return phone;
	   }
	   public WebElement male() {
		    return male;
	   }
	   public WebElement female() {
		    return female;
	   }
	   public WebElement cricket() {
		    return cricket;
	   }
	   public WebElement movies() {
		    return movies;
	   }
	   public WebElement hockey() {
		    return hockey;
	   }
	   public WebElement languages() {
		    return languages;
	   }
	   public WebElement skills() {
		    return skills;
	   }
	   public WebElement countries() {
		    return countries;
	   }
	   public WebElement selectCountry() {
		    return selectCountry;
	   }
	   public WebElement yearbox() {
		    return yearbox;
	   }
	   public WebElement monthbox() {
		    return monthbox;
	   }
	   public WebElement daybox() {
		    return daybox;
	   }
	   public WebElement firstpassword() {
		    return firstpassword;
	   }
	   public WebElement secondpassword() {
		    return secondpassword;
	   }
	   public WebElement submitbtn() {
		    return submitbtn;
	   }
	   public WebElement refreshbtn() {
		    return refreshbtn;
	   }
	   public WebElement chooseFile() {
		    return chooseFile;
	   }
	   
}

