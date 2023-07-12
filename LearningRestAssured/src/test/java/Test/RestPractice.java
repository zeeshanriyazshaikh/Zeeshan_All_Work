package Test;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.path.json.config.JsonPathConfig;

public class RestPractice {

	@Test
	public void verifyGet() {
		
		Map<String,String> req = new HashMap<String,String>();
		
		req.put("name", "zeeshan");

		
		RestAssured.given()
		.when().delete("https://reqres.in/api/users/2").then().statusCode(204).log().all();
		
		
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
}
