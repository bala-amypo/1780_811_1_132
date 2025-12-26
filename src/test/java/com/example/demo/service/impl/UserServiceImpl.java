package com.example.demo.service.impl;

import com.example.demo.model.AppUser;
import com.example.demo.repository.AppUserRepository;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final AppUserRepository appUserRepository;

    public UserServiceImpl(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @Override
    public AppUser findByEmail(String email) {
        return appUserRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
