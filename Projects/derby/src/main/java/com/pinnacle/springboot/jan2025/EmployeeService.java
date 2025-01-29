package com.pinnacle.springboot.jan2025;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {

 @Autowired(required = true)
 private EmployeeCURDRepository crudrep;
 
 public void saveEmployee(Employee emp) {
  // TODO Auto-generated method stub
  crudrep.save(emp);
 }
 public void updateEmployee(Employee emp, String empid) {
  // TODO Auto-generated method stub
  crudrep.save(emp);
 }
 public void deleteEmployee(String empid) {
  // TODO Auto-generated method stub
  crudrep.deleteById(empid);
 }
 public List<Employee> getEmployee() {
  // TODO Auto-generated method stub
  List<Employee> employeeList = new ArrayList<>();
  crudrep.findAll().forEach(employeeList::add);
  return employeeList;
 }
 public Optional<Employee> getEmployeeBYId(String empid) {
  // TODO Auto-generated method stubs
  return crudrep.findById(empid);
 }

}
