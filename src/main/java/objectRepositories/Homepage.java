package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generiutilities.TabNames;
import generiutilities.WebDriverUtility;

public class Homepage {

	private String commonpath= "//a[text()='%s' and contains(@href,'action=index')]";
	
	
	@FindBy(id="qccombo")
	private WebElement quickcreate;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminicon;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signout;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void clickon(WebDriverUtility web) {
		adminicon.click();
		signout.click();
	}
	public void clickRequiredTab(WebDriverUtility web, TabNames tabName) {
		web.convertDynamicXpathToWebElement(commonpath, tabName.getTabName()).click();
	}
	
	public void selectFromQuickCreate(WebDriverUtility web, String value) {
		web.chooseFromDropdown(quickcreate, value);
	}
	
	public void signOutOfVtiger(WebDriverUtility web) {
		web.mouseHoverToElement(adminicon);
		signout.click();
	}
	
	
	
}
