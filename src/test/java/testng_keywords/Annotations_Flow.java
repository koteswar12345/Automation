package testng_keywords;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations_Flow {
@Test

public void TC()
{
	Reporter.log("===Actual TC===",true);
}

@BeforeClass
public void bc()
{
	Reporter.log("===Before class===",true);
}
@BeforeSuite
public void bs()
{
	Reporter.log("===Before Suite===",true);
}
@BeforeMethod
public void bm()
{
	Reporter.log("===Before Method===",true);
}
@AfterClass
public void ac()
{
	Reporter.log("===After class===",true);
}
@AfterSuite
public void as()
{
	Reporter.log("===After Suite===",true);
}
@AfterMethod
public void am()
{
	Reporter.log("===After Method===",true);
}

}
