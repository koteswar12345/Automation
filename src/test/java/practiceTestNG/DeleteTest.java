package practiceTestNG;


import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteTest {
	@Test
	public void Delete() {
	
		
	
		
		// TODO Auto-generated method stub
		Response res = RestAssured.delete("https://reqres.in/api/users/2");

		
		Reporter.log(res.prettyPrint(), true);
		
		
	}

}
