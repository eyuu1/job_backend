package com.example.BackEnd.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "api/v1/job")

public class JobController {

    @Autowired
     JobService jobservice;


    public JobController(JobService jobservice) {
        this.jobservice = jobservice;
    }

    @GetMapping("/retrive")
    public List<Job> jobInfo(){
      return jobservice.jobInfo();
    }

    @GetMapping("/{jobId}")
    public List<Job> findJob(@PathVariable("jobId") Long id){
        return jobservice.findJob(id);
    }

    @PostMapping("/add")
    public void saveJob(@RequestBody Job job){
        jobservice.saveJob(job);
    }
}
