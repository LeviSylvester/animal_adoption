package com.sda.animal_adoption.dao.user;

import com.sda.animal_adoption.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoFake implements MyInterface {

    List<User> users = new ArrayList<>();

    {
        User user = new User();
        user.setId(8L);
        user.setName("Timea");

        User user1 = new User();
        user1.setId(9L);
        user1.setName("Alex");

        User user2 = new User();
        user2.setId(100L);
        user2.setName("Levi");

        users.add(user);
        users.add(user1);
        users.add(user2);
    }

    public void saveUser(User user) {//User or boolean or exception if void
        users.add(user);
    }

    public void deleteUser(Long id) {
        int index = -1;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() != null && users.get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            users.remove(index);
            System.out.println(users);
        }
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

    @Override
    public User getUser() {
        return null;
    }
}
