package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver= new ChromeDriver();
	driver.get("https://demoapp.skillrary.com/login.php?type=login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	loginpage login = new loginpage(driver);
	login.setEmail("admin");
	login.setpassword("admin");
	login.clickKeepMeLoggedIn();
	login.clickloginBTN();
	Thread.sleep(3000);
	driver.quit();
	}
	}
