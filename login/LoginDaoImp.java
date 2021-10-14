package com.cybage.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cybage.model.User;
import com.cybage.utility.JDBCUtility;

public class LoginDaoImp implements LoginDao {

	@Override
	public void login(User user) {
		String username= user.getUsername();
		String password = user.getPassword();
		int id = user.getId();
		String userType = user.getUsertype();
		try {
			Connection connection = JDBCUtility.getConnection();
			String query = "select * from user";
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(query);
			
			if(username.equals("username") && password.equals("password")) {
				
			}else {
				
			}
			
		}catch(SQLException  e) {
			e.printStackTrace();
		}
		
	}
	
}
