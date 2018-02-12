package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;

public class AgencyPage extends TestBase {

		//protected WebDriver driver;
		@FindBy(xpath="id('AgencyForm:AgencyTile:Object__Agency__BusinessName_input')")
		@CacheLookup
		public WebElement agency_lookup;
		@FindBy(xpath="//*[contains(text(),'Continue To Insured')]")
		@CacheLookup
		public WebElement insured_cont;
		@FindBy(xpath = "id('msgspan')")
	    @CacheLookup
	    public WebElement processing_load;
		
		public AgencyPage()
		{
	    	PageFactory.initElements(driver, this);
		}
		/*private void click_lookup()
		{
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.elementToBeClickable(agency_lookup));
		}
		private void agency_code(String code) throws InterruptedException
		{
			agency_lookup.sendKeys(code);
			Thread.sleep(5000);
		}
		private void pick_agency() throws InterruptedException
		{
			agency_lookup.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
		}
		private void cont_insured() throws InterruptedException
		{
			insured_cont.click();
			Thread.sleep(5000);
		}
		
		public void agency_tile() throws InterruptedException
		{
			click_lookup();
			agency_code("450076");
			pick_agency();
			cont_insured();
		}*/
		public InsuredPage Agency(String agency_code) throws InterruptedException
		{
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.elementToBeClickable(agency_lookup));
			agency_lookup.sendKeys(agency_code);
			Thread.sleep(5000);
			agency_lookup.sendKeys(Keys.ENTER);
			insured_cont.click();
			Thread.sleep(8000);
			return new InsuredPage();
			
		}
	

}
