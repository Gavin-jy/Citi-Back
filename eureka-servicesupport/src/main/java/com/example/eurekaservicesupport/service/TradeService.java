package com.example.eurekaservicesupport.service;

import com.example.eurekaservicesupport.entity.Trade;

import java.util.List;
import java.util.Map;


public interface TradeService {
    List<Trade> getTrade(Map<String, Object> queryInfo);
    void buyStock(Map<String, Object> tradeInfo);
    void sellStock(Map<String, Object> tradeInfo);
}
