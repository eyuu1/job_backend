package com.example.BackEnd.job;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JobRepository extends JpaRepository<Job , Long> {

    Optional<Job> findById(Long id);
}
