package requests;

import static io.restassured.RestAssured.useRelaxedHTTPSValidation;

import org.json.JSONObject;

import static io.restassured.RestAssured.given;

import dtos.LoginUserDto;
import io.restassured.path.json.JsonPath;

public class AccessTokenRequest {
	
	public String  accessToken() {
		useRelaxedHTTPSValidation();
		
		JSONObject loginObj = new JSONObject(LoginUserDto.loginUser());
		
		JsonPath response = given()
								.contentType("application/json")
								.header("Accept-Language", "en-US")
								.body(loginObj.toString())
							.when()
								.post("https://www.url.com/api/uri/login")
								.jsonPath();
		
		return response.getString("token_type")
						.concat(" ")
						.concat(response.getString("access_token"));			
	}

}
