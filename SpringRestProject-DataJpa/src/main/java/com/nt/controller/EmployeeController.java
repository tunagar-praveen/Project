package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Employee;
import com.nt.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employeeController")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl ser;
	
	@GetMapping("/home")
	public String home() {
    	return "hello bro";
		
	}
	
    @PostMapping("/register")
	public String registerEmployee(@RequestBody Employee emp) {
    	return ser.regiserEmployee(emp);
		
	}
    
    
    @GetMapping("/id/{id}")
    public ResponseEntity<Object> getEmployeeById(@PathVariable int id) {
    	Employee emp = ser.getEmployeeById(id);
    	if(emp!=null)
    	return new ResponseEntity<>(emp,HttpStatus.OK);
    	else
    		return new ResponseEntity<>("There is no Employee with id:: "+id,HttpStatus.OK);
    }
    
    @GetMapping("/allEmployees")
    public ResponseEntity<Object> getAllEmployees(){
    	List<Employee> emp = (List<Employee>) ser.showAllEmployee();
    	return new ResponseEntity<>(emp,HttpStatus.OK);
    }
}
