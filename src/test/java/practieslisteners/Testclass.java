package practieslisteners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(practieslisteners.Listenerimplimentation.class)
public class Testclass  extends BaseClass{

	@Test
	
		public void testmethod()
		{
			System.out.println("@test");
			//Assert.fail();
		}
	
}
