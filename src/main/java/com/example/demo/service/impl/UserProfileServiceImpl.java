package com.example.barter.service.impl;

import com.example.barter.entity.UserProfile;
import com.example.barter.exception.ResourceNotFoundException;
import com.example.barter.repository.UserProfileRepository;
import com.example.barter.service.UserProfileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    private final UserProfileRepository profileRepository;

    public UserProfileServiceImpl(UserProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public UserProfile getById(Long id) {
        return profileRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User profile not found"));
    }

    @Override
    public List<UserProfile> getAll() {
        return profileRepository.findAll();
    }

    @Override
    public UserProfile updateRating(Long profileId, Double rating) {
        if (rating < 0 || rating > 5) {
            throw new IllegalArgumentException("Rating must be between 0 and 5");
        }
        UserProfile profile = getById(profileId);
        profile.setRating(rating);
        return profileRepository.save(profile);
    }
}
