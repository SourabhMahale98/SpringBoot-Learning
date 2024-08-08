package com.sdm.JobApp.Service;

import com.sdm.JobApp.Model.JobPost;
import com.sdm.JobApp.Repo.JobRepo;
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
        return jobRepo.allJobs();
    }
}
