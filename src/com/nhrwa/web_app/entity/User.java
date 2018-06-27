package com.nhrwa.web_app.entity;

import com.nhrwa.web_app.annotations.EntityField;
import com.nhrwa.web_app.annotations.TableName;
@TableName(name = "UserTable")
public class User extends BaseEntity {
	@EntityField(columnName = "UserType")
	private Integer type;
	@EntityField(columnName = "UserName")
	private String name;
	@EntityField(columnName = "Password")
	private String password;

	public Integer getType() {
		return type;
	}

	public void setType(Integer type){
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
