package scenarios;

import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dtos.BodyAbcDto;
import io.restassured.response.Response;
import models.BodyAbcModel;
import requests.SystemAbcRequest;

public class AbcInvalidDataTest {

	@Test
	@DisplayName("Verify if using invalid data returns Bad Request status code")
	public void verifyInvalidDataStatuscodeBadRequest() {
		BodyAbcModel bodyAbc = BodyAbcDto.bodyAbcFalse();
		Response response = SystemAbcRequest.postCreateAbc(bodyAbc);
		response.then().statusCode(200);
	}

	@Test
	@DisplayName("Verify if using invalid data returns fail message")
	public void verifyInvalidDataErrorMessage() {
		BodyAbcModel bodyAbc = BodyAbcDto.bodyAbcFalse();
		Response response = SystemAbcRequest.postCreateAbc(bodyAbc);
		response.then().assertThat().body("error", equalTo("Body abc not vaild"));
	}

}
