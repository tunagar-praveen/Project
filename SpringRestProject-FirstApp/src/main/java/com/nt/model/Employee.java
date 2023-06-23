package com.nt.model;

import java.util.List;
import java.util.Map;


public class Employee {
	private String name;
	private String email;
	private Address add;
	private List<String> nickNames;
	private Map<String,String> govtIds;
	private String[] hobbies;
	
	
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public List<String> getNickNames() {
		return nickNames;
	}
	public void setNickNames(List<String> nickNames) {
		this.nickNames = nickNames;
	}
	public Map<String, String> getGovtIds() {
		return govtIds;
	}
	public void setGovtIds(Map<String, String> govtIds) {
		this.govtIds = govtIds;
	}
	

}
