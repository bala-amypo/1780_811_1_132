package com.example.demo.service.impl;

import com.example.demo.entity.UserProfile;
import com.example.demo.repository.UserProfileRepository;
import com.example.demo.service.UserProfileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    private final UserProfileRepository repository;

    public UserProfileServiceImpl(UserProfileRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserProfile createUser(UserProfile userProfile) {
        return repository.save(userProfile);
    }

    @Override
    public UserProfile getUserById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("UserProfile not found"));
    }

    @Override
    public UserProfile updateUser(Long id, UserProfile userProfile) {
        UserProfile existing = getUserById(id);
        existing.setUsername(userProfile.getUsername());
        existing.setEmail(userProfile.getEmail());
        return repository.save(existing);
    }

    @Override
    public void deactivateUser(Long id) {
        UserProfile user = getUserById(id);
        user.setActive(false);
        repository.save(user);
    }

    @Override
    public List<UserProfile> getAllUsers() {
        return repository.findAll();
    }
}
