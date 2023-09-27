package com.example.BackEnd.jobseeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(path = "api/v1/jobseeker")
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
}
