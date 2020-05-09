package com.sda.animal_adoption.service;

import com.sda.animal_adoption.dao.AnimalDao;
import com.sda.animal_adoption.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AnimalService {

    private AnimalDao animalDao;

    @Autowired
    public AnimalService(AnimalDao animalDao) {
        this.animalDao = animalDao;
    }

    List<Animal> animalList = new ArrayList<>(Arrays.asList(
            new Animal(1, "test", "test", "dog", "m", 0, "good dog"),
            new Animal(2, "test", "test", "dog", "m", 0, "good dog"),
            new Animal(3, "test", "test", "dog", "m", 0, "good dog")
    ));

    public List<Animal> getAllAnimals() {
        return animalList;
    }

//    public Animal getAnimal(String idAnimal) {
//        return animalList.stream().filter(t -> t.getIdAnimal().equals(idAnimal)).findFirst().get();
//    }


}
