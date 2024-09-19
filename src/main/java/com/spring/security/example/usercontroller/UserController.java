package com.spring.security.example.usercontroller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.spring.security.example.userdto.UserDTO;
import com.spring.security.example.userservice.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody UserDTO request) {
        userService.saveUser(request.getUsername(), request.getPassword(), "ROLE_USER");
        return "User registered successfully!";
    }
}
