package com.cybage.service;

import com.cybage.dao.LoginDao;
import com.cybage.dao.LoginDaoImp;
import com.cybage.model.User;

public class LoginService {
	LoginDao loginDao = new LoginDaoImp();
	
	public void login(User user) {
		loginDao.login(user);
	}
}
