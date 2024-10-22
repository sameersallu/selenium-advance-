package Annotations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
//BaseClass example 
public class BaseClass {
WebDriver driver;
	@BeforeSuite
	public void Suiteconfig()
	{
		System.out.println("Suite execution started");
	}
	
	@BeforeTest
	public void Testconfig()
	{
		System.out.println("Test execution started");
	}
	
	@BeforeClass
	public void classconfig()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod
	public void methodconfig()
	{
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("last")).click();
	}
	
	@AfterMethod
	public void methodunset()
	{
		driver.findElement(By.xpath("//span[text()='SkillRary Admin']")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		
	}
	
	@AfterClass
	public void classunset()
	{
		driver.quit();
	}
	
	@AfterTest
	public void testunset()
	{
		System.out.println("Suite execution ended");
	}
	
	@AfterSuite
	public void Suiteunset()
	{
		System.out.println("Suite execution ended");
	}
	
	
}
