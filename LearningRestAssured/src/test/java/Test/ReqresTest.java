package Test;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class ReqresTest {
	/*
@BeforeClass
public void setUp() {
	//RestAssured class in rest assured that have methods to perform curd operations
			//RestAssured is class that also follows BDD format.
			
//			RestAssured.baseURI = "https://reqres.in/";
//			
//			RestAssured.port = 3030;
}
*/
	
	
	@Test
	public void verifyGetProduct() {
		
		//BDD
		RestAssured.given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200).log().all();
		
		//given is precondition ,above we dont have any thing
		//when is what we have to perform operation,like above we have to send get request
		//then is what we expect in output,like assertion or validation
		
	}
	
	@Test
	public void verifyGetProductWithSpecificId() {
		
		//Using Path parameter ,log all to show logs on console
		
		RestAssured.given().when().param("id", 7).get("https://reqres.in/api/users?page=2").then().log().all().statusCode(200);
		
		}
	
	@Test
	public void verifyGetProductWithLimit() {
		
		//Using Query Parameters
		
		RestAssured.given().when().queryParam("?page", 2).get("https://reqres.in/api/users").then().statusCode(200).log().all();
		
		
	}
	
	@Test(priority=1)
	public void verifyPostProduct() {
		
	//	String requestPayLoad =""; //EDIT IN JSON PATH ONLINE EVALUATOR - JSONPATH.COM THEN COPY AND PASTE HERE
		
		String requestPayLoad ="{\r\n"
				+ "    \"firstName\": \"John\",\r\n"
				+ "    \"lastName\": \"doe\",\r\n"
				+ "    \"age\": 26,\r\n"
				+ "    \"address\": {\r\n"
				+ "        \"streetAddress\": \"naist street\",\r\n"
				+ "        \"city\": \"Nara\",\r\n"
				+ "        \"postalCode\": \"630-0192\"\r\n"
				+ "    },\r\n"
				+ "    \"phoneNumbers\": [\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"iPhone\",\r\n"
				+ "            \"number\": \"0123-4567-8888\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"home\",\r\n"
				+ "            \"number\": \"0123-4567-8910\"\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}";
		
		//content type is header and json is a request // till body is part of given
		
		RestAssured.given().contentType(ContentType.JSON).body(requestPayLoad)
		
		.when().post("https://reqres.in/api/users")
		
		.then().statusCode(201).log().all();
		
		
	}
	
	@Test
	public void verifyPostProductWithPayLoadAsObject() {
		
		Map<String, Object> requestPayLoads = new HashMap<>();
		
		requestPayLoads.put("name", "iphone 12");
		requestPayLoads.put("type", "iphone Mobile");
		requestPayLoads.put("upc", "iphone 12");
		requestPayLoads.put("price", 500);
		requestPayLoads.put("shipping", 10);
		requestPayLoads.put("description", "iphone 12");
		requestPayLoads.put("model",  "iphone 12");
		requestPayLoads.put("manufacturer", "Aapple");
		
		RestAssured.given().contentType(ContentType.JSON)
		
		.body(requestPayLoads)
		
		.when().post("https://reqres.in/api/users")
		
		.then().statusCode(201).log().all();
		
		
	}
	
	@Test
	public void verifyUpdateProductWithPayLoadAsObject() {
		
Map<String, Object> requestPayL = new HashMap<>();
		
requestPayL.put("name", "iphone 12");
requestPayL.put("type", "iphone Mobile");
requestPayL.put("upc", "iphone 12");
requestPayL.put("price", 500);
requestPayL.put("shipping", 10);
requestPayL.put("description", "iphone 12");
requestPayL.put("model",  "iphone 12");
requestPayL.put("manufacturer", "Aapple");
		
		int productId = RestAssured.given().contentType(ContentType.JSON).body(requestPayL)
				.when().post("https://reqres.in/api/users")
				.then().extract().path("id");
		
		requestPayL.put("name", "iphone 12");
		requestPayL.put("type", "iphone Mobile");
		requestPayL.put("upc", "iphone 12");
		requestPayL.put("price", 500);
		requestPayL.put("shipping", 10);
		requestPayL.put("description", "iphone 12");
		requestPayL.put("model",  "iphone 12");
		requestPayL.put("manufacturer", "Aapple");	
		
		RestAssured.given().contentType(ContentType.JSON).body(requestPayL)
				.when().put("https://reqres.in/api/users" + productId)
				.then().statusCode(200).log().all();
	}
	/*
	 *                     //*****REQRES PUT REQUEST*****\\
	 * @Test
	public void verifyPut() {
		
		Map<String, Object> request = new HashMap<String, Object>();
		
		request.put("name",        "zeeshan");
		request.put("job",        "leader");
			
		RestAssured.given().contentType(ContentType.JSON).body(request)
		.when().put("https://reqres.in/api/users/2")
		.then().statusCode(200).log().all();
		
		}
		*/
	 
	
	@Test
	public void verifyDeleteProductWithPayLoadAsObject() {
		
		Map<String, Object> requestPayL = new HashMap<>();
		
		requestPayL.put("name", "iphone 12");
		requestPayL.put("type", "iphone Mobile");
		requestPayL.put("upc", "iphone 12");
		requestPayL.put("price", 500);
		requestPayL.put("shipping", 10);
		requestPayL.put("description", "iphone 12");
		requestPayL.put("model",  "iphone 12");
		requestPayL.put("manufacturer", "Aapple");
				
				int productId = RestAssured.given().contentType(ContentType.JSON).body(requestPayL)
						.when().post("https://reqres.in/api/users")
						.then().extract().path("id");
				
				RestAssured.given().contentType(ContentType.JSON).body(requestPayL)
				.when().delete("https://reqres.in/api/users" + productId)
				.then().statusCode(200).log().all();
				
				RestAssured.given().when().get("https://reqres.in/api/users" + productId).then().statusCode(200).log().all();
		
	}
	
	
	
	
	
	
}
