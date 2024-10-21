package objectRepositories;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpagetiger  {

	
	@FindBy(name="user_name")
	private WebElement usernameTf;
	
	
	@FindBy(name="user_password")
	private WebElement passwordTf;
	
	@FindBy(id="submitButton")
	private WebElement loginbt;
	
	public Loginpagetiger(WebDriver driver)
	{
		PageFactory.initElements(driver,this);}
	public void login(String username,String password)
	{
		usernameTf.sendKeys(username);
		
		passwordTf.sendKeys(password);
		
		loginbt.click();
		
	}
	
	
}
