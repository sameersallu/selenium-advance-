package objectRepositories;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Leads {
		

		@FindBy (xpath="//img[@alt='Create Lead...']")
		private WebElement createleads;
		
		public Leads(WebDriver driver)
		{
			PageFactory.initElements( driver,this);
		}
		public void clickcreateleads() {
			createleads.click();
		}
	}



