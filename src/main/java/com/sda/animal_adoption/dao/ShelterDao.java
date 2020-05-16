package com.sda.animal_adoption.dao;

import com.sda.animal_adoption.model.Shelter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShelterDao extends CrudRepository<Shelter, Long> {
}
