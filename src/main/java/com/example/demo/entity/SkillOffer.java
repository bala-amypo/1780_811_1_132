package com.example.demo.entity;

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
    private Skill skill;

    @Column(nullable = false)
    private String experienceLevel; // BEGINNER / INTERMEDIATE / EXPERT

    @Column(nullable = false)
    private String availability = "AVAILABLE";

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "offer")
    private List<MatchRecord> matches;

    public SkillOffer() {}

    public SkillOffer(User user, Skill skill, String experienceLevel) {
        this.user = user;
        this.skill = skill;
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
