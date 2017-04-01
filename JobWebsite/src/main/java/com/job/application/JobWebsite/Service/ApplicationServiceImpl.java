package com.job.application.JobWebsite.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.job.application.JobWebsite.Dao.ApplicationDao;
import com.job.application.JobWebsite.Model.Applicant;
import com.job.application.JobWebsite.Model.Application;


@Service
@Qualifier("applicationServiceImpl")
public class ApplicationServiceImpl implements ApplicationService{

	@Autowired
	@Qualifier("applicationDaoImpl")
	ApplicationDao applicationDao;
	public Boolean postJob(Application application) {
		
		return applicationDao.postJob(application);
	}
	@Override
	public List<Application> getAllPostedJobs() {
		
		return applicationDao.getAllPostedJobs();
	}
	@Override
	public Boolean applyJob(Application application) {
		
		return applicationDao.applyJob(application);
	}
	@Override
	public List<Application> getAllAppliedJobs() {
		
		return applicationDao.getAllAppliedJobs();
	}
	@Override
	public List<Applicant> getApplicantDetails() {
		
		return applicationDao.getApplicantDetails();
	}

}
