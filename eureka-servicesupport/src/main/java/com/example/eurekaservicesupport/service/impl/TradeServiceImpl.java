package com.example.eurekaservicesupport.service.impl;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.example.eurekaservicesupport.dao.StockHoldMapper;
import com.example.eurekaservicesupport.dao.TradeMapper;
import com.example.eurekaservicesupport.entity.StockHold;
import com.example.eurekaservicesupport.entity.StockHoldKey;
import com.example.eurekaservicesupport.entity.Trade;
import com.example.eurekaservicesupport.enums.FrequencyEnum;
import com.example.eurekaservicesupport.query.TradeQuery;
import com.example.eurekaservicesupport.service.TradeService;
import org.springframework.stereotype.Service;



@Service
public class TradeServiceImpl implements TradeService {

    @Resource
    TradeMapper tradeMapper;

    @Resource
    StockHoldMapper stockHoldMapper;

    @Override
    public List<Trade> getTrade(Map<String, Object> queryInfo) {
        TradeQuery tradeQuery = new TradeQuery();
        // 过滤频率
        if (queryInfo.containsKey("fre")){
            FrequencyEnum fre = FrequencyEnum.valueOf("_"+(String)queryInfo.get("fre"));
            Date dateNow = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateNow);
            calendar.add(Calendar.DATE, +1);
            Date dateTo = calendar.getTime();
            calendar.setTime(dateNow);
            // 根据存入的频率fre设定查询的范围
            calendar.add(fre.getUnit(), fre.getDuration());
            Date dateFrom = calendar.getTime();
            // 转换为MySQL识别的字符串
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            tradeQuery.setStartTime(sdf.format(dateFrom));
            tradeQuery.setEndTime(sdf.format(dateTo));
        }

        if(queryInfo.containsKey("pageSize") & queryInfo.containsKey("currentPage")){
            int pageSize = (Integer)queryInfo.get("pageSize");
            int currentPage = (Integer)queryInfo.get("currentPage");
            int startIndex = (currentPage - 1) * pageSize;
            tradeQuery.setPageSize(pageSize);
            tradeQuery.setStartIndex(startIndex);
        }

        // 排序
        if(queryInfo.containsKey("order")){
            int order = (Integer)queryInfo.get("order");
            tradeQuery.setOrder(order);
        }

        // 客户名称
        if(queryInfo.containsKey("clientName")){
            String clientName = (String)queryInfo.get("clientName");
        }

        // 股票名称
        if(queryInfo.containsKey("ticker")){
            String ticker = (String)queryInfo.get("ticker");
        }

        // 股票代号
        if(queryInfo.containsKey("ric")){
            String ric = (String)queryInfo.get("ric");
        }

        // 交易类型：买/卖
        if(queryInfo.containsKey("clientSide")){
            String clientSide = (String)queryInfo.get("clientSide");
            tradeQuery.setClientSide(clientSide);
        }

        
        
        List<Trade> tradesByTime = tradeMapper.selectALL(tradeQuery);
        return tradesByTime;
    }

    @Override
    public void buyStock(Map<String, Object> tradeInfo) {
        Date date = new Date();

        Trade trade = new Trade();
        trade.setClientId((Integer)tradeInfo.get("clientId"));
        trade.setStockId((Integer)tradeInfo.get("stockId"));
        trade.setSize((Integer)tradeInfo.get("size"));
        trade.setSalesPersonId((Integer)tradeInfo.get("salespersonId"));
        trade.setClientSide("Buy");
        trade.setTradeDate(date);

        StockHold stockHold = new StockHold();
        stockHold.setClientId(trade.getClientId());
        stockHold.setStockId(trade.getStockId());
        stockHold.setHoldNumber(trade.getSize());
        stockHold.setUpdateTime(date);

        tradeMapper.insert(trade);
        stockHoldMapper.buyStock(stockHold);
    }

    @Override
    public void sellStock(Map<String, Object> tradeInfo) {
        Date date = new Date();

        //判断库存是否足够
        StockHoldKey stockHoldKey = new StockHoldKey();
        stockHoldKey.setClientId((Integer)tradeInfo.get("clientId"));
        stockHoldKey.setStockId((Integer)tradeInfo.get("stockId"));
        StockHold currentStockHold = stockHoldMapper.selectByPrimaryKey(stockHoldKey);
        assert currentStockHold.getHoldNumber() - (Integer)tradeInfo.get("size") >= 0;

        Trade trade = new Trade();
        trade.setClientId((Integer)tradeInfo.get("clientId"));
        trade.setStockId((Integer)tradeInfo.get("stockId"));
        trade.setSize((Integer)tradeInfo.get("size"));
        trade.setSalesPersonId((Integer)tradeInfo.get("salespersonId"));
        trade.setClientSide("Sell");
        trade.setTradeDate(date);


        StockHold stockHold = new StockHold();
        stockHold.setClientId(trade.getClientId());
        stockHold.setStockId(trade.getStockId());
        stockHold.setHoldNumber(trade.getSize());
        stockHold.setUpdateTime(date);

        tradeMapper.insert(trade);
        stockHoldMapper.sellStock(stockHold);
        
    }
    
}
