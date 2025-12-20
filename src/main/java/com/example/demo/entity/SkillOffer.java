package com.example.barter.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "skill_offers")
public class SkillOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private User user;

    @ManyToOne(optional = false)
    private SkillCategory skillCategory;

    @Column(nullable = false)
    private String skillName;

    private String description;

    @Column(nullable = false)
    private String experienceLevel; // BEGINNER / INTERMEDIATE / EXPERT

    @Column(nullable = false)
    private String availability = "AVAILABLE";

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "offer")
    private List<SkillMatch> matches;

    public SkillOffer() {}

    public SkillOffer(User user, SkillCategory skillCategory, String skillName, String experienceLevel) {
        this.user = user;
        this.skillCategory = skillCategory;
        this.skillName = skillName;
        this.experienceLevel = experienceLevel;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        if (this.availability == null) {
            this.availability = "AVAILABLE";
        }
    }
}
