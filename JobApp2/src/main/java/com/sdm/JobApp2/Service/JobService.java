package com.sdm.JobApp2.Service;

import com.sdm.JobApp2.Model.JobPost;
import com.sdm.JobApp2.Repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepo jobRepo;

    public void addjob(JobPost jobPost){
        jobRepo.addJobs(jobPost);

    }

    public List<JobPost> getAllJobs(){
        return jobRepo.getAllJobs();
    }

    public JobPost getJob(int jobId){
        return jobRepo.getJob(jobId);
    }

    public void updateJobPost(JobPost jobPost) {
        jobRepo.updateJobPost(jobPost);
    }

    public void deleteJob(int deleteId) {
        jobRepo.deleteJob(deleteId);
    }
}
