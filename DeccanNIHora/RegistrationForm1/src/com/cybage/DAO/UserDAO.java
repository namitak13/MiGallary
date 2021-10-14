package com.cybage.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cybage.model.User;

public class UserDAO {
    public int registeruser(User user) throws ClassNotFoundException{
    	//String INSERT_USER_SQL = "insert into user" + "(first_name, last_name, user_name, password) values" + "(?,?,?,?)";
    	int result=0;
    	Class.forName("com.mysql.jdbc.Driver");
    	try ( 
    			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
    			PreparedStatement ps=connection.prepareStatement("insert into user (first_name, last_name,email, user_name, password) values (?,?,?,?,?)")
    			){
    		ps.setString(1, user.getFirst_name());
    		ps.setString(2, user.getLast_name());
    		ps.setString(3, user.getEmail());
    		ps.setString(4, user.getUser_name());
    		ps.setString(5, user.getPassword());
    		ps.executeUpdate();
    	}catch (SQLException e) {
    		e.printStackTrace();
    	}
    	return result;
    }
}
