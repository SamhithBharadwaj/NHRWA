package com.nhrwa.web_app.operation;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import com.nhrwa.web_app.CRUD.UserCRUDService;
import com.nhrwa.web_app.entity.User;
import com.nhrwa.web_app.exceptions.ImproperEntityException;

public class GenralOperation {

	public void validateUserLogin(String userKey, String password) {
		MessageDigest digest;
		try {
			UserCRUDService userService = new UserCRUDService();
			digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
			String encoded = Base64.getEncoder().encodeToString(hash);
			User usr = userService.findByUserKey(userKey);
			if (usr == null) {
				// No such user error
			} else if (usr.getPassword().equals(encoded)) {
				// valid user
			} else {
				// invalid password;
			}

		} catch (NoSuchAlgorithmException | ImproperEntityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
