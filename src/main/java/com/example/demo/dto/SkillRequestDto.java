package com.example.demo.dto;

import java.time.LocalDateTime;

public class SkillRequestDto {

    private Long id;
    private Long profileId;
    private Long skillId;
    private String requiredLevel;
    private String status;
    private LocalDateTime createdAt;

    public SkillRequestDto() {}

    public SkillRequestDto(Long id, Long profileId, Long skillId,
                           String requiredLevel, String status,
                           LocalDateTime createdAt) {
        this.id = id;
        this.profileId = profileId;
        this.skillId = skillId;
        this.requiredLevel = requiredLevel;
        this.status = status;
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

    public String getRequiredLevel() {
        return requiredLevel;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
