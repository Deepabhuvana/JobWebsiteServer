package com.job.application.JobWebsite.Dao;

import java.util.List;

import com.job.application.JobWebsite.Model.Applicant;
import com.job.application.JobWebsite.Model.Application;


public interface ApplicationDao {

	public Boolean postJob(Application application);
	
	public List<Application> getAllPostedJobs();
	
	public Boolean applyJob(Application application);
	
	public List<Application> getAllAppliedJobs();
	
	public List<Applicant> getApplicantDetails();
	
}
