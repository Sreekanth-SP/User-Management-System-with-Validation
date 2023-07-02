package com.geekster.UmsValidation.repository;

import com.geekster.UmsValidation.model.UmsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UmsRepo {
    @Autowired
    private List<UmsModel> usersList;

    public List<UmsModel> getUsersList() {
        return usersList;
    }
}
