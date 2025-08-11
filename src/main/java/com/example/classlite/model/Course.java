package com.example.classlite.model;

public class Course {
    private Long id;
    private String title;
    private String description;

    // Constructor
    public Course(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    // Getters (so Spring can turn it into JSON)
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
