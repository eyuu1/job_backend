package com.example.BackEnd.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/job")

public class JobController {

    private final JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping
    public List<Job> jobInfo(){
      return jobService.jobInfo();
    }

    @PostMapping
    public void saveJob(@RequestBody Job job){
        jobService.saveJob(job);
    }
}
