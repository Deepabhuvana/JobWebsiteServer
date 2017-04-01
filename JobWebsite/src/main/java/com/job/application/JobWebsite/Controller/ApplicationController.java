package com.job.application.JobWebsite.Controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.job.application.JobWebsite.Model.Applicant;
import com.job.application.JobWebsite.Model.Application;
import com.job.application.JobWebsite.Service.ApplicationService;

@RestController
@RequestMapping(value = "/JobWebsite")
public class ApplicationController {

	@Autowired
	@Qualifier("applicationServiceImpl")
	ApplicationService applicationService;

	

	@CrossOrigin(origins = "http://localhost:9000")
	@RequestMapping(value = "/postjob", method = RequestMethod.POST, consumes = { "text/plain",
			"application/*" }, produces = { "text/plain", "application/*" }, headers = "Accept=application/json")
	public @ResponseBody String postJob(HttpServletResponse response, @RequestBody Application app)
			throws JSONException {
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
		response.addHeader("Access-Control-Allow-Headers", "origin, content-type, accept, x-requested-with");
		response.addHeader("Access-Control-Max-Age", "3600");
		String message;
		JSONObject json = new JSONObject();
		json.put("aa", "successfully");

		message = json.toString();

		return message;

	}

	@RequestMapping(value = "/getAllPostedJobs", method = RequestMethod.GET)
	public List<Application> getAllPostedJobs() throws JSONException {

		List<Application> allPostedJobsList = applicationService.getAllPostedJobs();

		return allPostedJobsList;

	}

	@CrossOrigin(origins = "http://localhost:9000")
	@RequestMapping(value = "/applyjob", method = RequestMethod.POST, consumes = { "text/plain",
			"application/*" }, produces = { "text/plain", "application/*" }, headers = "Accept=application/json")
	public @ResponseBody Boolean applyJob(HttpServletResponse response,
			@RequestBody Application application) throws JSONException {
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
		response.addHeader("Access-Control-Allow-Headers", "origin, content-type, accept, x-requested-with");
		response.addHeader("Access-Control-Max-Age", "3600");
		return applicationService.applyJob(application);
	}

	@RequestMapping(value = "/getAllAppliedJobs", method = RequestMethod.GET)
	public List<Application>  getAllAppliedJobs() throws JSONException {

		List<Application> allAppliedJobsList = applicationService.getAllAppliedJobs();
		
		return allAppliedJobsList;

	}
	
	@RequestMapping(value = "/getAllApplicants", method = RequestMethod.GET)
	public List<Applicant>  getAllApplicants() throws JSONException {

		List<Applicant> allApplicantsList = applicationService.getApplicantDetails();
		
		return allApplicantsList;

	}

}
