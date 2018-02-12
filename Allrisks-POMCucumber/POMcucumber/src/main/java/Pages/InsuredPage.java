package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;

public class InsuredPage extends TestBase {
	
	@FindBy(id="insuredTile:InsuredForm:Object__Customer__CustomerName")
	public WebElement insuredname;
	@FindBy(id= "insuredTile:InsuredForm:Object__Customer__BusinessAddress")
	public WebElement insured_address;
	@FindBy(xpath= "id('insuredTile:InsuredForm:Object__Customer__Phone')")
	public WebElement phonenumber;
	@FindBy(xpath = "id('insuredTile:InsuredForm:Object__Customer__LLC')/div[contains(.,'Yes')]/span")
	public WebElement llc_qn_yes;
	/*@FindBy(how = How.XPATH, using = "id('insuredTile:InsuredForm:Object__Customer__LLC')/div[contains(.,'No')]/span")
	@CacheLookup
	public WebElement llc_qn_no;
	@FindBy(how = How.XPATH, using = "id('insuredTile:InsuredForm:Object__Customer__Principles')/div[contains(.,'Yes')]/span")
	@CacheLookup
	public WebElement principles_qn_yes;
	@FindBy(how = How.XPATH, using = "id('insuredTile:InsuredForm:Object__Customer__Principles')/div[contains(.,'No')]/span")
	@CacheLookup
	public WebElement principles_qn_no;
	@FindBy(how = How.XPATH, using = "id('insuredTile:InsuredForm:Object__Customer__PrinciplesDescriptionn')")
	@CacheLookup
	public WebElement principles_desc;*/
	@FindBy(xpath = "//*[contains(text(),'Continue To Location')]")
	public WebElement location_cont;
	@FindBy(xpath = "id('msgspan')")
    public WebElement processing_load;
	
	public InsuredPage() 
		{
			PageFactory.initElements(driver, this);
		}
	
	public LocationPage Insured(String insured_name, String insured_mailing_address, String phone_number) throws InterruptedException
	{
	    WebDriverWait insured_namewait = new WebDriverWait(driver,10);
		insured_namewait.until(ExpectedConditions.visibilityOf(insuredname));
		insuredname.sendKeys(insured_name);
		insured_address.sendKeys(insured_mailing_address);
		Thread.sleep(5000);
		insured_address.sendKeys(Keys.ARROW_DOWN);
		insured_address.sendKeys(Keys.ENTER);
		insured_namewait.until(ExpectedConditions.visibilityOf(processing_load));
		Thread.sleep(5000);
		phonenumber.sendKeys(phone_number);
		location_cont.click();
		return new LocationPage();
	}
	/*public LocationPage Insured(String insured_mailing_address, String phone_number)
	{
		WebDriverWait insured_mailwait = new WebDriverWait(driver,10);
		insured_mailwait.until(ExpectedConditions.visibilityOf(insured_address));

		//WebDriverWait insured_mailwait = new WebDriverWait(driver,10);
		insuredname.sendKeys(insured_mailing_address);
		phonenumber.sendKeys(phone_number);
		//insured_address.sendKeys(insured_mailing_address);
		//phonenumber.Sendkeys(phone_number);
		return new LocationPage();
	}*/
	 	
	
	
	  	}
