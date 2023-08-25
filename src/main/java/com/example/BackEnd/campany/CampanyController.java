package com.example.BackEnd.campany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "api/v1/campany")

public class CampanyController {

    private final CampanyService campanyService;

    @Autowired
    public CampanyController(CampanyService campanyService) {
        this.campanyService = campanyService;
    }

    @GetMapping
    public List<Campany> campanyInfo() {
      return campanyService.campanyInfo();
    }

    @PostMapping("/add")
    public void registerNewCampany(@RequestBody Campany campany){
        campanyService.addNewCampany(campany);
    }

}
