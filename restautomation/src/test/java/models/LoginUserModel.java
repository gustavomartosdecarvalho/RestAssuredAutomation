package models;

public class LoginUserModel {

	private String user;
	private String pass;

	public LoginUserModel(String user, String pass) {
		this.user = user;
		this.pass = pass;
	}

	public String getUser() {
		return user;
	}

	public String getPass() {
		return pass;
	}

}
