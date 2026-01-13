package com.example.UserManagement.controller;

import com.example.UserManagement.entity.UserData;
import com.example.UserManagement.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userservise;
    public UserController(UserService userservice){
        this.userservise=userservice;
    }

    @PostMapping()
    public void addUser(@RequestBody UserData userData){
        userservise.addUser(userData);
    }

    @GetMapping()
    public List<UserData> getAllUser(){
      return  userservise.getAllUser();
    }

    @GetMapping("get/{id}")
    public UserData getUser(@PathVariable Integer id) {
        return userservise.getUserById(id);
    }


    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id){
        userservise.deleteById(id);
        return "User Deleted Successfully";
    }

    @PutMapping("/update/{id}")
    public String updateUser(@PathVariable int id){
        return userservise.updateUser(id);
    }

    @DeleteMapping("/deleteAll")
    public String deleteAll(){
        userservise.deleteAll();
        return "All Data Deleted successfully";
    }






}
