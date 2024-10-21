package vtigerTests;

import java.util.Map;

import org.testng.annotations.Test;

import generiutilities.BaseClass;
import generiutilities.TabNames;
import objectRepositories.CreatenewLeadsPage;
import objectRepositories.DuplicatingLeadsPage;
import objectRepositories.Leads;
import objectRepositories.leadsinformationpage;

public class  CreateAndDuplicateLeadTest extends BaseClass {
	@Test(retryAnalyzer = generiutilities.RetryImplementation.class)
	public void createLeadTest() {
		Leads leads = pom.getLeads();
		CreatenewLeadsPage createLead = pom.getCreateLead();
		DuplicatingLeadsPage duplicateLead = pom.getDuplicateLead();
		leadsinformationpage leadInfo = pom.getLeadInfo();
		
		home.clickRequiredTab(web, TabNames.LESDS);
		leads.clickcreateleads();
		Map<String, String> map = excel.readFromExcel("Create and Duplicate Lead");
		String lastName = map.get("Last Name") + jutil.generateRandomNum(100);
		createLead.setlastName(lastName);
		createLead.setcompanyname(map.get("Company"));
		createLead.clickonsave();
		
		leadInfo.clickduplicate();
		String newLastName = map.get("New Last Name") + jutil.generateRandomNum(100);
		duplicateLead.setlastName(newLastName);
		duplicateLead.clickonsave();
	}
}
