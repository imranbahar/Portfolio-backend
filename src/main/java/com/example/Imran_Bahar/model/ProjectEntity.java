package com.example.Imran_Bahar.model;

import jakarta.persistence.*;

@Entity
@Table(name = "projects")
public class ProjectEntity { // Changed to ProjectEntity to match your file name
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;
    private String role;
    private String tech;
    
    @Column(columnDefinition = "TEXT")
    private String description;

    // Constructors
    public ProjectEntity() {}

    public ProjectEntity(String title, String role, String tech, String description) {
        this.title = title;
        this.role = role;
        this.tech = tech;
        this.description = description;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    
    public String getTech() { return tech; }
    public void setTech(String tech) { this.tech = tech; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}