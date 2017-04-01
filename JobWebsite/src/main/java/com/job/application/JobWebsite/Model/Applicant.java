package com.job.application.JobWebsite.Model;

public class Applicant {
	private int applicationID;
	private String applicantName;
	private String applicantEmail;
	private String applicantExp;
	private String applicantSkills;
	private String applicantNotice;
	private Application jobID;
	
	public int getApplicationID() {
		return applicationID;
	}
	public void setApplicationID(int applicationID) {
		this.applicationID = applicationID;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getApplicantEmail() {
		return applicantEmail;
	}
	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}
	public String getApplicantExp() {
		return applicantExp;
	}
	public void setApplicantExp(String applicantExp) {
		this.applicantExp = applicantExp;
	}
	public String getApplicantSkills() {
		return applicantSkills;
	}
	public void setApplicantSkills(String applicantSkills) {
		this.applicantSkills = applicantSkills;
	}
	public String getApplicantNotice() {
		return applicantNotice;
	}
	public void setApplicantNotice(String applicantNotice) {
		this.applicantNotice = applicantNotice;
	}
	public Application getJobID() {
		return jobID;
	}
	public void setJobID(Application jobID) {
		this.jobID = jobID;
	}
	
	
	
	
	
}
