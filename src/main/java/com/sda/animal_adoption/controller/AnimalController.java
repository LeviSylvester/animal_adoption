package com.sda.animal_adoption.controller;

import com.sda.animal_adoption.model.Animal;
import com.sda.animal_adoption.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController
public class AnimalController {

    private AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/sayHi/{hi}")
    @ResponseBody
    public String sayHi(@PathVariable String hi) {
        return "prefix" + hi;
    }

//    @GetMapping("/animals")
//    public List<Animal> getAllAnimals() {
//        return animalService.getAllAnimals();
//    }


}
