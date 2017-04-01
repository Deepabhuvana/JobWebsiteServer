package com.job.application.JobWebsite.Model;

import java.util.Collection;


public class Application {
	
	private int applicationID;
	private String jobDescription;
	private String profile;
	private Collection<String> ug;
	private Collection<String> pg;
	private Collection<String> industry;
	private Collection<String> functionality;
	private String notice;
	private String experience;
	private String company;
	private int isApplied;
	
	
	
	
//	public Application(int applicationID, String jobDescription, String profile, Collection<String> ug,
//			Collection<String> pg, Collection<String> industry, Collection<String> functionality, String notice,
//			String experience, String company, int isApplied) {
//		
//		this.applicationID = applicationID;
//		this.jobDescription = jobDescription;
//		this.profile = profile;
//		this.ug = ug;
//		this.pg = pg;
//		this.industry = industry;
//		this.functionality = functionality;
//		this.notice = notice;
//		this.experience = experience;
//		this.company = company;
//		this.isApplied = isApplied;
//	}


	public int getApplicationID() {
		return applicationID;
	}
	public void setApplicationID(int applicationID) {
		this.applicationID = applicationID;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public Collection<String> getUg() {
		return ug;
	}
	public void setUg(Collection<String> ug) {
		this.ug = ug;
	}
	public Collection<String> getPg() {
		return pg;
	}
	public void setPg(Collection<String> pg) {
		this.pg = pg;
	}
	public Collection<String> getIndustry() {
		return industry;
	}
	public void setIndustry(Collection<String> industry) {
		this.industry = industry;
	}
	public Collection<String> getFunctionality() {
		return functionality;
	}
	public void setFunctionality(Collection<String> functionality) {
		this.functionality = functionality;
	}
	public String getNotice() {
		return notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getIsApplied() {
		return isApplied;
	}
	public void setIsApplied(int isApplied) {
		this.isApplied = isApplied;
	}
	
	

}
