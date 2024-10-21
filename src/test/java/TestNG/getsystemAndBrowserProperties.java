package TestNG;

import org.testng.annotations.Test;

public class getsystemAndBrowserProperties {
@Test
public void demo() {
	System.getProperties().list(System.out);
}
}
