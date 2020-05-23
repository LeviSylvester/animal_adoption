package com.sda.animal_adoption.dao;

import com.sda.animal_adoption.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserInterface {

    private UserDao userDao;

    @Autowired
    public UserRepositoryImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public User findById(Long id) {
        return userDao.findById(id).orElseThrow(() -> new NullPointerException("Not found!"));
    }

    @Override
    public List<User> findAll() {
        return (List<User>) userDao.findAll();
    }

    @Override
    public void delete(Long id) {
        userDao.delete(findById(id));
    }
}
