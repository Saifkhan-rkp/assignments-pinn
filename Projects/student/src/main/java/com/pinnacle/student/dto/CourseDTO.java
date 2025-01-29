package com.pinnacle.student.dto;

public class CourseDTO {
    private long id;
    private String name;
    private double fees;

    // Constructor
    public CourseDTO(long id, String name, double fees) {
        this.id = id;
        this.name = name;
        this.fees = fees;
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }
}
