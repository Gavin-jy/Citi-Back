package com.example.eurekaservicesupport.entity;

import java.util.Date;

public class Trade extends TradeKey {
    private Integer tradeId;

    private String clientSide;

    private Integer size;

    private Integer salesPersonId;

    private String tradeType;

    private Date tradeDate;

    public Integer getTradeId() {
        return tradeId;
    }

    public void setTradeId(Integer tradeId) {
        this.tradeId = tradeId;
    }

    public String getClientSide() {
        return clientSide;
    }

    public void setClientSide(String clientSide) {
        this.clientSide = clientSide == null ? null : clientSide.trim();
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getSalesPersonId() {
        return salesPersonId;
    }

    public void setSalesPersonId(Integer salesPersonId) {
        this.salesPersonId = salesPersonId;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
    }

    public Date getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }
}