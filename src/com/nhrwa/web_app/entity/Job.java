package com.nhrwa.web_app.entity;

import com.nhrwa.web_app.annotations.Entity;
import com.nhrwa.web_app.annotations.EntityField;

@Entity(tableName = "Job")
public class Job extends BaseEntity {
	@EntityField(columnName = "TITLE")
	private String title;
	@EntityField(columnName = "CATEGORY")
	private String category;
	@EntityField(columnName = "REQUIRED_SKILLS")
	private String requiredSkills;
	@EntityField(columnName = "Description")
	private String description;
	@EntityField(columnName = "LOCATION")
	private String location;
	@EntityField(columnName = "CTC")
	private String ctc;
	@EntityField(columnName = "CREATEDUSERID")
	private String createdUserId;
	@EntityField(columnName = "LAST_DATE_REG")
	private String lastDateForReg;
	@EntityField(columnName = "DRIVE_DATE")
	private String driveDate;
	@EntityField(columnName = "VACANCY")
	private String vacancy;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRequiredSkills() {
		return requiredSkills;
	}

	public void setRequiredSkills(String requiredSkills) {
		this.requiredSkills = requiredSkills;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCtc() {
		return ctc;
	}

	public void setCtc(String ctc) {
		this.ctc = ctc;
	}

	public String getCreatedUserId() {
		return createdUserId;
	}

	public void setCreatedUserId(String createdUserId) {
		this.createdUserId = createdUserId;
	}

	public String getLastDateForReg() {
		return lastDateForReg;
	}

	public void setLastDateForReg(String lastDateForReg) {
		this.lastDateForReg = lastDateForReg;
	}

	public String getDriveDate() {
		return driveDate;
	}

	public void setDriveDate(String driveDate) {
		this.driveDate = driveDate;
	}

	public String getVacancy() {
		return vacancy;
	}

	public void setVacancy(String vacancy) {
		this.vacancy = vacancy;
	}

}
