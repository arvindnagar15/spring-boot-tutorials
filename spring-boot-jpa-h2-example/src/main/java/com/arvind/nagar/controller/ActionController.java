/**
 * 
 */
package com.arvind.nagar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arvind.nagar.bo.EmployeeBO;
import com.arvind.nagar.exception.SalesException;
import com.arvind.nagar.model.Employee;

/**
 * @author Scorpio
 *
 */
@RestController
public class ActionController {
	@Autowired
	private EmployeeBO employeeBO;
	 
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<Employee> getEmployeeList() {
		List<Employee> list = employeeBO.getListOfEmployee();
		return list;
	}
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public List<Employee> getEmployeeList(@RequestBody Employee employee) {
		List<Employee> list = employeeBO.addEmployee(employee);
		return list;
	}
	@RequestMapping(value="/listByDept", method=RequestMethod.GET)
	public List<Employee> getEmployeeListByDept(String deptName) {
		List<Employee> list = employeeBO.getListByDept(deptName);
		if(list.size() ==0) {
			throw new SalesException("1001", "Not found records");
		}
		return list;
	}
	/**
	 * @return the employeeBO
	 */
	public EmployeeBO getEmployeeBO() {
		return employeeBO;
	}
	/**
	 * @param employeeBO the employeeBO to set
	 */
	public void setEmployeeBO(EmployeeBO employeeBO) {
		this.employeeBO = employeeBO;
	}
	
}
