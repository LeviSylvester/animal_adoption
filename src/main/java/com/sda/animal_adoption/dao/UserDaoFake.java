package com.sda.animal_adoption.dao;

import com.sda.animal_adoption.model.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@Qualifier("/userDao")
public class UserDaoFake implements UserInterface {
    @Override
    public void save(User user) {

    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
