package com.pinnacle.springboot.jan2025;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeCURDRepository extends CrudRepository<Employee, String>{

}
