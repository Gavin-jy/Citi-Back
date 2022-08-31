package com.example.eurekaservicesupport.dao;

import com.example.eurekaservicesupport.entity.Trade;
import com.example.eurekaservicesupport.entity.TradeKey;
import com.example.eurekaservicesupport.query.TradeQuery;

import java.util.List;



public interface TradeMapper {
    int deleteByPrimaryKey(TradeKey key);

    int insert(Trade row);

    int insertSelective(Trade row);

    Trade selectByPrimaryKey(TradeKey key);

    int updateByPrimaryKeySelective(Trade row);

    int updateByPrimaryKey(Trade row);

    List<Trade> selectALL(TradeQuery tradeQuery);
}