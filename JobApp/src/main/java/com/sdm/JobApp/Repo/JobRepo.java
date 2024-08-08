package com.sdm.JobApp.Repo;

import com.sdm.JobApp.Model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost("Software Engineer", "TCS", "Working on Java, MySQL etc", "Pune"),
            new JobPost("Data Scientist", "Infosys", "Analyzing data using Python, R, and machine learning algorithms", "Bangalore"),
            new JobPost("Project Manager", "Wipro", "Managing software development projects and coordinating with cross-functional teams", "Hyderabad"),
            new JobPost("UI/UX Designer", "HCL", "Designing user interfaces and improving user experience for web and mobile applications", "Chennai"),
            new JobPost("DevOps Engineer", "Cognizant", "Implementing CI/CD pipelines and managing cloud infrastructure", "Delhi")
    ));

    public void addJobs(JobPost jobPost){
        jobs.add(jobPost);
        System.out.println(jobs);
    }

    public List<JobPost> allJobs(){
        return jobs;
    }
}
