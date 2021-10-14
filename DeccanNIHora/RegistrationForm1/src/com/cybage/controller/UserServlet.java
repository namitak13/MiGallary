package com.cybage.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.cybage.DAO.UserDAO;
import com.cybage.model.User;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserDAO userdao= new UserDAO();
    /**
     * Default constructor. 
     */
    public UserServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String first_name=request.getParameter("first_name");
		String last_name=request.getParameter("last_name");
		String email=request.getParameter("email");
		String user_name=request.getParameter("user_name");
		String password=request.getParameter("password");
		
		User user=new User();
		user.setFirst_name(first_name);
		user.setLast_name(last_name);
		user.setEmail(email);
		user.setUser_name(user_name);
		user.setPassword(password);
		
		try {
			userdao.registeruser(user);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = (RequestDispatcher) request.getRequestDispatcher("UserReg.jsp");
		dispatcher.forward(request, response);
		
		
	}

}
