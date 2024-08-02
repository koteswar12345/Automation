package practiceTestNG;


import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetTest {
	@Test
	public void Get() {
	
	
		Response res = RestAssured.get("https://reqres.in/api/users/2");
		
		Reporter.log(res.prettyPrint(), true);
		
	}

}
