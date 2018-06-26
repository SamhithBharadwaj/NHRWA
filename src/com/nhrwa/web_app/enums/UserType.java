package com.nhrwa.web_app.enums;

public enum UserType {
	system_admin(0), admin(1), employer(2), job_seeker(3);
	private final int value;

	public int getValue() {
		return value;
	}

	private UserType(int value) {
		this.value = value;
	}

}
