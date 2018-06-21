package com.bank.dao;
import java.sql.SQLException;
import java.util.List;

import com.bank.domain.TradeInfo;

public interface TradeDAO {
	void saveMoney(TradeInfo tradeInfo) throws SQLException;
	
	void fetchMoney(TradeInfo tradeInfo) throws SQLException;
	
	Integer selectBalance(String UserNO) throws SQLException;
	
	List selectTradeInfo(String userNO) throws SQLException;
	int findUserflag(String userNO) throws SQLException;
	
	boolean confirmTransfer(TradeInfo tradeInfo1,TradeInfo tradeInfo) throws SQLException;
	
}
