package com.nhrwa.web_app.entity;

import com.nhrwa.web_app.annotations.EntityField;

public class BaseUser extends BaseEntity {
	@EntityField(columnName = "NAME")
	private String name;
	@EntityField(columnName = "DOB")
	private String dateOfBirth;
	@EntityField(columnName = "ADDRESS")
	private String Address;
	@EntityField(columnName = "PERSONAL_EMAIL")
	private String personalEmail;
	@EntityField(columnName = "TYPE")
	private int type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPersonalEmail() {
		return personalEmail;
	}

	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
