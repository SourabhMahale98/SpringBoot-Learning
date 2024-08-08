package com.sdm.JobApp2;

import com.sdm.JobApp2.Model.JobPost;
import com.sdm.JobApp2.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Provider;
import java.util.List;

@RestController
public class JobApp2Controller {

    @Autowired
    private JobService jobService;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs(){
        return jobService.getAllJobs();
    }

    @GetMapping("jobPost/{jobId}")
    public JobPost getJob(@PathVariable int jobId){
        return jobService.getJob(jobId);
    }

    @PostMapping("jobPost")
    public  JobPost addJob(@RequestBody JobPost jobPost){
        jobService.addjob(jobPost);
        return jobService.getJob(jobPost.getJobId());
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        jobService.updateJobPost(jobPost);
        return jobService.getJob(jobPost.getJobId());
    }

    @DeleteMapping("jobPost/{deleteId}")
    public String deleteJob(@PathVariable int deleteId){
        jobService.deleteJob(deleteId);
        return "Deleted" + deleteId;
    }

}
