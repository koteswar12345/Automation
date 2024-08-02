package practiceTestNG;

import org.json.simple.JSONObject;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PatchTest {
	@Test
	public void Patch() {
   
		
	
		JSONObject j=new JSONObject();
		j.put("name","Arnav");
		j.put("job","Adviser");
		RequestSpecification req = RestAssured.given();
		req.body(j);
		req.contentType((ContentType.JSON));
		Response res = req.patch("https://reqres.in/api/users/2");
		
		Reporter.log(res.prettyPrint(), true);
		
		
	}

}
