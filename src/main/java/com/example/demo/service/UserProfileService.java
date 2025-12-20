package com.example.barter.service;

import com.example.barter.entity.UserProfile;

import java.util.List;

public interface UserProfileService {

    UserProfile getById(Long id);

    List<UserProfile> getAll();

    UserProfile updateRating(Long profileId, Double rating);
}
