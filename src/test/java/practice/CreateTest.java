package practice;

import org.json.simple.JSONObject;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateTest {
	
	public static void main(String[] args) {
		
	
		JSONObject json=new JSONObject();
		json.put("name","xyz");
		json.put("job","software engineer");
		RequestSpecification req = RestAssured.given();
		req.body(json);
		req.contentType((ContentType.JSON));
		Response res = req.post("https://reqres.in/api/users");
		System.out.println(res.prettyPrint());
		System.err.println(res.statusCode());
	}

}
