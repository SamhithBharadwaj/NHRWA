package com.nhrwa.web_app.entity;

import java.util.Calendar;

public class BaseEntity {
	private String id;
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
	public Calendar getDateUpdated() {
		return dateUpdated;
	}
	public void setDateUpdated(Calendar dateUpdated) {
		this.dateUpdated = dateUpdated;
	}
	private Calendar dateUpdated;

}
