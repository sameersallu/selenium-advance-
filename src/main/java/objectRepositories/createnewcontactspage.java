package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generiutilities.WebDriverUtility;

public class createnewcontactspage {

	@FindBy(xpath="//span[@class='lvtHeaderText']")
	private WebElement pageheader;
	
	
	@FindBy(name="lastname")
	private WebElement lastnameTF;
	
	
	@FindBy(xpath="//img[contains(@onclick,'Accounts')]")
	private WebElement clickonplusbtn;
	
	private String orgCommonPath = "//a[text()='%s']";
	
	@FindBy(xpath="//input[contains(@value,'  Save  ')]")
	private WebElement saveBTN;
	
	
	
	public createnewcontactspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String getPageHeader() {
		return pageheader.getText();
	}

	public void setLastName(String lastName) {
		lastnameTF.sendKeys(lastName);
	}

	public void selectOrganization(WebDriverUtility web, String orgName) {
		clickonplusbtn.click();
		web.switchToWindow("Accounts");
		web.convertDynamicXpathToWebElement(orgCommonPath, orgName).click();
		web.switchToWindow("Contacts");		
	}
	
	public void clickSave() {
		saveBTN.click();
	}
}
