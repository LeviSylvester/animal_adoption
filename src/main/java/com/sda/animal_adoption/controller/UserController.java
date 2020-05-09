package com.sda.animal_adoption.controller;

import com.sda.animal_adoption.model.User;
import com.sda.animal_adoption.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserService userService = new UserService();

    @GetMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @PostMapping("/save")
    public void saveUser(@RequestBody User user) {
        userService.saveU(user);
    }

}
