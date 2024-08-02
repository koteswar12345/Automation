package testng_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
	@Test(invocationCount = 10)
	void tc()
	{
		Reporter.log("hi",true);
	}

}
