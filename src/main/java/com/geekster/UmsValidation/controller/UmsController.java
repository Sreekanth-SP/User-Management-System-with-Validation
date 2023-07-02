package com.geekster.UmsValidation.controller;

import com.geekster.UmsValidation.model.UmsModel;
import com.geekster.UmsValidation.service.UmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UmsController {
    @Autowired
    UmsService userService;

    //    addUser
    @PostMapping("user")
    public String addUser(@RequestBody UmsModel user){
        return userService.addUser(user);
    }

    //  addUsers
    @PostMapping("users")
    public String addUsers(@RequestBody List<UmsModel> users){
        return userService.addUsers(users);
    }

    //   getUser/{userid}
    @GetMapping("user/{userId}/id")
    public UmsModel getUserById(@PathVariable Integer userId){
        return userService.getUserById(userId);
    }

    //    getAllUsers
    @GetMapping("users")
    public List<UmsModel> getAllUsers(){
        return userService.getAllUsers();
    }

    //    updateUserInfo
    @PutMapping("userinfo/{id}/id")
    public String updateUserInfo(@PathVariable Integer id,@RequestBody UmsModel user){
        return userService.updateUserInfo(id,user);
    }

    //    deleteUser
    @DeleteMapping("user/{id}/id")
    public String deleteUser(@PathVariable Integer id){
        return userService.deleteUser(id);
    }
}