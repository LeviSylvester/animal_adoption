package com.sda.animal_adoption.dao;

import com.sda.animal_adoption.model.Adoption;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdoptionDao extends CrudRepository<Adoption, Long> {
}
