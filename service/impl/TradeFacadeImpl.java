package com.bank.service.impl;

import java.sql.SQLException;
import java.util.List;
import com.bank.service.TradeFacade;
import com.bank.dao.TradeDAO;
import com.bank.dao.impl.TradeDAOImpl;
import com.bank.domain.TradeInfo;

public class TradeFacadeImpl implements TradeFacade {
	private TradeDAO tradeDAO;
	public TradeFacadeImpl(){
		tradeDAO=new TradeDAOImpl();
	}
	@Override
	public void saveMoney(TradeInfo tradeInfo) throws SQLException {
		// TODO Auto-generated method stub
		tradeDAO.saveMoney(tradeInfo);
	}

	@Override
	public void fetchMoney(TradeInfo tradeInfo) throws SQLException {
		// TODO Auto-generated method stub
		tradeDAO.fetchMoney(tradeInfo);
	}

	@Override
	public Integer selectBalance(String userNO) throws SQLException {
		// TODO Auto-generated method stub
		return tradeDAO.selectBalance(userNO);
	}

	@Override
	public List selectTradeInfo(String userNO) throws SQLException {
		// TODO Auto-generated method stub
		return tradeDAO.selectTradeInfo(userNO);
	}

	@Override
	public int findUserflag(String userNO) throws SQLException {
		// TODO Auto-generated method stub
		return tradeDAO.findUserflag(userNO);
	}

	@Override
	public boolean confirmTransfer(TradeInfo tradeInfo1, TradeInfo tradeInfo)throws SQLException {
		// TODO Auto-generated method stub
		return tradeDAO.confirmTransfer(tradeInfo1, tradeInfo);
	}

}
