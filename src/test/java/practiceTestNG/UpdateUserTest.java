package practiceTestNG;

import org.json.simple.JSONObject;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateUserTest {
	@Test
	public void update() {
	
		
		JSONObject j=new JSONObject();
		j.put("name","Arnav");
		j.put("job","CEO");
		RequestSpecification req = RestAssured.given();
		req.body(j);
		req.contentType((ContentType.JSON));
		Response res = req.put("https://reqres.in/api/users/2");
		
		Reporter.log(res.prettyPrint(), true);
		
	}

}
