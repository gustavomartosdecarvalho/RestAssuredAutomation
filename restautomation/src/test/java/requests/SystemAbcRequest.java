package requests;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.useRelaxedHTTPSValidation;

import org.json.JSONObject;

import io.restassured.response.Response;
import models.BodyAbcModel;

public class SystemAbcRequest {

	public static Response postCreateAbc(BodyAbcModel bodyAbc) {
		useRelaxedHTTPSValidation();
		
		AccessTokenRequest token = new AccessTokenRequest();
		
		JSONObject bodyAbcObj = new JSONObject(bodyAbc);
		
		Response response = given()
								.contentType("application/json")
								.header("Accept-Language", "en-US")
								.header("Authorization", token.accessToken())
								.body(bodyAbcObj.toString())
							.when()
								.post("https://www.url.com/api/uri/systemabc");

		return response;
		
	}

}
