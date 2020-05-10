package org.studyeasy.spring.model;

import org.hibernate.validator.constraints.Email;

public class User {
private String userID;
private String name;
@Email
private String email;
private String password;


public User() {
}

public User(String userID, String name, String email, String password) {
	super();
	this.userID = userID;
	this.name = name;
	this.email = email;
	this.password = password;
}

public String getUserID() {
	return userID;
}
public void setUserID(String userID) {
	this.userID = userID;
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


public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [userID=" + userID + ", name=" + name + ", email=" + email + "]";
}



}
