package com.sda.animal_adoption.service;

import com.sda.animal_adoption.dao.user.UserDaoFake;
import com.sda.animal_adoption.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private UserDaoFake userDaoFake = new UserDaoFake();

    public List<User> findAll() {
        return userDaoFake.findAll();
    }

    public void saveU(User user) {
        userDaoFake.saveUser(user);
    }

    public List<User> findUsersWithGivenInitial(String initial) {
        List<User> users = userDaoFake.findAll();
        List<User> usersResult = new ArrayList<>();
        for (User user : users) {
            if (user.getFirstName().startsWith(initial)) {
                usersResult.add(user);
            }
        }
        return usersResult;
    }
}
