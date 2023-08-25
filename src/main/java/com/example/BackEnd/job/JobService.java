package com.example.BackEnd.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    private JobRepository jobRepository;
    @Autowired
    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<Job> jobInfo(){
       return jobRepository.findAll();
    }

    public void saveJob(Job job) {
            Optional<Job> jobOptional = jobRepository.findByTitle(job.getTitle());
            if (jobOptional.isPresent()){
            throw new IllegalStateException("job is present in database");
        }
        jobRepository.save(job);
    }



}


