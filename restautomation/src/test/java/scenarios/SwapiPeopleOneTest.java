package scenarios;

import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.restassured.response.Response;
import requests.SwapiRequest;

public class SwapiPeopleOneTest {

	private Response response;

	@Test
	@DisplayName("Verify if the status code is 200")
	public void verifyStatuscodeOk() {
		response = SwapiRequest.getPeopleOneResponse();
		response.then().statusCode(200);
	}

	@Test
	@DisplayName("Verify if the content type is application/json")
	public void verifyContentTypeJson() {
		response = SwapiRequest.getPeopleOneResponse();
		response.then().assertThat().contentType("application/json");
	}

	@Test
	@DisplayName("Verify if the name is Luke Skywalker")
	public void verifyNameLuke() {
		response = SwapiRequest.getPeopleOneResponse();
		response.then().assertThat().body("name", equalTo("Luke Skywalker"));
	}

	@Test
	@DisplayName("Verify if the mass is greater than 70")
	public void verifyMassGreaterSeventySeven() {
		response = SwapiRequest.getPeopleOneResponse();
		response.then().assertThat().body("mass", greaterThan("70"));
	}

	@Test
	@DisplayName("Verify if the height is less than or equal to 172")
	public void verify() {
		response = SwapiRequest.getPeopleOneResponse();
		response.then().assertThat().body("height", lessThanOrEqualTo("172"));
	}
}
