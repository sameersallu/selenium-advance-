package objectRepositories;

import org.openqa.selenium.WebDriver;


public class PageObjectManager {
WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public Loginpagetiger getLogin() {
		return new Loginpagetiger(driver);
	}
	public Homepage getHome() {
		return new Homepage(driver);
	}
	public organizationspage getOrg() {
		return new organizationspage(driver);
	}
	public CreatingNewOrganizationpage getCreateOrg() {
		return new CreatingNewOrganizationpage(driver);
	}
	public organizationinformation getOrgInfo() {
		return new organizationinformation(driver);
	}
	public Contacts getContact() {
		return new Contacts(driver);
	}
	public createnewcontactspage getCreateContact() {
		return new createnewcontactspage(driver);
	}
	public contactsinformationpage getContactInfo() {
		return new contactsinformationpage(driver);
	}
	public Leads getLeads() {
		return new Leads(driver);
	}
	public CreatenewLeadsPage getCreateLead() {
		return new CreatenewLeadsPage(driver);
	}
	public DuplicatingLeadsPage getDuplicateLead() {
		return new DuplicatingLeadsPage(driver);
	}
	public leadsinformationpage getLeadInfo() {
		return new leadsinformationpage(driver);
	}
	public createToDopage getCreateToDo() {
		return new createToDopage(driver);
	}
	public EventInformationPage getEventInfo() {
		return new EventInformationPage(driver);
	}
}
