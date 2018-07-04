package com.nhrwa.web_app.CRUD;

import java.util.List;

import com.nhrwa.web_app.entity.Registration;
import com.nhrwa.web_app.exceptions.ImproperEntityException;

public class RegistrationCRUDService extends BasicCRUDService<Registration>{

	public RegistrationCRUDService() throws ImproperEntityException {
		super(Registration.class);
	}

	public List<Registration> findByUserIdAndJobId(String userId, String jobId){
		String query="WHERE USERID='"+userId+"' AND JOBID='"+jobId+"'";
		return find(query);
	}

}
