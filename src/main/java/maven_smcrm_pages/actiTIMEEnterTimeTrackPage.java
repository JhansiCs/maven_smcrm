package maven_smcrm_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_ActiTime_Generic.BasePage;

public class actiTIMEEnterTimeTrackPage extends BasePage
{
	//Declaration
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	//initialization
	
	public actiTIMEEnterTimeTrackPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void ClickOnLogout()
	{
		logout.click();
	}
}
