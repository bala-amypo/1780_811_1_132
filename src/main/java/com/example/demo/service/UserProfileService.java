package com.example.demo.service;

import com.example.demo.entity.UserProfile;

import java.util.Optional;

public interface UserProfileService {

    Optional<UserProfile> getProfileByUserId(Long userId);
}
