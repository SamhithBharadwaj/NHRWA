package com.nhrwa.web_app.entity;

import com.nhrwa.web_app.annotations.Entity;
import com.nhrwa.web_app.annotations.EntityField;

@Entity(tableName = "EMPLOYER")
public class Employer extends BaseUser {
	@EntityField(columnName = "COMPANY_NAME")
	private String companyName;
	@EntityField(columnName = "DESIGNATION")
	private String designation;
	@EntityField(columnName = "LOCATION")
	private String location;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
