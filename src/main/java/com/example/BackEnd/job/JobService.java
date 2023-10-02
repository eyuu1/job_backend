package com.example.BackEnd.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class JobService {

    @Autowired
    JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<Job> findJob(Long id) {
    return jobRepository.findAll().stream().filter(item -> item.getId() == id).collect(Collectors.toList());
    }

    public List<Job> jobInfo(){
       return jobRepository.findAll();
    }

    public void saveJob(Job job) {
//            Optional<Job> jobOptional = jobRepository.findByTitle(job.getTitle());
//            if (jobOptional.isPresent()){
//            throw new IllegalStateException("job is present in database");
           jobRepository.save(job);
        }

    }






