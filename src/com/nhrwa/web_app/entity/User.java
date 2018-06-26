package com.nhrwa.web_app.entity;

import com.nhrwa.web_app.enums.UserType;

public class User extends BaseEntity {
	private UserType type;
	private String name;
	private String password;

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
