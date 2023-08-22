package com.example.BackEnd.campany;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CampanyRepository extends JpaRepository<Campany , Long> {

    Optional<Campany> findCampanyByEmail(String email);
}
