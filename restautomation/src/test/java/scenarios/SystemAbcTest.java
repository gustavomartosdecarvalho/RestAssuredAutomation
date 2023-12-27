package scenarios;

import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.not;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dtos.BodyAbcDto;
import io.restassured.response.Response;
import models.BodyAbcModel;
import requests.SystemAbcRequest;

public class SystemAbcTest {

	private Response response;

	@BeforeEach()
	public void setUp() {
		BodyAbcModel bodyAbc = BodyAbcDto.bodyAbcTrue();
		response = SystemAbcRequest.postCreateAbc(bodyAbc);
	}

	@Test
	@DisplayName("Verify if using valid data returns created status code")
	public void verifyValidDataStatuscodeCreated() {
		response.then().statusCode(201);
	}

	@Test
	@DisplayName("Verify if using valid data returns fieldA starts with to V")
	public void verifyValidDataFieldAEqualValid() {
		response.then().assertThat().body("field_a", startsWith("V"));
	}

	@Test
	@DisplayName("Verify if using valid data returns fieldB is not a null value")
	public void verifyValidDataFieldB() {
		response.then().assertThat().body("field_b", notNullValue());
	}

	@Test
	@DisplayName("Verify if using valid data returns fieldC is not false")
	public void verifyValidDataFieldC() {
		response.then().assertThat().body("field_c", not(false));
	}

}
