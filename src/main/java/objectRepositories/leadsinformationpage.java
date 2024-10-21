package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class leadsinformationpage {
	@FindBy (xpath="//span[@class='dvHeaderText']")
	private WebElement pageHeader;
	
	@FindBy (name="Duplicate")
	private WebElement duplicatebutton;

	@FindBy(name="Delete")
	private WebElement deletebtn;

	public leadsinformationpage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	public String getpageHeader()
	{
		return pageHeader.getText();
	}
	
	public void clickduplicate()
	{
		duplicatebutton.click();
	}
	public void clickdelete()
	{
		deletebtn.click();
	}
}
