package com.nhrwa.web_app.CRUD;

import com.nhrwa.web_app.entity.JobSeeker;
import com.nhrwa.web_app.exceptions.ImproperEntityException;

public class JobSeekerCRUDService extends BasicCRUDService<JobSeeker>{

	public JobSeekerCRUDService() throws ImproperEntityException {
		super(JobSeeker.class);
	}

}
