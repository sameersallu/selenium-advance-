package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactsinformationpage {
	@FindBy (xpath="//span[@class='dvHeaderText']")
	private WebElement pageHeader;

	@FindBy(name="Delete")
	private WebElement deletebtn;

	public contactsinformationpage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	public String getpageHeader()
	{
		return pageHeader.getText();
	}
	public void clickdelete()
	{
		deletebtn.click();
	}
	public String getPageHeader() {
		// TODO Auto-generated method stub
		return pageHeader.getText();
	}
}
