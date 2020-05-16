//package com.sda.animal_adoption.dao.user;
//
//import com.sda.animal_adoption.model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class UserRepositoryImpl implements MyInterface {
//
//    private UserRepository userRepository;
//
//    @Autowired
//    public UserRepositoryImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public User getUser() {
//        return userRepository.findById(2L).orElse(new User());
//    }
//}
