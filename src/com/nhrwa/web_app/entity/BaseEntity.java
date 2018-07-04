package com.nhrwa.web_app.entity;

import java.util.Calendar;

import com.nhrwa.web_app.annotations.EntityField;

public class BaseEntity {
	@EntityField(columnName = "ID")
	private String id;
	@EntityField(columnName = "DATECREATED")
	private Calendar dateCreated;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Calendar getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Calendar dateCreated) {
		this.dateCreated = dateCreated;
	}

}
