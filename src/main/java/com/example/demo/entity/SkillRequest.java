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
    private Skill skill;

    @Column(nullable = false)
    private String requiredLevel;

    @Column(nullable = false)
    private String status = "OPEN";

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "request")
    private List<MatchRecord> matches;

    public SkillRequest() {}

    public SkillRequest(User user, Skill skill, String requiredLevel) {
        this.user = user;
        this.skill = skill;
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
