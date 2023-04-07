package com.example.office.controller;

import com.example.office.model.User;
import com.example.office.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AuthenticationController {
    private final UserService userService;

    @PostMapping("/register")
    public User saveUser(@RequestBody User user) {
        return userService.save(user);
    }
}
