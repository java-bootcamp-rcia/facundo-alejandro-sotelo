package com.bootcamp.projectUser.services;


import com.bootcamp.projectUser.entity.User;
import com.bootcamp.projectUser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll(){
        List <User> list = new ArrayList<>();
        this.userRepository.findAll().forEach(list :: add);
        return list;
    }
    public User getUser(int id){
        User one = new User();
        one = this.userRepository.findById(id).get();
        return one;
    }
    public void save(User user){
        this.userRepository.save(user);
    }
    public void update(User user){
        this.userRepository.save(user);
    }
    public void deleteUser(User user){
        this.userRepository.delete(user);
    }
    public void deleteById(int id){
        this.userRepository.deleteById(id);
    }
}
