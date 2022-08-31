package com.example.eurekaservicesupport.entity;

import java.util.Date;

public class StockHold extends StockHoldKey {
    private Integer stockHoldId;

    private Integer holdNumber;

    private Date updateTime;

    public Integer getStockHoldId() {
        return stockHoldId;
    }

    public void setStockHoldId(Integer stockHoldId) {
        this.stockHoldId = stockHoldId;
    }

    public Integer getHoldNumber() {
        return holdNumber;
    }

    public void setHoldNumber(Integer holdNumber) {
        this.holdNumber = holdNumber;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}