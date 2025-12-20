package com.example.demo.service;

import com.example.demo.entity.UserProfile;

import java.util.List;

public interface UserProfileService {

    UserProfile getById(Long id);

    List<UserProfile> getAll();

    UserProfile updateRating(Long profileId, Double rating);
}
