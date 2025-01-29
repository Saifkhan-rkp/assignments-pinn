package com.pinnacle.springboot.jan2025;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

 @Autowired
 private EmployeeService employeeservice;
 
 @RequestMapping(method=RequestMethod.GET, value="/listofemp")
 public List<Employee> getEmployee() {
  
  return employeeservice.getEmployee();
 }
 @RequestMapping(method=RequestMethod.GET, value="/listofemp/{empid}")
 public Optional<Employee> getEmployeeBYId(@PathVariable String empid) {
  
  return employeeservice.getEmployeeBYId(empid);
 }
 @RequestMapping(method=RequestMethod.POST, value="/listofemp")
 public void saveEmployee(@RequestBody Employee emp) {
  
  employeeservice.saveEmployee(emp);
 }
 @RequestMapping(method=RequestMethod.PUT, value="/listofemp/{empid}")
 public void updateEmployee(@RequestBody Employee emp, @PathVariable String empid) {
  
  employeeservice.updateEmployee(emp,empid);
 }
 @RequestMapping(method=RequestMethod.DELETE, value="/listofemp/{empid}")
 public void deleteEmployee(@PathVariable String empid) {
  
  employeeservice.deleteEmployee(empid);
 }
}