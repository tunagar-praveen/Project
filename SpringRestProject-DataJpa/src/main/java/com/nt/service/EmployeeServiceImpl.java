package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.repository.IEmployeeRepo;

@Service("/employeeService")
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	IEmployeeRepo repo;

	@Override
	public String regiserEmployee(Employee emp) {
	Employee em =	repo.save(emp);
		return "Employee registered with employee_id::	"+em.getId();
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		Optional<Employee> emp = repo.findById(id);
		if(emp.isPresent()) {
			return emp.get();
		}else {
		return null;
		}
	}

	@Override
	public Iterable<Employee> showAllEmployee() {
		Iterable<Employee> employees = repo.findAll();
		return employees;
	}

}
