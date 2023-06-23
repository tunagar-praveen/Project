package com.nt.service;

import com.nt.model.Employee;

public interface IEmployeeService {

	public String regiserEmployee(Employee emp);
	public Employee getEmployeeById(Integer id);
	public Iterable<Employee> showAllEmployee();

}
