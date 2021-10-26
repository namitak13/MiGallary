package com.cybage.model;

import javax.validation.constraints.NotBlank;

public class User {
	@NotBlank(message="Username should not be empty")
	String username;
	@NotBlank(message="Password should not be empty")
	String password;

	public User(){
		
	}
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
	
	
}
