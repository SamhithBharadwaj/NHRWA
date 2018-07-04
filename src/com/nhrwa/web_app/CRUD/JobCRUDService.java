package com.nhrwa.web_app.CRUD;

import com.nhrwa.web_app.entity.Job;
import com.nhrwa.web_app.exceptions.ImproperEntityException;

public class JobCRUDService extends BasicCRUDService<Job>{

	public JobCRUDService() throws ImproperEntityException{
		super(Job.class);
	}

}
