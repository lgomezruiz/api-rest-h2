package com.lgomezruiz.apiresth2.controller;

import com.lgomezruiz.apiresth2.model.UserModel;
import com.lgomezruiz.apiresth2.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class userController {

    @Autowired
    private UserServices userServices;

    //Crear usuario
    @PostMapping
    public UserModel createUser(@RequestBody UserModel user){
        return userServices.createUser(user);
    }

    @GetMapping
    //Obtener todos los usuarios
    public List<UserModel> getAllUsers() {
        return userServices.getAllUsers();
    }

    @GetMapping("{id}")
    public UserModel getUserById(@PathVariable("id") Long id) {
        return userServices.getUserById(id);
    }

    @DeleteMapping("{id}")
    public void deleteUserById(@PathVariable("id") Long id) {
        userServices.deleteUser(id);
    }


}
