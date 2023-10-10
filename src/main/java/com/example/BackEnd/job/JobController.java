package com.example.BackEnd.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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

    @GetMapping("/recentjobs")
    public List<Job> fetchRecentController(){
        return jobservice.findRecentJobs();
    }

    @GetMapping("status/{status}")
    public List<Job> fetchPendingController(@PathVariable String status){
        return jobservice.findPendingJobs(status);
    }

    @GetMapping("countjobs")
    public Long countJob(){
        return jobservice.countAllJobs();
    }

//    @GetMapping("countactivejobs")
//    public Long CountActiveJobs(){
//        return jobservice.getActiveJobsCount();
//    }
    @PutMapping("updateStatus/{jobId}")
    public void updateJobStatus( @PathVariable("jobId") Long jobId,  String status){
        jobservice.updateJobStatus(jobId, status);
    }


    @DeleteMapping(path = "{jobId}")
    public void deleteJob(@PathVariable("jobId") Long jobId){
        jobservice.deleteJob(jobId);
    }

    @GetMapping("keyword")
    public List<Job> searchByKeyword(@Param("keyword") String keyword){
        return jobservice.searchByKeyword(keyword);
    }
}
