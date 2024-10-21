package objectRepositories;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class organizationspage {

	@FindBy (xpath="//img[@alt='Create Organization...']")
	private WebElement createorgbtn;
	@FindBy(xpath="//a[@title='Organizations']")
	private List<WebElement>organizations;
	
	
	public organizationspage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	public void clickcreateorg() {
		createorgbtn.click();
	}
	public boolean searchOrganization(String orgName) {
		boolean isPresent=false;
		for (WebElement org : organizations) {
			if(org.getText().equals(orgName)) {
				isPresent=true;
				break;
			}
			
		}return isPresent;
	}
}

