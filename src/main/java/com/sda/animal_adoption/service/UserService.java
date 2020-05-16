package com.sda.animal_adoption.service;

import com.sda.animal_adoption.dao.user.UserDao;
import com.sda.animal_adoption.dao.user.UserDaoFake;
import com.sda.animal_adoption.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

//    private UserDaoFake userDaoFake = new UserDaoFake();

//    private UserDaoFake userDaoFake;

//    private UserRepoInterface userRepoInterface;

    private UserDao userDao;
    //MyInterface myInterface;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> findAll() {
        return (List<User>) userDao.findAll();
    }

    public void saveU(User user) {
        userDao.save(user); //crudrepository, not userdaofake
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
}
