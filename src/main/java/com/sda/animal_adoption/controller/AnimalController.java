package com.sda.animal_adoption.controller;

import com.sda.animal_adoption.model.Animal;
import com.sda.animal_adoption.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnimalController {

    private AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/findAllAnimals")
    @ResponseBody
    @CrossOrigin("*")
    public List<Animal> findAll() {
        return animalService.findAll();
    }

    @PostMapping("/saveAnimal")
    public void saveUser(@RequestBody Animal animal) {
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
