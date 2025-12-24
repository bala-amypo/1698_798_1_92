package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

public interface AuthService {
    User register(User user);
    User login(String email, String password);
}
