package com.example.BackEnd.campany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
