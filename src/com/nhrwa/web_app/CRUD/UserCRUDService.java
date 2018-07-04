package com.nhrwa.web_app.CRUD;

import com.nhrwa.web_app.entity.User;
import com.nhrwa.web_app.exceptions.ImproperEntityException;

public class UserCRUDService extends BasicCRUDService<User> {

	public UserCRUDService() throws ImproperEntityException {
		super(User.class);
	}

	public User findByUserKey(String userKey) {
		String query = "WHERE USERKEY='" + userKey + "'";
		return find(query).get(0);
	}
}
