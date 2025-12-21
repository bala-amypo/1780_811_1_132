package com.example.demo.dto;

import java.time.LocalDateTime;

public class SkillOfferDto {

    private Long id;
    private Long profileId;
    private Long skillId;
    private String experienceLevel;
    private String availability;
    private LocalDateTime createdAt;

    public SkillOfferDto() {}

    public SkillOfferDto(Long id, Long profileId, Long skillId,
                         String experienceLevel, String availability,
                         LocalDateTime createdAt) {
        this.id = id;
        this.profileId = profileId;
        this.skillId = skillId;
        this.experienceLevel = experienceLevel;
        this.availability = availability;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public Long getProfileId() {
        return profileId;
    }

    public Long getSkillId() {
        return skillId;
    }

    public String getExperienceLevel() {
        return experienceLevel;
    }

    public String getAvailability() {
        return availability;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
