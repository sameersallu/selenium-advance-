package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generiutilities.WebDriverUtility;

public class DuplicatingLeadsPage {
	@FindBy(xpath="//span[@class='lvtHeaderText']")
	private WebElement pageheader;
	
	
	@FindBy(name="lastname")
	private WebElement lastnameTF;
	
	
	@FindBy(name="company")
	private WebElement companyTF;
	
	@FindBy(xpath="//input[contains(@value,'  Save  ')]")
	private WebElement saveBTN;
	
	
	public DuplicatingLeadsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getpageheader()
	{
		 return pageheader.getText();
	}
	
	public void setlastName(String str)
	{
		lastnameTF.clear();
	lastnameTF.sendKeys(str);
	}
	
	public void setcompanyname(String company)
	{
		companyTF.clear();
		companyTF.sendKeys(company);
	}
	
	public void clickonsave() {
		saveBTN.click();
	}
}
