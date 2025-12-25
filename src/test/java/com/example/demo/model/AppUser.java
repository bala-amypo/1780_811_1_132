package com.example.demo.entity;

import java.time.LocalDateTime;

public class AppUser {

    private String role;
    private LocalDateTime createdAt;

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
