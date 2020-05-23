package com.sda.animal_adoption.controller;

import com.sda.animal_adoption.model.Adoption;
import com.sda.animal_adoption.model.Animal;
import com.sda.animal_adoption.service.AdoptionService;
import com.sda.animal_adoption.service.AnimalService;
import com.sda.animal_adoption.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Calendar;

@RestController
@RequestMapping("/adoption")
public class AdoptionController {

    @Autowired
    AdoptionService adoptionService;

    @Autowired
    AnimalService animalService;

    @Autowired
    UserService userService;

//    @Autowired
//    public AdoptionController(AdoptionService adoptionService, AnimalService animalService, UserService userService) {
//        this.adoptionService = adoptionService;
//        this.animalService = animalService;
//        this.userService = userService;
//    }

    @PostMapping("createAdoption/")
    @CrossOrigin("*")
    public void createAdoption(@RequestParam(name = "idUser") Long idUser,
                               @RequestParam(name = "idAnimal") Long idAnimal) {
        Adoption adoption = new Adoption();
//        adoption.setDate(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
        adoption.setDate(java.sql.Timestamp.valueOf(LocalDateTime.now()));
        adoption.setUser(userService.findById(idUser));
        Animal animal = animalService.findById(idAnimal);
        animal.setAdopted("true");
        adoption.setAnimal(animal);
        adoptionService.save(adoption);
        animalService.save(animal);
    }
}
