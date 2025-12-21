package com.example.demo.dto;

public class UserProfileDto {

    private Long id;
    private String fullName;
    private String location;
    private Double rating;

    public UserProfileDto() {}

    public UserProfileDto(Long id, String fullName, String location, Double rating) {
        this.id = id;
        this.fullName = fullName;
        this.location = location;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLocation() {
        return location;
    }

    public Double getRating() {
        return rating;
    }
}
