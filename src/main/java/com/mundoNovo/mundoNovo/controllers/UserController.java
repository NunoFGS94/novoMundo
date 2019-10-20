package com.mundoNovo.mundoNovo.controllers;

import com.mundoNovo.mundoNovo.exceptions.ResourceNotFoundException;
import com.mundoNovo.mundoNovo.models.User;
import com.mundoNovo.mundoNovo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserRepository userRepository;

    //get all users
    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    //create a user
    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User user){
        return userRepository.save(user);
    }

    //get single user
    @PostMapping("/users/{id}")
    public User getUserById(@PathVariable(value = "id") Long userId){
        return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
    }

    //update user
    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable(value = "id") Long userId, @Valid @RequestBody User user){
        User user2 = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));

        user2.setPassword(user.getPassword());
        user2.setUsername(user.getUsername());

        return user2;
    }
}
