package com.job.application.JobWebsite.Service;

import java.util.List;

import com.job.application.JobWebsite.Model.Applicant;
import com.job.application.JobWebsite.Model.Application;


public interface ApplicationService {

	public Boolean postJob(Application application);

	public List<Application> getAllPostedJobs();

	public Boolean applyJob(Application application);

	public List<Application> getAllAppliedJobs();
	
	public List<Applicant> getApplicantDetails();

}
