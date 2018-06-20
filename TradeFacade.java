package com.bank.service;
import java.sql.SQLException;
import java.util.List;
import com.bank.domain.TradeInfo;

public interface TradeFacade {
	void saveMoney(TradeInfo tradeInfo)throws SQLException;
	void fetchMoney(TradeInfo tradeInfo)throws SQLException;
	Integer selectBalance(String userNO) throws SQLException;
	
	List selectTradeInfo(String userNO) throws SQLException;
	int findUserflag(String userNO) throws SQLException;
	boolean confirmTransfer(TradeInfo tradeInfo1,TradeInfo tradeInfo);
}
