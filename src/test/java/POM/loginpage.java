package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class loginpage {

	
		//declaration
		@FindBy(name="email")
		private WebElement emailTF;
		
		@FindBy (id="password")
		private WebElement passwordTF;
		
		@FindBy (id="keepLoggedInCheckBox")
		private WebElement keepMeLoggedInCB;
		
		
		@FindBy (id= "topasswordRecoveryPageLink")
		private WebElement forgotPasswordLInk;
		
		@FindBy (name ="login")
		private WebElement loginBTN;
	 //initialzation
	public  loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
		
		//util
		public  void setEmail(String email)
		{
			emailTF.sendKeys(email);
		}
		public  void setpassword(String password)
		{
			passwordTF.sendKeys(password);
		}
	
		public  void clickKeepMeLoggedIn()
		{
			keepMeLoggedInCB.click();
		}
		public  void Forgetpassword()
		{
			forgotPasswordLInk.click();
		}
		public  void loginbt()
		{
			loginBTN.click();
		}

		public void clickloginBTN() {
			// TODO Auto-generated method stub
			loginBTN.click();
		}
}
