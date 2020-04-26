package org.studyeasy.spring;

import javax.validation.constraints.Size;

public class Information {
	
	@Size(min = 4, max = 12, message = "Please enter a valid name")
	private String firstName;
	private String lastName;
	private String gender;
	private String  country;
	private String  message;
	private String  visitedCountry[];

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String[] getVisitedCountry() {
		return visitedCountry;
	}

	public void setVisitedCountry(String[] visitedCountry) {
		this.visitedCountry = visitedCountry;
	}

	
}
