package com.luv2code.json.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//  it will ignore company from json file and will not throw exception

@JsonIgnoreProperties(ignoreUnknown=true)
public class Student {

	private String id;
	private String firstName;
	private String lastName;
	private boolean active;
	private Address address;
	private String[] languages;
	// unknown property added into json
//	private String company;
	
	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
}
