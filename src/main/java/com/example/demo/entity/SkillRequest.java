package com.example.barter.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "skill_requests")
public class SkillRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private User user;

    @ManyToOne(optional = false)
    private SkillCategory skillCategory;

    @Column(nullable = false)
    private String skillName;

    @Column(nullable = false)
    private String requiredLevel; // BEGINNER / INTERMEDIATE / EXPERT

    @Column(nullable = false)
    private String status = "OPEN";

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "request")
    private List<SkillMatch> matches;

    public SkillRequest() {}

    public SkillRequest(User user, SkillCategory skillCategory, String skillName, String requiredLevel) {
        this.user = user;
        this.skillCategory = skillCategory;
        this.skillName = skillName;
        this.requiredLevel = requiredLevel;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        if (this.status == null) {
            this.status = "OPEN";
        }
    }
}
