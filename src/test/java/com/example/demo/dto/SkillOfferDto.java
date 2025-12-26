package com.example.demo.dto;

public class SkillOfferDto {

    private Long id;
    private String experienceLevel;
    private boolean active;

    public SkillOfferDto() {
    }

    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getExperienceLevel() {
        return experienceLevel;
    }
 
    public void setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }
 
    public boolean isActive() {
        return active;
    }
 
    public void setActive(boolean active) {
        this.active = active;
    }
}
