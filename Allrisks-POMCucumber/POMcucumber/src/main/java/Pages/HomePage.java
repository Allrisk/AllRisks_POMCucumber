package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//table//button/span[contains(text(),'Homeowners / Dwelling / Condo Quote')]")
	protected WebElement btnPLQuote;
	
	//Can be defined for other other available buttons, get title label etc
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public AgencyPage Home() throws InterruptedException
	{
		WebDriverWait txtusernamewait = new WebDriverWait(driver,10);
		txtusernamewait.until(ExpectedConditions.visibilityOf(btnPLQuote));
		btnPLQuote.click();
		return new AgencyPage();
	}
}
