package com.nhrwa.web_app.entity;

import com.nhrwa.web_app.annotations.Entity;
import com.nhrwa.web_app.annotations.EntityField;

@Entity(tableName = "REGISTRATION")
public class Registration extends BaseEntity {
	@EntityField(columnName = "USERID")
	private String userId;
	@EntityField(columnName = "JOBID")
	private String jobId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

}
