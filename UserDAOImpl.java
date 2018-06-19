package com.bank.dao.impl;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bank.dao.UserDao;
import com.bank.domain.UserInfo;
import com.bank.service.UserFacadeImpl;
import com.bank.utils.DBConnectionl
import com.bank.utils.MD5;

public class UserDAOImpl implements UserDao {
	Connection conn=null;
	Statement st=null;
	public int login(UserInfo user)throws SQLException{
		int flag=1;
		MD5 md5=new MD5();
		if(user!=null){
			UserFacade userFacade=new UserFacaedImpl();
			String account=user.getUserNO();
			UserInfo userInfo=userFacade.selectUser(account);
			if(userInfo!=null){
				if(userInfo.getUserflag()==2){
					flag=2;
					return flag;
				}
			}
			
			String userNO=user.getUserNo();
			
			String password=user.getPassword();
			try{
				conn=DBConnection.getDBC();
				st=conn.createStatement();
				String sql="select userNo form userInfo where userNO='"+userNO
						+"'and password='"+password+"'";
				ResultSet rs=st.executeQuery(sql);
				if(rs.next()){
					flag=0;
					rs.close();
					
				}
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				st.close();
				conn.close();
			}
		}else{
			System.out.println("正在进行登录业务");
		}
		return flag;					
	}
	
	public void registService(UserInfo user)throws SQLException{
		MD5 md5=new MD5();
		long s=System.currentTimeMillis();
		String a=String.valueOf(s);
		user.setUserNO(a);
		String sql="insert into userInfo"
				+"(userName,password,userAge,idCard,userSex,tel,city,userAddress.userNO,balance userflag)"
				+"values('"+user.getUserName()+"',"+"’"
				+md5.getMD5ofStr(user.getPassword())+"',"+"'"
				+user.getUserAge()+"',"+"'"+user.getIdCard()+"',"
				+"'"+user.getUserSex()+"',"+"'"+user.getTel()+"',"
				+"'"+user.getCity()+"',"+"'"+user.getAddress()+"',"
				+"'"+user.getUserNO+"','"+0+"','"+0+"')";
		try{
			conn=DBConnection.getDBC();
			conn.setAutoCommit(false);;
			st=conn.createStatement();
			conn.commit();
		}catch(Exception e){
			e.printStackTrace();
			conn.rollback();
		}finally{
			st.close();
			conn.close();
		}	
	}
	
	public UserInfo selectUser(String userNO) throws SQLException{
		ResultSet rs=null;
		UserInfo userInfo=null;
		String sql="select* form userInfo where userNO='"+userNO+"'";
		try{
			conn=DBConnection.getDBC();
			st=conn.createStatement();
			userInfo=new UserInfo();
			rs=st.executeQuery(sql);
			if(rs.next()){
				userInfo.setUserName(rs.getString("userName"));
				userInfo.setUserNO(rs.getString("userNO"));
				userInfo.setUserAge(rs.getInt("userAge"));
				userInfo.setIdCard(rs.getString("idCard"));
				userInfo.setTel(rs.getString("tel"));
				userInfo.setCity(rs.getString("city"));
				userInfo.setBalance(rs.getInt("balance"));
				userInfo.setAddress(rs.getString("userAddress"));
				userInfo.setUserflag(rs.getInt("userflag"));
				return userInfo;
			}	
		}catch(SQLException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			rs.close();
			st.close();
			conn.close();
		}
		return null;
	}
	
	public void updateUserInfo(UserInfo user,String userNO)throws SQLException{
		MD5 md5=new MD5();
		String sql="update userInfo set tel='"+user.getTel()
				+"',password'"+md5.getMD5ofStr(user.getPassword())
				+"',city='"+user.getCity()+"',userAddress='"
				+user.getAddress()+"'";
		try{
			conn=DBConnection.getDBC();
			conn.setAutoCommit(false);
			st=conn.createStatement();
			st.executeQuery(sql);
			conn.commit();
		}catch(Exception e){
			e.printStackTrace();
			conn.rollback();
		}finally{
			st.close();
			conn.close();
		}
	}
	
	public void deleteUserInfo(String userNO)throws SQLException{
		String sql="update userInfo set user=flag='1' where userNO='"+userNO+"'";
		try{
			conn=DBConnection.getDBC();
			conn.setAutoCommit(false);
			st=conn.createStatement();
			st.executeQuery(sql);
			conn.commit();
		}catch(Exception e){
			e.printStackTrace();
			conn.rollback();
		}finally{
			st.close();
			conn.close();
		}
	}
	
	public void widthdrawUser(String userNO){
		String sql="update userInfo setflag='2' where userNO='" +userNO+"'";
		try{
			conn=DBConnection.getDBC();
			conn.setAutoCommit(false);
			st=conn.createStatement();
			st.executeQuery(sql);
			conn.commit();
		}catch(Exception e){
			e.printStackTrace();
			conn.rollback();
		}finally{
			st.close();
			conn.close();
		}
	}
}
