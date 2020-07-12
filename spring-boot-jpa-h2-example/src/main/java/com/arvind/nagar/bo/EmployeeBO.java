/**
 * 
 */
package com.arvind.nagar.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arvind.nagar.model.Employee;
import com.arvind.nagar.util.EmployeeRepository;

/**
 * @author Scorpio
 *
 */
@Service
public class EmployeeBO {
	
	@Autowired
	private EmployeeRepository employeeData;

	public List<Employee> getListOfEmployee(){
		List<Employee> list = employeeData.findAll();
		return list;
	}
	public List<Employee> addEmployee(Employee employee){
		employeeData.save(employee);
		List<Employee> list = employeeData.findAll();
		return list;
	}
	public List<Employee> getListByDept(String deptName){
		List<Employee> list = employeeData.findByDept(deptName);
		return list;
	}
	
}
