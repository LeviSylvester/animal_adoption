package com.sda.animal_adoption.controller;

import com.sda.animal_adoption.model.Animal;
import com.sda.animal_adoption.service.AnimalService;
import com.sda.animal_adoption.service.ShelterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnimalController {

    private AnimalService animalService;

    private ShelterService shelterService;

    @Autowired
    public AnimalController(AnimalService animalService, ShelterService shelterService) {
        this.animalService = animalService;
        this.shelterService = shelterService;
    }

    @GetMapping("/findAllAnimals")
    @ResponseBody
    @CrossOrigin("*")
    public List<Animal> findAll() {
        return animalService.findAll();
    }

    @PostMapping("/saveAnimal")
    @CrossOrigin("*")
    public void saveAnimal(@RequestBody Animal animal) {

        //sheter's id hardcoded for now as we have only 1 (online/virtual) shelter
        animal.setShelter(shelterService.getShelter(1L));
        animal.setAdopted("false");
        animalService.save(animal);
    }

    @DeleteMapping("/deleteAnimal/{id}")
    public void deleteAnimal(@PathVariable Long id) {
        animalService.delete(id);
    }

//    @GetMapping("/sayHi/{hi}")
//    @ResponseBody
//    public String sayHi(@PathVariable String hi) {
//        return "prefix" + hi;

//    }

}
