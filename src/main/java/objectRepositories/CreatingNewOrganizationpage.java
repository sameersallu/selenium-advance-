package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generiutilities.WebDriverUtility;

public class CreatingNewOrganizationpage {

	@FindBy(xpath="//span[@class='lvtHeaderText']")
	private WebElement pageheader;
	
	
	@FindBy(name="accountname")
	private WebElement orgnameTF;
	
	
	@FindBy(name="industry")
	private WebElement industryDD;
	
	
	@FindBy(name="accounttype")
	private WebElement typeDD;
	
	
	@FindBy(xpath="//input[contains(@value,'  Save  ')]")
	private WebElement saveBTN;
	
	public CreatingNewOrganizationpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public String getpageheader()
	{
		 return pageheader.getText();
	}
	
	public void enterorgname(String str)
	{
		orgnameTF.sendKeys(str);
	}
	public void selectindustry(WebDriverUtility web,String value) {
		web.chooseFromDropdown(value, industryDD);
	}
	
	public void selecttypedropdown(WebDriverUtility web,String value) {
		web.chooseFromDropdown(value,typeDD);
	}
	public void clickonsave() {
		saveBTN.click();
	}
}
