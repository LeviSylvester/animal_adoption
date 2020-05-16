package com.sda.animal_adoption.service;

import com.sda.animal_adoption.dao.AnimalDao;
import com.sda.animal_adoption.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    private AnimalDao animalDao;

    @Autowired
    public AnimalService(AnimalDao animalDao) {
        this.animalDao = animalDao;
    }

    public List<Animal> findAll() {
        return (List<Animal>) animalDao.findAll();
    }

    public void save(Animal animal) {
        animalDao.save(animal);
    }

    public void delete(Long id) {
        animalDao.deleteById(id);
    }

    public Animal findById(Long id) {
//        return findAll().stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return animalDao.findById(id).orElseThrow(() -> new NullPointerException("Does not exist"));
    }

}
