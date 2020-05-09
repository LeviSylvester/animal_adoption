package com.sda.animal_adoption.dao.user;

import com.sda.animal_adoption.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoFake {

    List<User> users = new ArrayList<>();

    {
        User user = new User();
        user.setFirstName("Timea");
        users.add(user);
    }

    public void saveUser(User user) {//User or boolean or exception if void
        users.add(user);
    }

    public void deleteUser(User user) {
        users.remove(user);
    }

    public void updateUser(Long id, User newUser) { // /User user

    }

    public void updateUserEmail(Long id, String email) {
        for (User user : users) {
            if (user.getId().equals(id)) { //daca era primitiva puteam pune == dar vrem sa verificam continutul referintei
                user.setEmail(email);
            }
        }
    }

    public User getUser(Long id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        throw new NullPointerException("User id not found");
    }

    public List<User> findAll() {
        return users;
    }
}
