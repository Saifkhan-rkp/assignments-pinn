package com.pinnacle.student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Course {
    @Id
    @GeneratedValue(generator = "course_seq_generator")
    @SequenceGenerator(name = "course_seq_generator", sequenceName = "course_seq", allocationSize = 1)
    private long id;
    private String name;
    private String description;
    private long totalEnrolled;
    private double fees;
    // private double paidFees;
    // private double balanceFees;
    
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	// public double getPaidFees() {
	// 	return paidFees;
	// }
	// public void setPaidFees(double paidFees) {
	// 	this.paidFees = paidFees;
	// }
	// public double getBalanceFees() {
	// 	return balanceFees;
	// }
	// public void setBalanceFees(double balanceFees) {
	// 	this.balanceFees = balanceFees;
	// }

    public long getTotalEnrolled() {
		return totalEnrolled;
	}
	public void setTotalEnrolled(long totalEnrolled) {
		this.totalEnrolled = totalEnrolled;
	}
}
