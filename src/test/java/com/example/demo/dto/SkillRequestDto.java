package com.example.demo.dto;

public class SkillRequestDto {

    private Long id;
    private String urgencyLevel;
    private boolean active;

    public SkillRequestDto() {
    }

    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getUrgencyLevel() {
        return urgencyLevel;
    }
 
    public void setUrgencyLevel(String urgencyLevel) {
        this.urgencyLevel = urgencyLevel;
    }
 
    public boolean isActive() {
        return active;
    }
 
    public void setActive(boolean active) {
        this.active = active;
    }
}
