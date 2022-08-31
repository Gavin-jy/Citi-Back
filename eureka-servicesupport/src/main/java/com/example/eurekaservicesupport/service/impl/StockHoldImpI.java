package com.example.eurekaservicesupport.service.impl;


import com.example.eurekaservicesupport.dao.StockHoldMapper;
import com.example.eurekaservicesupport.entity.StockHold;
import com.example.eurekaservicesupport.service.StockHoldService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StockHoldImpI implements StockHoldService {

    @Resource
    StockHoldMapper stockHoldMapper;

    @Override
    public List<StockHold> getStockHold(int clientId) {
        return stockHoldMapper.selectByClientId(clientId);
    }
    
}
