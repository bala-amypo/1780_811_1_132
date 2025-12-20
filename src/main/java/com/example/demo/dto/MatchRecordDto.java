package com.example.barter.dto;

import java.time.LocalDateTime;

public class MatchRecordDto {

    private Long id;
    private Long offerId;
    private Long requestId;
    private String status;
    private Double matchScore;
    private LocalDateTime createdAt;

    public MatchRecordDto() {}

    public MatchRecordDto(Long id, Long offerId, Long requestId,
                          String status, Double matchScore,
                          LocalDateTime createdAt) {
        this.id = id;
        this.offerId = offerId;
        this.requestId = requestId;
        this.status = status;
        this.matchScore = matchScore;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public Long getOfferId() {
        return offerId;
    }

    public Long getRequestId() {
        return requestId;
    }

    public String getStatus() {
        return status;
    }

    public Double getMatchScore() {
        return matchScore;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
