package com.example.eurekaservicesupport.entity;

import java.util.Date;

public class TradeStatistic {
    private Integer tradeStatisticId;

    private String description;

    private Integer totalBuy;

    private Integer totalSell;

    private Date statisticDate;

    private Date updateTime;

    public Integer getTradeStatisticId() {
        return tradeStatisticId;
    }

    public void setTradeStatisticId(Integer tradeStatisticId) {
        this.tradeStatisticId = tradeStatisticId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getTotalBuy() {
        return totalBuy;
    }

    public void setTotalBuy(Integer totalBuy) {
        this.totalBuy = totalBuy;
    }

    public Integer getTotalSell() {
        return totalSell;
    }

    public void setTotalSell(Integer totalSell) {
        this.totalSell = totalSell;
    }

    public Date getStatisticDate() {
        return statisticDate;
    }

    public void setStatisticDate(Date statisticDate) {
        this.statisticDate = statisticDate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}