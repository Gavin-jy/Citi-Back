package com.example.eurekaservicesupport.dao;

import com.example.eurekaservicesupport.entity.TradeStatistic;

import java.util.List;
import java.util.Map;


public interface TradeStatisticMapper {
    int deleteByPrimaryKey(Integer tradeStatisticId);

    int insert(TradeStatistic row);

    int insertSelective(TradeStatistic row);

    TradeStatistic selectByPrimaryKey(Integer tradeStatisticId);

    int updateByPrimaryKeySelective(TradeStatistic row);

    int updateByPrimaryKey(TradeStatistic row);

    List<Map<String,Object>> selectByDate(String startTime, String endTime);
}