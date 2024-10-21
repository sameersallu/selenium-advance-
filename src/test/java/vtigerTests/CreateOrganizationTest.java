package vtigerTests;

import java.util.Map;

import org.testng.annotations.Test;

import generiutilities.BaseClass;
import generiutilities.TabNames;
import objectRepositories.CreatingNewOrganizationpage;
import objectRepositories.organizationinformation;
import objectRepositories.organizationspage;

public class CreateOrganizationTest extends BaseClass {

	@Test
	public void createOrgTest() {
		organizationspage org = pom.getOrg();
		organizationinformation orgInfo = pom.getOrgInfo();
		CreatingNewOrganizationpage createOrg = pom.getCreateOrg();

		home.clickRequiredTab(web, TabNames.ORGANIZATIONS);
		soft.assertTrue(driver.getTitle().contains("Organizations"));
		org.clickcreateorg();
		soft.assertEquals(createOrg.getpageheader(), "Creating New Organization");
		Map<String, String> map = excel.readFromExcel("Create Organization With Industry And Type");
		createOrg.enterorgname(map.get("Organization Name"));
		createOrg.selectindustry(web, map.get("Industry"));
		createOrg.selecttypedropdown(web, map.get("Type"));
		createOrg.clickonsave();
		soft.assertTrue(orgInfo.getpageHeader().contains(map.get("Organization Name")));
		orgInfo.clickdelete();
		web.handleAlert("ok");

		soft.assertFalse(org.searchOrganization(map.get("Organization Name")));
		if (!(org.searchOrganization(map.get("Organization Name"))))
			excel.updateStatus("Create Organization With Industry And Type", "Pass");
		else
			excel.updateStatus("Create Organization With Industry And Type", "Fail");
		soft.assertAll();
	}
}
