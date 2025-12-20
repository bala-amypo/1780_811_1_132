package com.example.barter.service;

import com.example.barter.entity.User;

public interface UserService {

    User register(User user);

    User login(String email, String password);

    User getById(Long id);
}
