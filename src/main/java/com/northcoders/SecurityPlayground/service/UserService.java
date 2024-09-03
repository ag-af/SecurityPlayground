package com.northcoders.SecurityPlayground.service;

import com.northcoders.SecurityPlayground.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User getUserByUsername(String username);
    List<User> getAllUsers();
}
