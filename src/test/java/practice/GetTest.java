package practice;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetTest {
	public static void main(String[] args) {
	
		Response res = RestAssured.get("https://reqres.in/api/users/2");
		System.out.println(res.prettyPrint());
		System.out.println(res.getStatusCode());
	}

}
