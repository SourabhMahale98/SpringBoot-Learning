package com.sdm.JobApp2.Repo;

import com.sdm.JobApp2.Model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Software Engineer", "TCS", "Working on Java, MySQL etc", "Pune"),
            new JobPost(2, "Data Scientist", "Infosys", "Analyzing data using Python, R, and machine learning algorithms", "Bangalore"),
            new JobPost(3, "Project Manager", "Wipro", "Managing software development projects and coordinating with cross-functional teams", "Hyderabad"),
            new JobPost(4, "UI/UX Designer", "HCL", "Designing user interfaces and improving user experience for web and mobile applications", "Chennai"),
            new JobPost(5, "DevOps Engineer", "Cognizant", "Implementing CI/CD pipelines and managing cloud infrastructure", "Delhi")
    ));

    public void addJobs(JobPost jobPost){
        jobs.add(jobPost);
        System.out.println(jobs);
    }


    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public JobPost getJob(int jobId){
        return  jobs.stream()
                .filter(job -> job.getJobId() == jobId)
                .findFirst()
                .orElse(null);
    }

    public void updateJobPost(JobPost jobPost) {
        jobs.stream().filter(job ->job.getJobId() == jobPost.getJobId()).findFirst(
        ).ifPresent(
                job -> {
                    job.setJobId(jobPost.getJobId());
                    job.setJobTitle(jobPost.getJobTitle());
                    job.setCompanyName(jobPost.getCompanyName());
                    job.setJobDescription(jobPost.getJobDescription());
                    job.setLocation(jobPost.getLocation());
                }
        );
    }

    public void deleteJob(int deleteId) {
        jobs.stream().filter(job ->job.getJobId() == deleteId).findFirst().ifPresent(
                jobPost -> {
                jobs.remove(jobPost);
                }
        );
    }
}
