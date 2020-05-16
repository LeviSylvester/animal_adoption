package com.sda.animal_adoption.service;

import com.sda.animal_adoption.dao.UserDao;
import com.sda.animal_adoption.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> findAll() {
        return (List<User>) userDao.findAll();
    }

    public void save(User user) {
        userDao.save(user);
    }

    public Iterable<User> findUsersWithGivenInitial(String initial) {
        Iterable<User> users = userDao.findAll();
        List<User> usersResult = new ArrayList<>();
        for (User user : users) {
            if (user.getName().startsWith(initial)) {
                usersResult.add(user);
            }
        }
        return usersResult;
    }

    public void delete(Long id){
        userDao.deleteById(id);
    }

    public User findById(Long id) {
//        return findAll().stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return userDao.findById(id).orElseThrow(() -> new NullPointerException("Does not exist"));
    }
}
