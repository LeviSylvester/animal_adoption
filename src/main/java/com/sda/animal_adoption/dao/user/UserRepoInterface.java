package com.sda.animal_adoption.dao.user;

import com.sda.animal_adoption.model.User;

public interface UserRepoInterface {

    void save(User user);
    void delete(User user);
}
