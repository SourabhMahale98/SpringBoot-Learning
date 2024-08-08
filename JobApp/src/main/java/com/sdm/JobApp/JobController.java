package com.sdm.JobApp;

import com.sdm.JobApp.Model.JobPost;
import com.sdm.JobApp.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.PrivateKey;
import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping({ "/", "home" })
    public String home() {
        return "home";
    }

    @GetMapping("addJob")
     public String addJob(){
        return "addJob";
     }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        jobService.addjob(jobPost);
        return "success";
    }

     @GetMapping("allJobs")
     public String allJobs(Model model){
         List<JobPost> alljobs = jobService.getAllJobs();
         model.addAttribute("jobPosts",alljobs);
        return "allJobs";
     }




}
