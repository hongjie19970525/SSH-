package com.bank.service.impl;

import java.sql.SQLException;
import com.bank.domain.UserInfo;
import com.bank.dao.UserDao;
import com.bank.dao.impl.UserDAOImpl;
import com.bank.service.UserFacade;

public class UserFacadeImpl implements UserFacade{
	private UserDao userDAO;
	public UserFacadeImpl(){
		userDAO=new UserDAOImpl();
	}
	@Override
	public int login(UserInfo user) throws SQLException {
		
		return userDAO.Login(user);
	}

	@Override
	public void registService(UserInfo user) throws SQLException {
		// TODO Auto-generated method stub
		userDAO.registService(user);
	}

	@Override
	public UserInfo selectUser(String userNO) throws SQLException {
		// TODO Auto-generated method stub
		return userDAO.selectUser(userNO);
	}

	@Override
	public void updateUserInfo(UserInfo user, String userNO) throws SQLException {
		// TODO Auto-generated method stub
		userDAO.updateUserInfo(user, userNO);
		
	}

	@Override
	public void deleteUserInfo(String userNO) throws SQLException {
		// TODO Auto-generated method stub
		userDAO.deleteUserInfo(userNO);
		
	}

	@Override
	public void withdrawUser(String userNO) {
		// TODO Auto-generated method stub
		userDAO.withdrawUser(userNO);
	}

}
