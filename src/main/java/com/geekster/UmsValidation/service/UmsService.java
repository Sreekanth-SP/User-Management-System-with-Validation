package com.geekster.UmsValidation.service;

import com.geekster.UmsValidation.model.UmsModel;
import com.geekster.UmsValidation.repository.UmsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UmsService {
    @Autowired
    UmsRepo userRepo;

    public List<UmsModel> getAllUsers() {
        return userRepo.getUsersList();
    }

    public String addUser(UmsModel user) {
        List<UmsModel> currList = getAllUsers();
        currList.add(user);
        return "User Added";
    }

    public String addUsers(List<UmsModel> users) {
        List<UmsModel> currList = getAllUsers();
        currList.addAll(users);
        return "Added all users";
    }

    public UmsModel getUserById(Integer userId) {
        List<UmsModel> currList = getAllUsers();
        for(UmsModel user : currList){
            if(user.getUserId().equals(userId)){
                return user;
            }
        }
        return null;
    }

    public String updateUserInfo(Integer id, UmsModel user) {
        List<UmsModel> currList = getAllUsers();
        for(UmsModel currUser : currList){
            if(currUser.getUserId().equals(id)){
                currUser.setUserId(user.getUserId());
                currUser.setUserName(user.getUserName());
                currUser.setEmail(user.getEmail());
                currUser.setPhoneNumber(user.getPhoneNumber());
                currUser.setDateOfBirth(user.getDateOfBirth());
                currUser.setDateOfJoining(user.getDateOfJoining());
                currUser.setTimeOfJoining(user.getTimeOfJoining());
                currList.add(currUser);
                return "User Info Updated";
            }
        }
        return  "User Id not Found";
    }

    public String deleteUser(Integer id) {
        List<UmsModel> currList = getAllUsers();
        for(UmsModel user : currList){
            if(user.getUserId().equals(id)){
                currList.remove(user);
                return "Deleted the User Corresponding to that Id";
            }
        }
        return "UserId Not Found";
    }
}
