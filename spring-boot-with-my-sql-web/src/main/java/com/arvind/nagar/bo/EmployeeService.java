/**
 * 
 */
package com.arvind.nagar.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arvind.nagar.dto.EmployeeRepository;
import com.arvind.nagar.model.Employee;

/**
 * @author Scorpio
 *
 */
@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getEmployeeDetails(){
		List<Employee> list = (List<Employee>) employeeRepository.findAll();
		return list;
	}
	public List<Employee> saveEmployee(Employee employee){
		employeeRepository.save(employee);
		List<Employee> list = (List<Employee>) employeeRepository.findAll();
		return list;
	}
}
