package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import junit.framework.Assert;

public class LoginTest {
	WebDriver driver;
	
	@BeforeClass
	void setUp()
	{
		driver=new EdgeDriver();
		driver.get("https://saucedemo.com");
		driver.manage().window().maximize();
	}
	
	@Test
	void testLogin()
	{
		LoginPage2 lp=new LoginPage2(driver);
		lp.setUserName("standard_user");
		lp.setPassword("secret_sauce");
		lp.clickLogin();
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
	

}
