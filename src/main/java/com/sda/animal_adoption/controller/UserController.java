package com.sda.animal_adoption.controller;

import com.sda.animal_adoption.model.User;
import com.sda.animal_adoption.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

//    private UserService userService = new UserService();

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/findAll")
    @ResponseBody
    @CrossOrigin("*")
    public List<User> findAll() {
        return userService.findAll();
    }

    @PostMapping("/save")
    public void saveUser(@RequestBody User user) {
        userService.saveU(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.delete(id);
    }

}
