package com.example.BackEnd.campany;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampanyRepository extends JpaRepository<Campany , Long> {
}
