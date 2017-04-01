package com.job.application.JobWebsite.Dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.job.application.JobWebsite.Model.Applicant;
import com.job.application.JobWebsite.Model.Application;


@Repository
@Qualifier("applicationDaoImpl")
public class ApplicationDaoImpl implements ApplicationDao{

	@Override
	public Boolean postJob(Application application) {
		if(application != null)
			{return true;
			}
			return false;
	}

	@Override
	public List<Application> getAllPostedJobs() {
		
		List<Application> postedApplicationList = new ArrayList<>();
		postedApplicationList.add(setValues(11, "xxxx", "Software Engineer", Arrays.asList("BE","BTech"), Arrays.asList("ME","MTech"), Arrays.asList("IT software","IT hardware"), Arrays.asList("Healthcare","Medicine"), "60 days", "2 years", "xxx", 0));
		postedApplicationList.add(setValues(12, "yyyy", "Senior Software Engineer", Arrays.asList("BE","BTech"), Arrays.asList("ME","MTech"), Arrays.asList("IT software","IT hardware"), Arrays.asList("Healthcare","Medicine"), "60 days", "6 years", "yyy", 0));
		postedApplicationList.add(setValues(12, "zzzz", "Technical Lead", Arrays.asList("BE","BTech"), Arrays.asList("ME","MTech"), Arrays.asList("IT software","IT hardware"), Arrays.asList("Healthcare","Medicine"), "60 days", "12 years", "zzz", 0));
		
		return postedApplicationList;
	}

	@Override
	public Boolean applyJob(Application application) {
		if(application.getIsApplied() == 1)
		{return true;
		}
		return false;
	}

	@Override
	public List<Application> getAllAppliedJobs() {
		List<Application> applicationList = new ArrayList<>();
		applicationList.add(setValues(11, "xxxx", "Software Engineer", Arrays.asList("BE","BTech"), Arrays.asList("ME","MTech"), Arrays.asList("IT software","IT hardware"), Arrays.asList("Healthcare","Medicine"), "60 days", "2 years", "xxx",1));
		applicationList.add(setValues(12, "yyyy", "Senior Software Engineer", Arrays.asList("BE","BTech"), Arrays.asList("ME","MTech"), Arrays.asList("IT software","IT hardware"), Arrays.asList("Healthcare","Medicine"), "60 days", "6 years", "yyy", 1));
		applicationList.add(setValues(12, "zzzz", "Technical Lead", Arrays.asList("BE","BTech"), Arrays.asList("ME","MTech"), Arrays.asList("IT software","IT hardware"), Arrays.asList("Healthcare","Medicine"), "60 days", "12 years", "zzz",1));
		
		return applicationList;
		
	}
	
	private Application setValues(int applicationID, String jobDescription, String profile, Collection<String> ug,
			Collection<String> pg, Collection<String> industry, Collection<String> functionality, String notice,
			String experience, String company, int isApplied){
		Application application = new Application();
		application.setApplicationID(applicationID);
		application.setJobDescription(jobDescription);
		application.setProfile(profile);
		application.setUg(ug);
		application.setPg(pg);
		application.setIndustry(industry);
		application.setFunctionality(functionality);
		application.setNotice(notice);
		application.setExperience(experience);
		application.setCompany(company);
		application.setIsApplied(isApplied);
		return application;
	}

	@Override
	public List<Applicant> getApplicantDetails() {
		List<Applicant> applicantList = new ArrayList<>();
		applicantList.add(setapplicantValues(12, "guru", "guru@gmail.com", "2 years", "angularjs, java", "60 days"));
		return applicantList;
	}
	
	private Applicant setapplicantValues(int applicationID, String applicantName, String applicantEmail, String applicantExp,
			String applicantSkills, String applicantNotice){
		Applicant applicant = new Applicant();
		applicant.setApplicationID(applicationID);
		applicant.setApplicantName(applicantName);
		applicant.setApplicantEmail(applicantEmail);
		applicant.setApplicantExp(applicantExp);
		applicant.setApplicantSkills(applicantSkills);
		applicant.setApplicantNotice(applicantNotice);
		applicant.setJobID(setValues(11, "xxxx", "Software Engineer", Arrays.asList("BE","BTech"), Arrays.asList("ME","MTech"), Arrays.asList("IT software","IT hardware"), Arrays.asList("Healthcare","Medicine"), "60 days", "2 years", "xxx",1));
		return applicant;
	}

	
}
