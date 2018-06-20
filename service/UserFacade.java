package com.bank.service;

import java.sql.SQLException;
import com.bank.domain.UserInfo;
public interface UserFacade {
	int login(UserInfo user) throws SQLException;
	void registService(UserInfo user)throws SQLException;
	UserInfo selectUser(String userNO)throws SQLException;
	void updateUserInfo(UserInfo user, String userNO)throws SQLException;
	void deleteUserInfo(String userNO) throws SQLException;
	void withdrawUser(String userNO);
}
