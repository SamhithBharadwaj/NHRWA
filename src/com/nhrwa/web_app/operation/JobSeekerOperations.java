package com.nhrwa.web_app.operation;

import java.util.List;

import com.nhrwa.web_app.CRUD.JobCRUDService;
import com.nhrwa.web_app.CRUD.JobSeekerCRUDService;
import com.nhrwa.web_app.CRUD.RegistrationCRUDService;
import com.nhrwa.web_app.CRUD.UserCRUDService;
import com.nhrwa.web_app.entity.Job;
import com.nhrwa.web_app.entity.JobSeeker;
import com.nhrwa.web_app.entity.Registration;
import com.nhrwa.web_app.entity.User;
import com.nhrwa.web_app.exceptions.ImproperEntityException;

public class JobSeekerOperations {

	public static void listJobs(String userId) {
		try {
			JobCRUDService jobService = new JobCRUDService();
			UserCRUDService userService = new UserCRUDService();
			User user = userService.findById(userId);
			List<Job> jobs = jobService.findAll();
			// eligibility check??
		} catch (ImproperEntityException e) {
			e.printStackTrace();
		}
	}

	public static void getJobSeekerEntity(String userId) {
		try {JobSeekerCRUDService jobSeekerService=new JobSeekerCRUDService();
		JobSeeker jobSeeker= jobSeekerService.findById(userId);
		} catch (ImproperEntityException e) {
			e.printStackTrace();
		}
	}

	public static void register(String userId, String jobId) {
		// check eligibility
		try {
			RegistrationCRUDService regService = new RegistrationCRUDService();
			Registration reg = new Registration();
			reg.setUserId(userId);
			reg.setJobId(jobId);
			List<Registration> existing = regService.findByUserIdAndJobId(userId, jobId);
			if (existing == null || existing.isEmpty()) {
				regService.createEntity(reg);
			}
		} catch (ImproperEntityException e) {
			e.printStackTrace();
		}

	}

	public static void deRegister(String userId, String jobId) {

	}

}
