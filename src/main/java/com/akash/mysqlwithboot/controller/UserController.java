package com.akash.mysqlwithboot.controller;

import com.akash.mysqlwithboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String rest(){
        return "welcome to the Java";
    }

    @GetMapping("/getUserName")
    public List<String> getAllUserName(){
        return userRepository.getAllUserName();
    }

}
