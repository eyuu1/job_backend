package com.example.BackEnd.jobseeker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
