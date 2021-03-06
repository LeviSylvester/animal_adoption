package com.sda.animal_adoption.dao;

import com.sda.animal_adoption.model.Animal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalDao extends CrudRepository<Animal, Long> {
}
