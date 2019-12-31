package com.bootcamp.projectUser.controller;

import com.bootcamp.projectUser.entity.User;
import com.bootcamp.projectUser.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserService log;

    @GetMapping("/users")
    public List<User> getAll(){
        return this.log.getAll();
    }
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id){
        return this.log.getUser(id);
    }
    @PostMapping("/users")
    public void save(@RequestBody User user){
        this.log.save(user);
    }
    @PutMapping("/users/{user}")
    public void update(@RequestBody User user){
        this.log.save(user);
    }
    @DeleteMapping("/users/{user}")
    public void deleteUser(@RequestBody User user){
        this.log.deleteUser(user);
    }
    @DeleteMapping("/users/user/{id}")
    public void deleteById(@PathVariable int id){
        this.log.deleteById(id);
    }

}
