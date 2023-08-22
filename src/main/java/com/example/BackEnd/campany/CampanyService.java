package com.example.BackEnd.campany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

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


    public void addNewCampany(Campany campany) {

        Optional<Campany> campanyOptional = campanyRepository.findCampanyByEmail(campany.getEmail());

        if(campanyOptional.isPresent()){
            throw new IllegalStateException("email already taken");
        }
        campanyRepository.save(campany);


    }
}
