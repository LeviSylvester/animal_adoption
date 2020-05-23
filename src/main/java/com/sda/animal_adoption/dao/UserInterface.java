package com.sda.animal_adoption.dao;

import com.sda.animal_adoption.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInterface {

    void save(User user);

    User findById(Long id);

    List<User> findAll();

    void delete(Long id);

}
