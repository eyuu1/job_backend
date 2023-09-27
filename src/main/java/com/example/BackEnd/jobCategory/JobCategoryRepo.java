package com.example.BackEnd.jobCategory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobCategoryRepo extends JpaRepository<JobCategory, Long> {
}
