package com.example.eurekaservicesupport.dao;

import com.example.eurekaservicesupport.entity.StockHold;
import com.example.eurekaservicesupport.entity.StockHoldKey;

import java.util.List;


public interface StockHoldMapper {
    int deleteByPrimaryKey(StockHoldKey key);

    int insert(StockHold row);

    int insertSelective(StockHold row);

    StockHold selectByPrimaryKey(StockHoldKey key);

    int updateByPrimaryKeySelective(StockHold row);

    int updateByPrimaryKey(StockHold row);

    int buyStock(StockHold row);

    int sellStock(StockHold row);

    List<StockHold> selectByClientId(int clientId);
}