package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generiutilities.DataType;
import generiutilities.WebDriverUtility;
import generiutilities.JavaUtility;

public class createToDopage {

	
	@FindBy(xpath="//b[text()='Create To Do']")
	private WebElement pageHeader;
	
	@FindBy(name="subject")
	private WebElement SubjectTF;

	@FindBy(id="jscal_trigger_date_start")
	private WebElement starDateWidget; 
	
	@FindBy(xpath = "//div[@class='calendar' and contains(@style, 'block')]/descendant::td[@class='title']")
	private WebElement calendarTitle;
	
	private String commonPath = "//div[@class='calendar' and contains(@style, 'block')]/descendant::td[text()='%s']";
	
	
	@FindBy(id="jscal_trigger_due_date")
	private WebElement dueDateWidget; 
	
	@FindBy(xpath="//input[@value='  Save']")
	private WebElement saveBTN;
	
	public createToDopage(WebDriver diver)
	{
		PageFactory.initElements( diver,this);
	}
	 
	public String getpageHeader() {
		return pageHeader.getText();
		
	}
	
	public void setSubject(String subject) {
		SubjectTF.sendKeys(subject);
	}
	
	public void clickstartDatewidget() {
		starDateWidget.click();
	}
	
	public void clickduedateWidget() {
		dueDateWidget.click();
	}
	public void clicksave() {
		saveBTN.click();
	}
	
	public void datepiccker(String requiredStarDate, JavaUtility jutil,WebDriverUtility web)
	{
		String [] s=requiredStarDate.split("-");
		int reqyear=(Integer)jutil.convertStringToAnyDataType(DataType.INT,s[0]);
		
		String currentMonthYear = calendarTitle.getText();
		String [] str=currentMonthYear.split(", ");
		int currentYear = (Integer)jutil.convertStringToAnyDataType(DataType.INT,str[1]);
		
		while(currentYear < reqyear) {
			web.convertDynamicXpathToWebElement(commonPath,"»").click();
			currentMonthYear = calendarTitle.getText();
			str = currentMonthYear.split(", ");
			currentYear = (Integer)jutil.convertStringToAnyDataType(DataType.INT, str[1]);
		}
		
		int reqMonth = jutil.convertMonthToNum( s[1]);
		int currentMonth = jutil.convertMonthToNum(str[0]);
		
		while(currentMonth < reqMonth) {
			web.convertDynamicXpathToWebElement(commonPath, "›").click();;
			currentMonthYear = calendarTitle.getText();
			str = currentMonthYear.split(", ");
			currentMonth = jutil.convertMonthToNum(str[0]);
		}
		web.convertDynamicXpathToWebElement(commonPath, s[2]).click();
	}	
}
