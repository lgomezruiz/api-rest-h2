package com.lgomezruiz.apiresth2.services;

import com.lgomezruiz.apiresth2.model.UserModel;
import com.lgomezruiz.apiresth2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {
    @Autowired
    private UserRepository userRepository;

    //Crear usuario
    public UserModel createUser (UserModel user) {
        return userRepository.save(user);
    }

    //Obtener usuario mediante ID
    public UserModel getUserById (Long id) {
        /*
        Optional: tipo de dato especial de JDK 8, que permite trabajar
        el manejo de excepciones. En este caso, es el tipo de objeto que
        voy a obtener de la BD.
         */
        Optional<UserModel> optionalUser = userRepository.findById(id);
        return optionalUser.get();
    }

    //Obtener lista de todos los usuarios
    public List<UserModel> getAllUsers() {
    return userRepository.findAll();
    }

    //Eliminar usuario
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
