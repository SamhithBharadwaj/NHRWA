package com.nhrwa.web_app.entity;

import com.nhrwa.web_app.annotations.EntityField;
import com.nhrwa.web_app.annotations.Entity;

@Entity(tableName = "Audit")
public class Audit {
	@EntityField(columnName = "ID")
	private String id;
	@EntityField(columnName = "USERID")
	private String userid;
	@EntityField(columnName = "CHANGES")
	private String changes;
	@EntityField(columnName = "CHANGETIME")
	private String changeTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getChanges() {
		return changes;
	}

	public void setChanges(String changes) {
		this.changes = changes;
	}

	public String getChangeTime() {
		return changeTime;
	}

	public void setChangeTime(String changeTime) {
		this.changeTime = changeTime;
	}

}
