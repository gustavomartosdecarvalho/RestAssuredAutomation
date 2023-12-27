package dtos;

import models.LoginUserModel;
import utils.EnvironmentVariables;

public class LoginUserDto {

	public static LoginUserModel loginUser() {
		EnvironmentVariables envVars = new EnvironmentVariables();
		LoginUserModel login = new LoginUserModel(envVars.getUser(), envVars.getPass());
		return login;
	}

}
