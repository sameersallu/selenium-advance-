package generiutilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import objectRepositories.Homepage;
import objectRepositories.Loginpagetiger;
import objectRepositories.PageObjectManager;

public class BaseClass {
	//@BeforeSuite
		//@BeforeTest
		
		protected WebDriverUtility web;
		protected JavaUtility jutil;
		protected ExcelUtility excel;
		protected propertiesutility property;
		protected WebDriver driver;
		
		protected PageObjectManager pom;
		protected Loginpagetiger login;
		protected Homepage home;
		protected SoftAssert soft;
		
		public static WebDriver sdriver;//to access same driver instance in the listeners
		public static JavaUtility sjutil;//to access same jutil instance in the listeners
		public static WebDriverUtility sweb;//to access same web util instance in the listeners
		
		
		@BeforeClass
		public void classConfig() {
			web = new WebDriverUtility();
			jutil = new JavaUtility();
			property = new propertiesutility();
			
			property.propertiesInit(IConstantpath.PROPERTIES_PATH);
			
			driver=web.launchBrowser(property.getDataFromProperties("browser"));
			web.maximizeBrowser();
			
			long time = (Long)jutil.convertStringToAnyDataType(DataType.LONG, 
							property.getDataFromProperties("timeouts"));
			web.waitTillElementFound(time);
			sdriver =  driver;
			sjutil = jutil;
			sweb = web;
		}
		
		@BeforeMethod
		public void methodConfig() {
			excel = new ExcelUtility();
			soft = new SoftAssert();
			excel.excelInit(IConstantpath.EXCEL_PATH, "Sheet1");
			
			pom = new PageObjectManager(driver);
			
			web.navigateToApp(property.getDataFromProperties("url"));
			Assert.assertTrue(driver.getTitle().contains("vtiger CRM"));
			login = pom.getLogin();
			login.login(property.getDataFromProperties("username"), 
					property.getDataFromProperties("password"));
			home = pom.getHome();
			Assert.assertTrue(driver.getTitle().contains("Home"));
		}
		
		@AfterMethod
		public void methodTeardown() {
			home.signOutOfVtiger(web);
			Assert.assertTrue(driver.getTitle().contains("vtiger CRM"));
			excel.saveExcel(IConstantpath.EXCEL_PATH);
			 excel.closeExcel();
		}
		
		@AfterClass
		public void classTeardown() {
			web.quitAllWindows();
			
		}
		
		//@AfterTest
		//@AfterSuite
}
