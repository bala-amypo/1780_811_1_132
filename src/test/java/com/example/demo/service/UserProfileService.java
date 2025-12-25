package com.example.demo.service;

import com.example.demo.entity.UserProfile;
import java.util.List;

public interface UserProfileService {

    UserProfile createUser(UserProfile userProfile);

    UserProfile getUserById(Long id);

    UserProfile updateUser(Long id, UserProfile userProfile);

    void deactivateUser(Long id);

    List<UserProfile> getAllUsers();
}
