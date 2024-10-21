package vtigerTests;

import java.util.Map;

import org.testng.annotations.Test;

import generiutilities.BaseClass;
import objectRepositories.EventInformationPage;
import objectRepositories.createToDopage;

public class CreateEventTest  extends BaseClass{

	
	@Test
	
	public void createEventTest()
	{
		createToDopage createToDo = pom.getCreateToDo();
		EventInformationPage eventInfo = pom.getEventInfo();
		
		Map<String, String> map = excel.readFromExcel("Create New Event");
		home.selectFromQuickCreate(web, map.get("Quick Create"));
		createToDo.setSubject(map.get("Subject"));
		createToDo.clickstartDatewidget();
		createToDo.datepiccker(map.get("Start Date"), jutil, web);
		createToDo.clickduedateWidget();
		createToDo.datepiccker(map.get("Due Date"), jutil, web);
		createToDo.clicksave();
		
		eventInfo.clickDelete();
		web.handleAlert("ok");
	}

}
