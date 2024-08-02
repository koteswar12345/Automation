package day1;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class HttpRequests {
	int id;
	@Test(priority = 1)
	
	public void listGetUsers()
	{
		given()
		
		.when()
		.get("https://reqres.in/api/users?page=2")
		
		.then()
		.statusCode(200)
		.log().all();
	}
	
	@Test(priority =2 )
	public void createUser()
	{
		JSONObject j=new JSONObject();
		j.put("name", "sudha");
		j.put("job", "tester");
		
		id=given()
		.contentType(ContentType.JSON)
		.body(j)
		
		.when()
		.post("https://reqres.in/api/users")
		.jsonPath().getInt("id");
		
		//.then()
		//.statusCode(201)
		//.log().all();
		
	}
	@Test(priority = 3, dependsOnMethods = {"createUser"} )
	
	public void updateUser()
	{
		JSONObject j=new JSONObject();
		j.put("name", "Hari");
		j.put("job", "manager");
		
		given()
		.contentType(ContentType.JSON)
		.body(j)
		
		.when()
		.put("https://reqres.in/api/users"+id)
		//.jsonPath().getInt("id");
		
		.then()
		.statusCode(200)
		.log().all();
	}
	@Test(priority = 4)
	
	public void deleteUser()
	{
		given()
		
		.when()
		.delete("https://reqres.in/api/users"+id)
		
		.then()
		.statusCode(204)
		.log().all();
		
	}
	
	
	

}
