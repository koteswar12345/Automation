package testng_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.Timeout;

public class Outs {
	@Test(timeOut = 10)
	public void TC()
	{
		Reporter.log("Hi frd",true);
	}

}
