package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_profiles")
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fullName;

    private String location;

    @Column(nullable = false)
    private Double rating = 0.0;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public UserProfile() {}

    public UserProfile(String fullName, String location, User user) {
        this.fullName = fullName;
        this.location = location;
        this.user = user;
    }

    // getters & setters
}
