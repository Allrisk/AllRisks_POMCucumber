package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;

public class LoginPage extends TestBase {
	
	@CacheLookup
	@FindBy(id="loginForm:login_username")
	protected WebElement txtusername;
	
	@FindBy(id="loginForm:login_password")
	protected WebElement txtpassword;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	protected WebElement btnlogin;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getbrowsertitle()
	{
		String burl=driver.getCurrentUrl();
		return burl;
		
	}
	
	public HomePage Login(String uname,String pwd) throws InterruptedException
	{
		WebDriverWait txtusernamewait = new WebDriverWait(driver,10);
		txtusernamewait.until(ExpectedConditions.visibilityOf(txtusername));
		txtusername.sendKeys(uname);
		txtpassword.sendKeys(pwd);
		btnlogin.click();
		return new HomePage();
	}
	
}
