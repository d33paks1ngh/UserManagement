package com.example.UserManagement.service;


import com.example.UserManagement.entity.UserData;
import com.example.UserManagement.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepo userrepo;

    public UserService(UserRepo userrepo) {
        this.userrepo = userrepo;
    }

    // Adding user
    public void addUser(UserData userdata){
        userrepo.save(userdata);
    }

    // get user by ID
    public UserData getUserById(int id){
      return  userrepo.findById(id).orElse(null);
    }

    // Get all the users
    public List<UserData> getAllUser(){
        return userrepo.findAll();
    }

    // Update user

    public String updateUser(int id){
        return "check the update request only, logic will be written after that :"+id;
    }

    // Delete the user by id
    public void deleteById(int id){
        userrepo.deleteById(id);
    }

    // Delete all

    public void deleteAll(){
        userrepo.deleteAll();
    }
}
