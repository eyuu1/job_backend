package com.example.BackEnd.jobseeker;

import com.example.BackEnd.campany.Campany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobSeekerRepo extends JpaRepository<JobSeeker, Long> {
}
