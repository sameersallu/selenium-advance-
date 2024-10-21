package vtigerTests;

import java.util.Map;

import org.testng.annotations.Test;

import generiutilities.BaseClass;
import generiutilities.TabNames;
import objectRepositories.Contacts;
import objectRepositories.contactsinformationpage;
import objectRepositories.createnewcontactspage;

public class CreateContactTest extends BaseClass{
	@Test
	public void createContactWithOrgTest() {
		Contacts contact = pom.getContact();
		createnewcontactspage createContact = pom.getCreateContact();
		contactsinformationpage contactInfo = pom.getContactInfo();
		
		home.clickRequiredTab(web, TabNames.CONTACTS);
		soft.assertTrue(driver.getTitle().contains("Contacts"));
		contact.clickcreatecontbtn();
		soft.assertEquals(createContact.getPageHeader(),"Creating New Contact");
		Map<String, String> map = excel.readFromExcel("Create Contact With Organization");
		createContact.setLastName(map.get("Last Name"));
		createContact.selectOrganization(web, map.get("Organization Name"));
		createContact.clickSave();
		soft.assertTrue(contactInfo.getPageHeader().contains(map.get("Last Name")));
		contactInfo.clickdelete();
		web.handleAlert("OK");
		soft.assertFalse(contact.searchcontact(map.get("Last Name")));
		if(!(contact.searchcontact(map.get("Last Name"))))
			excel.updateStatus("Create Contact With Organization", "Pass");
		else
			excel.updateStatus("Create Contact With Organization", "Fail");
		soft.assertAll();
	}


	
	
}
