package com.example.BackEnd.campany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampanyService {

    private final CampanyRepository campanyRepository;

    @Autowired
    public CampanyService(CampanyRepository campanyRepository) {
        this.campanyRepository = campanyRepository;
    }


    public List<Campany> campanyinfo() {
        return campanyRepository.findAll();
    }


}
