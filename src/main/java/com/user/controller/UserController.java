package com.user.controller;

import com.user.entity.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    UserService service;

    @PostMapping
    public User adduser(@Valid @RequestBody User user) {

        return service.saveUser(user);
    }


    @GetMapping
    public List<User> findAllUsers() {
        return service.getUsers();
    }

    @GetMapping("/{id}")
    public User findUserById(@PathVariable int id) {
        return service.getUserById(id);
    }

    @GetMapping("/name/{name}")
    public List<User> findUserByName(@PathVariable String name) {
        return service.getUserByName(name);
    }


    @PutMapping
    public User updateUser(@RequestBody User user) {
        return service.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        return service.deleteUser(id);
    }
}
