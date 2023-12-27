package dtos;

import models.BodyAbcModel;

public class BodyAbcDto {
	
	public static BodyAbcModel bodyAbcTrue() {
		BodyAbcModel bodyAbc = new BodyAbcModel();
		bodyAbc.setFieldA("Valid");
		bodyAbc.setFieldB(5);
		bodyAbc.setFieldC(true);
		
		return bodyAbc;
	}
	
	public static BodyAbcModel bodyAbcFalse() {
		BodyAbcModel bodyAbc = new BodyAbcModel();
		bodyAbc.setFieldA("Invalid");
		bodyAbc.setFieldB(2);
		bodyAbc.setFieldC(false);
		
		return bodyAbc;
	}
}
