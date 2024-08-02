package testng_keywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test
	public void login()
	{
		Reporter.log("runnig login",true);
		//Assert.fail();
	}
	@Test(dependsOnMethods = "login")
	public void logout()
	{
		Reporter.log("Running logout",true);
	}

}
