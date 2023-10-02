package com.example.BackEnd.jobseeker;
import com.example.BackEnd.jobCategory.JobCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "api/v1/jobseekers")
public class JobSeekerController {

    private final JobSeekerService jobSeekerService;

    @Autowired
    public JobSeekerController(JobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }

    @PostMapping("/add")
    public void registerNewJobSeeker(@RequestBody JobSeeker jobSeeker){
        jobSeekerService.addNewJobSeeker(jobSeeker);
    }

    @GetMapping("/retrive")
    public List<JobSeeker> jobSeekersInfo(){
        return jobSeekerService.jobSeekersInfo();
    }

    @DeleteMapping(path = "{jobSeekerId}")
    public void deleteJobSeeker(@PathVariable("jobSeekerId") Long jobSeekerId){
        jobSeekerService.deleteJobSeeker(jobSeekerId);
    }
}
