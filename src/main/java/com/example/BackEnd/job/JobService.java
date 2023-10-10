package com.example.BackEnd.job;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class JobService {

    @Autowired
    JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

//    public List<Job> findJob(Long id) {
//    return jobRepository.findAll().stream().filter(item -> item.getId() == id).collect(Collectors.toList());
//    }

//    @Override
    public Optional <Job> findJob(Long id) {
        return jobRepository.findById(id);
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

    public List<Job> findRecentJobs(){
        return jobRepository.fetchRecentJobs();
    }

    public List<Job> findPendingJobs(String status){
        return jobRepository.fetchPendingJobs(status);
    }

    @Transactional
    public void updateJobStatus(Long jobId, String status) {
        Job job = jobRepository.findById(jobId).orElseThrow(()->new IllegalStateException("job with id "+ jobId + " isn't found"));

        if(status!=null && !status.isEmpty() && !Objects.equals(job.getStatus() , status) ){
            job.setStatus(status);
        }
    }

    public void deleteJob(Long jobId) {

        boolean exists = jobRepository.existsById(jobId);

        if(!exists){
            throw new IllegalStateException("job with id "+ jobId + "doesn't exist");
        }
        jobRepository.deleteById(jobId);
    }

    public Long countAllJobs() {
        Long countJobs = jobRepository.count();
        return countJobs;
    }

    public List<Job> searchByKeyword(String keyword) {
        return jobRepository.findByKeyword(keyword);
    }

//    public Long getActiveJobsCount(){
//        return jobRepository.getCountOfActiveJobs();
//    }
}






