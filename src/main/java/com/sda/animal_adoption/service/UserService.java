package com.sda.animal_adoption.service;

import com.sda.animal_adoption.dao.UserDao;
import com.sda.animal_adoption.dao.UserInterface;
import com.sda.animal_adoption.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

//    private UserDao userDao;

//    @Autowired
//    public UserService(UserDao userDao) {
//        this.userDao = userDao;
//    }

    private UserInterface userInterface;

    @Autowired
    public UserService(@Qualifier("userRepositoryImpl")UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    public List<User> findAll() {
        return (List<User>) userInterface.findAll();
    }

    public void save(User user) {
        userInterface.save(user);
    }

    public Iterable<User> findUsersWithGivenInitial(String initial) {
        Iterable<User> users = userInterface.findAll();
        List<User> usersResult = new ArrayList<>();
        for (User user : users) {
            if (user.getName().startsWith(initial)) {
                usersResult.add(user);
            }
        }
        return usersResult;
    }

    public void delete(Long id){
        userInterface.delete(id);
    }

    public User findById(Long id) {
//        return findAll().stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return userInterface.findById(id);
    }
}
