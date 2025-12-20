package com.example.barter.controller;

import com.example.barter.entity.UserProfile;
import com.example.barter.service.UserProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profiles")
public class UserProfileController {

    private final UserProfileService userProfileService;

    public UserProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserProfile> getProfile(@PathVariable Long id) {
        return ResponseEntity.ok(userProfileService.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<UserProfile>> getAllProfiles() {
        return ResponseEntity.ok(userProfileService.getAll());
    }

    @PutMapping("/{id}/rating")
    public ResponseEntity<UserProfile> updateRating(
            @PathVariable Long id,
            @RequestParam Double rating) {
        return ResponseEntity.ok(userProfileService.updateRating(id, rating));
    }
}
