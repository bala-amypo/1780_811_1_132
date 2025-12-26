package com.example.demo.dto;

public class MatchRecordDto {

    private Long id;
    private String status;
    private Double matchScore;

    public MatchRecordDto() {
    }

    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getStatus() {
        return status;
    }
 
    public void setStatus(String status) {
        this.status = status;
    }
 
    public Double getMatchScore() {
        return matchScore;
    }
 
    public void setMatchScore(Double matchScore) {
        this.matchScore = matchScore;
    }
}
