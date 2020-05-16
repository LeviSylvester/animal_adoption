package com.sda.animal_adoption.service;

import com.sda.animal_adoption.dao.ShelterDao;
import com.sda.animal_adoption.model.Shelter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShelterService {
    private ShelterDao shelterDao;

    @Autowired
    public ShelterService(ShelterDao shelterDao) {
        this.shelterDao = shelterDao;
    }

    public List<Shelter> findAll() {
        return (List<Shelter>) shelterDao.findAll();
    }

    public void save(Shelter shelter) {
        shelterDao.save(shelter);
    }

    public void delete(Long id){
        shelterDao.deleteById(id);
    }

    public Shelter getShelter(Long id) {
        return shelterDao.findById(id).orElse(new Shelter());
    }
}
