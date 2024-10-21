package practieslisteners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	@BeforeSuite
	public void Suitesetup()
	{
		System.out.println("@beforesuite");
	}
	
	@BeforeTest
	public void testsetup()
	{
		System.out.println("@beforeTest");
	}
	
	@BeforeClass
	public void classsetup()
	{
		System.out.println("@beforeclass");
	}
	
	@BeforeMethod
	public void methodsetup()
	{
		System.out.println("@beforemethod");
	}
	
	
	@AfterMethod
	public void methodteardown()
	{
		System.out.println("@aftermethod");
	}
	
	
	@AfterClass
	public void classtearrdown()
	{
		System.out.println("@Afterclass");
	}
	
	@AfterTest
	public void testteardown()
	{
		System.out.println("@aftertest");
	}
	
	
	@AfterSuite
	public void Suiteteardown()
	{
		System.out.println("@aftersuite");
	}
}
