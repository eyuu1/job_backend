package com.example.BackEnd.job;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JobRepository extends JpaRepository<Job , Long> {

    Optional<Job> findById(Long id);
 @Query(value = "SELECT j FROM Job j ORDER BY id DESC LIMIT 5")
    public List<Job> fetchRecentJobs();

    @Query(value = "SELECT j FROM Job j WHERE j.status=:val")
    public List<Job> fetchPendingJobs(@Param("val") String str);

//    @Query("SELECT COUNT(j) FROM Job j WHERE j.status=?active")
//     long getCountOfActiveJobs();

    @Query("SELECT j FROM Job j WHERE "
            + "CONCAT(j.title , j.location)"
            + " LIKE %?1%" )
    public List<Job> findByKeyword(String keyword);
    }
