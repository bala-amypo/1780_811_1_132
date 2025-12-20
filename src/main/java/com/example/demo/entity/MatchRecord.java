package com.example.barter.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "match_records")
public class MatchRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private SkillOffer offer;

    @ManyToOne(optional = false)
    private SkillRequest request;

    @Column(nullable = false)
    private String status = "PENDING";

    @Column(nullable = false)
    private Double matchScore = 0.0;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    public MatchRecord() {}

    public MatchRecord(SkillOffer offer, SkillRequest request) {
        this.offer = offer;
        this.request = request;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        if (this.status == null) {
            this.status = "PENDING";
        }
        if (this.matchScore == null) {
            this.matchScore = 0.0;
        }
    }
}
