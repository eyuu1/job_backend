package com.example.BackEnd.jobCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobCategoryService {

    @Autowired
    JobCategoryRepo jobCategoryRepo;


    public JobCategoryService(JobCategoryRepo jobCategoryRepo) {
        this.jobCategoryRepo = jobCategoryRepo;
    }

    public List<JobCategory> categoryInfo() {
        return jobCategoryRepo.findAll();
    }


    public void saveJobCategory(JobCategory jobCategory) {
        jobCategoryRepo.save(jobCategory);
    }

}
