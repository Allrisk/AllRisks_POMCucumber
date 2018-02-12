package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;

public class LocationPage extends TestBase {
	
	@FindBy(xpath = "id('locations:LocationListTile:Object__Risk__ResProperty__IsRiskAddressSameAsInsured_input')/div[contains(.,'Yes')]/span")
    public WebElement loc_addr_yes;
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__ProtectionClass")
	public WebElement prot_class;
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__StoriesNum1")
	public WebElement no_of_stories;
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__SquareFeet")
	public WebElement square_feet;
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__DateBuilt")
	public WebElement year_built;
	@FindBy(id = "locations:LocationListTile:LossForm:NumberofLosses")
	public WebElement no_of_losses;
	@FindBy(xpath = "id('locations:LocationListTile:LocationSaveButton')")
	public WebElement location_save;
	@FindBy(xpath = "id('locations:PLMLContinueToUWButton')")
	public WebElement continue_uw;
	@FindBy(xpath = "id('msgspan')")
	public WebElement processing_load;
	@FindBy(xpath= "id('j_idt3824')")
	public WebElement processing_load1;
	
	public LocationPage()
	{
    	PageFactory.initElements(driver, this);
	}
	
	public void Location()
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		loc_addr_yes.click();
		wait.until(ExpectedConditions.visibilityOf(processing_load));
	}
	public UnderwritingPage Location1(String protection_class, String number_of_stories, String sq_feet, String year_built, String number_loss)
	{
		//element = driver.findElement(this.getObject(LocationPage));
		//element.sendKeys(Keys.PAGE_DOWN);
		Select dropdown = new Select(prot_class);
		dropdown.selectByVisibleText(protection_class);
		return new UnderwritingPage();
	}
}
