package com.sda.animal_adoption.service;

import com.sda.animal_adoption.dao.AdoptionDao;
import com.sda.animal_adoption.dao.AnimalDao;
import com.sda.animal_adoption.model.Adoption;
import com.sda.animal_adoption.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdoptionService {
    private AdoptionDao adoptionDao;

    @Autowired
    public AdoptionService(AdoptionDao adoptionDao) {
        this.adoptionDao = adoptionDao;
    }

    public List<Adoption> findAll() {
        return (List<Adoption>) adoptionDao.findAll();
    }

    public void save(Adoption adoption) {
        adoptionDao.save(adoption);
    }

    public void delete(Long id) {
        adoptionDao.deleteById(id);
    }

    public Adoption getAdoption(Long id) {
//        return findAll().stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return adoptionDao.findById(id).orElseThrow(() -> new NullPointerException("Does not exist"));
    }

    //cuplam un animal cu o persoana
    //stergem animalul din shelter

}
