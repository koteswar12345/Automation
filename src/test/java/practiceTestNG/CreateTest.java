package practiceTestNG;

import org.json.simple.JSONObject;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateTest {
	@Test
	public void post() {
	

		
	
		JSONObject j=new JSONObject();
		j.put("name","xyz");
		j.put("job","software engineer");
		RequestSpecification req = RestAssured.given();
		req.body(j);
		req.contentType((ContentType.JSON));
		Response res = req.post("https://reqres.in/api/users");
		Reporter.log(res.prettyPrint(), true);
		
	}

}
