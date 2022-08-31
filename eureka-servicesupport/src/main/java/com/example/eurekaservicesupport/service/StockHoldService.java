package com.example.eurekaservicesupport.service;

import com.example.eurekaservicesupport.entity.StockHold;

import java.util.List;


public interface StockHoldService {
    public List<StockHold> getStockHold(int clientId);
}
