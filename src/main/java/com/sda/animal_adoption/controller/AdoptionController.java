package com.sda.animal_adoption.controller;

import com.sda.animal_adoption.model.Adoption;
import com.sda.animal_adoption.service.AdoptionService;
import com.sda.animal_adoption.service.AnimalService;
import com.sda.animal_adoption.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
@RequestMapping("/adoption")
public class AdoptionController {

    AdoptionService adoptionService;
    AnimalService animalService;
    UserService userService;

    @Autowired
    public AdoptionController(AdoptionService adoptionService, AnimalService animalService, UserService userService) {
        this.adoptionService = adoptionService;
        this.animalService = animalService;
        this.userService = userService;
    }

    @PostMapping("createAdoption/")
    public void createAdoption(@RequestParam(name = "idUser") Long idUser,
                               @RequestParam(name = "idAnimal") Long idAnimal) {
        Adoption adoption = new Adoption();
        adoption.setDate(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
        adoption.setUser(userService.findById(idUser));
        adoption.setAnimal(animalService.findById(idAnimal));
        adoptionService.save(adoption);
    }
}
