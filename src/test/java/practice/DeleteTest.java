package practice;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteTest {
	public static void main(String[] args) {
		
	
		
		// TODO Auto-generated method stub
		Response res = RestAssured.delete("https://reqres.in/api/users/2");

		System.out.println(res.prettyPrint());
		System.out.println(res.getStatusCode());//204
	}

}
