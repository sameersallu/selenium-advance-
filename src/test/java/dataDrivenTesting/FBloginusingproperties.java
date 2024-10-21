package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBloginusingproperties {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("./src/test/resources/data.properties");
		Properties property = new Properties();
		property.load(file);

		WebDriver driver = new  ChromeDriver();
		driver.get(property.getProperty("url"));
		
		long time=Long.parseLong(property.getProperty("timeout"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		driver.findElement(By.id("email")).sendKeys(property.getProperty("username"));
		driver.findElement(By.id("pass")).sendKeys(property.getProperty("password"));
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
