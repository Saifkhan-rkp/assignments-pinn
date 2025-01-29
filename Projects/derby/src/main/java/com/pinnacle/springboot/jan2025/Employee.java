package com.pinnacle.springboot.jan2025;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

 @Id
 private String employeeID; 
 @Column
 private String employeeName;
 @Column
 private String employeeAddress;

 public String getEmployeeID() {
  return employeeID;
 }
 public void setEmployeeID(String employeeID) {
  this.employeeID = employeeID;
 }
 public String getEmployeeName() {
  return employeeName;
 }
 public void setEmployeeName(String employeeName) {
  this.employeeName = employeeName;
 }
 public String getEmployeeAddress() {
  return employeeAddress;
 }
 public void setEmployeeAddress(String employeeAddress) {
  this.employeeAddress = employeeAddress;
 }
}