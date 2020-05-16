package com.sda.animal_adoption.controller;

import com.sda.animal_adoption.service.DatabasePopulation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/manage")
public class ManagementController {

    DatabasePopulation databasePopulation;

    @Autowired
    public ManagementController(DatabasePopulation databasePopulation) {
        this.databasePopulation = databasePopulation;
    }

    @PostMapping("/saveData")
    public void saveData() {
//        databasePopulation.populateData();
    }
}
