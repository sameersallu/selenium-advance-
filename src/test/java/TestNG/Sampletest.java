package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sampletest {
	@Test
	public void demo() {
		Reporter.log("Hello Wrold",true);
	}
}
