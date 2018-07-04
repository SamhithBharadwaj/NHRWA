package com.nhrwa.web_app.entity;

import com.nhrwa.web_app.annotations.EntityField;

public class JobSeeker extends BaseUser {
	@EntityField(columnName = "SKILLS")
	private String skills;
	@EntityField(columnName = "EDUCATION")
	private String highestEducation;
	@EntityField(columnName = "EXPERIENCE")
	private String experience;

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getHighestEducation() {
		return highestEducation;
	}

	public void setHighestEducation(String highestEducation) {
		this.highestEducation = highestEducation;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

}
