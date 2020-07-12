package com.arvind.nagar.util;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arvind.nagar.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	public List<Employee> findByDept(String dept);
}
