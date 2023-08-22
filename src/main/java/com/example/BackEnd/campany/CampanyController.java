package com.example.BackEnd.campany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/campany")

public class CampanyController {

    public final CampanyService campanyService;

    public CampanyController(CampanyService campanyService) {
        this.campanyService = campanyService;
    }

    @GetMapping
    public List<Campany> campanyinfo() {
      return campanyService.campanyinfo();
    }

    @PostMapping
    public void registerNewCampany(@RequestBody Campany campany){
        campanyService.addNewCampany(campany);
    }

}
