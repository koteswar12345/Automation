package testng_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	
	@Test(enabled = false)
	public void TC1()
	{
		Reporter.log("Hi gm",true);
	}
	@Test(priority = 1)
	public void TC2()
	{
		Reporter.log("Hi ge",true);
	}
	@Test(priority = 2)
	public void TC3()
	{
		Reporter.log("Hi GN",true);
	}

}
