package vtigerTests;

import org.testng.annotations.Test;

public class MavenParaeterizationTest {

	
	
	@Test
	public void parameterizationTest() {
		String url = System.getProperty("url");
		String browser = System.getProperty("browser");
		System.out.println(url+ "\n"+ browser);
	}
}
