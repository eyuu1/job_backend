package com.example.BackEnd.jobseeker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobSeekerService {

    private final JobSeekerRepo jobSeekerRepo;

    @Autowired
    public JobSeekerService(JobSeekerRepo jobSeekerRepo) {
        this.jobSeekerRepo = jobSeekerRepo;
    }




    public void addNewJobSeeker(JobSeeker jobSeeker) {
//        Optional<Campany> jobSeekerOptional = jobSeekerRepo.findJobSeekerByEmail(jobSeeker.getEmail());
//
//        if(jobSeekerOptional.isPresent()){
//            throw new IllegalStateException("email already taken");
//        }
        jobSeekerRepo.save(jobSeeker);
    }

    public List<JobSeeker> jobSeekersInfo() {
        return jobSeekerRepo.findAll();
    }

    public void deleteJobSeeker(Long jobSeekerId) {
        boolean exists = jobSeekerRepo.existsById(jobSeekerId);

        if(!exists){
            throw new IllegalStateException("employee with id "+ jobSeekerId + "doesn't exist");
        }
        jobSeekerRepo.deleteById(jobSeekerId);
    }

    public Long countAllJobseekers() {
        Long allJobseekers = jobSeekerRepo.count();
        return allJobseekers;
    }
}
