package practice;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PatchTest {
    public static void main(String[] args) {
		
	
		JSONObject j=new JSONObject();
		j.put("name","Arnav");
		j.put("job","Adviser");
		RequestSpecification req = RestAssured.given();
		req.body(j);
		req.contentType((ContentType.JSON));
		Response res = req.patch("https://reqres.in/api/users/2");
		System.out.println(res.prettyPrint());
		System.err.println(res.statusCode());
		
	}

}
