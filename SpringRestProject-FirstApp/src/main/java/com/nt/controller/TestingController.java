package com.nt.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Address;
import com.nt.model.Employee;
import com.nt.model.Person;

@RestController
@RequestMapping("/testingcontroller")
public class TestingController {
	@GetMapping("/firstmethod")
    public String firstMethod() {
    	return "firstmethod";
    }
	
	@GetMapping("/json")
	public ResponseEntity<Object> objectToJson() {
		Person p1 = new Person("praveen","mhbd","telangana");
		Person p2 = new Person("rahul","mhbd","telangana");
		List<Person> l = new ArrayList<Person>();
		l.add(p2);
		l.add(p1);
		return new ResponseEntity<>(l,HttpStatus.OK);
		
	}
	
	@GetMapping("/object")
	public String jsonToObject(@RequestBody Person p) {
		return p.toString();
	}
	
	@GetMapping("/employee")
	public ResponseEntity<Object> employeeToJson() {
		Employee emp = new Employee();
		emp.setName("praveen");
		emp.setEmail("tunagarpraveen13@gmail.com");
		emp.setNickNames(List.of("mahesh babu","pokiri","billa"));
		emp.setAdd(new Address("mahabubabad","telangana","ntr nagar",506101));
		emp.setHobbies(new String[]{"Cricket","Chess","Carroms"});
		emp.setGovtIds(Map.of("adhar card","410452044630","voter id","V78412","pancard","AZZPT808C"));
		return new ResponseEntity<>(emp,HttpStatus.OK);
	}
}
