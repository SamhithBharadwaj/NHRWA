package com.nhrwa.web_app.entity;

import com.nhrwa.web_app.annotations.EntityField;
import com.nhrwa.web_app.annotations.Entity;
@Entity(tableName = "UserTable")
public class User extends BaseEntity {
	@EntityField(columnName = "USERTYPE")
	private int type;
	@EntityField(columnName = "USERID")
	private String userId;
	@EntityField(columnName = "USERKEY")
	private String loginKey;
	@EntityField(columnName = "PASSWORD")
	private String password;

	public Integer getType() {
		return type;
	}

	public void setType(Integer type){
		this.type = type;
	}

	public String getLoginKey() {
		return loginKey;
	}

	public void setLoginKey(String loginKey) {
		this.loginKey = loginKey;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
