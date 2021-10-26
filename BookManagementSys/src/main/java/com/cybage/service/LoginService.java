package com.cybage.service;

import java.util.ArrayList;
import java.util.List;

import com.cybage.model.User;

public class LoginService {

	public List<User> list ;
	
	public LoginService(){
		list = new ArrayList<User>();
		list.add(new User("admin","admin"));	
	}
	
	
}
