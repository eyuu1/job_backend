package com.example.BackEnd.jobCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "api/v1/job_category")
public class JobCategoryController {

    @Autowired
    JobCategoryService jobCategoryService;


    public JobCategoryController(JobCategoryService jobCategoryService) {
        this.jobCategoryService = jobCategoryService;
    }

    @PostMapping("/add")
    public void saveJob(@RequestBody JobCategory jobCategory){
        jobCategoryService.saveJobCategory(jobCategory);
    }

    @GetMapping("/retrive")
    public List<JobCategory> jobInfo(){
        return jobCategoryService.categoryInfo();
    }
}
