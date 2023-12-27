package requests;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class SwapiRequest {
	
	public static Response getPeopleOneResponse() {
		Response response = given()
								.contentType("application/json")
							.when()
								.get("https://swapi.dev/api/people/1");
		return response;
	}
	
	public static Response getPeopleTwo() {
		Response response = given()
								.contentType("application/json")
							.when()
								.get("https://swapi.dev/api/people/2");
		return response;
	}
}
