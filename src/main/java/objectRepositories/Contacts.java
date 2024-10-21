package objectRepositories;

	import java.util.List;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Contacts {

		@FindBy (xpath="//img[@alt='Create Contact...']")
		private WebElement createcontbtn;
		
		
		@FindBy (xpath="//table[@class='lvt small']/tbody/tr/td[4]/a[@title='Contacts']")
		protected List<WebElement> contacts;
		
		public Contacts(WebDriver driver)
		{
			PageFactory.initElements( driver,this);
		}
		public void clickcreatecontbtn() {
			createcontbtn.click();
		}
		public boolean searchcontact(String lastName) {
			boolean isPresent=false;
			for (WebElement contact : contacts) {
				if(contact.getText().equals(lastName)) {
					isPresent=true;
					break;
				}
				
			}return isPresent;
		}
		
	}



