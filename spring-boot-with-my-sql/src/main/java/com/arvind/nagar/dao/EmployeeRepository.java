package com.arvind.nagar.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.arvind.nagar.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

}
