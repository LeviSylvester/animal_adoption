//package com.sda.animal_adoption.service;
//
//import com.sda.animal_adoption.dao.user.UserDaoFake;
//import com.sda.animal_adoption.dao.user.UserRepoInterface;
//import com.sda.animal_adoption.model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class UserService {
//
////    private UserDaoFake userDaoFake = new UserDaoFake();
//
//    private UserDaoFake userDaoFake;
//
////    private UserRepoInterface userRepoInterface;
//
//    @Autowired
//    public UserService(UserDaoFake userDaoFake) {
//        this.userDaoFake = userDaoFake;
//    }
//
//    public List<User> findAll() {
//        return userDaoFake.findAll();
//    }
//
//    public void saveU(User user) {
//        userDaoFake.saveUser(user); //crudrepository, not userdaofake
//    }
//
//    public List<User> findUsersWithGivenInitial(String initial) {
//        List<User> users = userDaoFake.findAll();
//        List<User> usersResult = new ArrayList<>();
//        for (User user : users) {
//            if (user.getFirstName().startsWith(initial)) {
//                usersResult.add(user);
//            }
//        }
//        return usersResult;
//    }
//
//    public void delete(Long id){
//        userDaoFake.deleteUser(id);
//    }
//}
