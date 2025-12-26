package com.example.demo.controller;

import com.example.demo.model.UserProfile;
import com.example.demo.service.UserProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserProfileController {

    private final UserProfileService userProfileService;

    public UserProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }

    @PostMapping
    public ResponseEntity<UserProfile> create(@RequestBody UserProfile userProfile) {
        return ResponseEntity.ok(userProfileService.createUser(userProfile));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserProfile> get(@PathVariable Long id) {
        return ResponseEntity.ok(userProfileService.getUserById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserProfile> update(@PathVariable Long id,
                                              @RequestBody UserProfile userProfile) {
        return ResponseEntity.ok(userProfileService.updateUser(id, userProfile));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deactivate(@PathVariable Long id) {
        userProfileService.deactivateUser(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<UserProfile>> list() {
        return ResponseEntity.ok(userProfileService.getAllUsers());
    }
}
