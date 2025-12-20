package com.example.barter.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email")
})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password; // hashed only

    private String location;

    @Column(nullable = false)
    private String role = "USER";

    @Column(nullable = false)
    private Double rating = 0.0;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "user")
    private List<SkillOffer> skillOffers;

    @OneToMany(mappedBy = "user")
    private List<SkillRequest> skillRequests;

    @OneToMany(mappedBy = "matchedBy")
    private List<SkillMatch> matchesCreated;

    public User() {}

    public User(String fullName, String email, String password, String role) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        if (this.rating == null) {
            this.rating = 0.0;
        }
        if (this.role == null) {
            this.role = "USER";
        }
    }

    // Getters and setters omitted for brevity (can be generated)
}
