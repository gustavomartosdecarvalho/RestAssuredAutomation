package scenarios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import requests.SwapiRequest;

public class SwapiPeopleTwoTest {

	private static Response response;
	private static JsonPath respBody;

	@BeforeAll
	public static void setUp() {
		response = SwapiRequest.getPeopleTwo();
		respBody = response.jsonPath();
	}

	@Test
	@DisplayName("Verify if the status code is 200")
	public void verifyStatuscodeOk() {
		assertEquals("200", response.getStatusCode());
	}

	@Test
	@DisplayName("Verify if the name is C3PO")
	public void verifyNameCThreePO() {
		assertEquals("C-3PO", respBody.getString("name"));
	}

}
