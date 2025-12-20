package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "skills", uniqueConstraints = {
        @UniqueConstraint(columnNames = "name")
})
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    public Skill() {}

    public Skill(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // getters & setters
}
