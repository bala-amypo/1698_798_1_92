package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.User;
import com.example.demo.service.AuthService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return authService.register(user);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {

        String token = authService.login(
                user.getEmail(),
                user.getPassword()
        );

        return ResponseEntity.ok(token);
    }
}
