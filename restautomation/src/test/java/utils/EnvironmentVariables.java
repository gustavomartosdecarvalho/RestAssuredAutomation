package utils;

import java.util.Map;

public class EnvironmentVariables {

	public String getUser() {
		return returnEnvironmentVariables("USER_CRED");
	}

	public String getPass() {
		return returnEnvironmentVariables("PASS_CRED");
	}

	private String returnEnvironmentVariables(String envVar) {
		Map<String, String> env = System.getenv();
		for (String envName : env.keySet()) {
			if (envVar.equals(envName)) {
				return env.get(envName);
			}
		}
		return "";
	}

}
