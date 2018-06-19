package com.bank.dao;
import java.sql.SQLException;

public interface UserDao {
	int Login(UserInfo user) throws SQLException;
	void registService(UserInfo user) throws SQLException;
	UserInfo selectUser(String userNo) throws SQLException;
	void updateUserInfo(UserInfo user, String userNo) throws SQLException;
	void deleteUserInfo(String userNo) throws SQLException;
	void withdrawUser(String userNo);
	
}
