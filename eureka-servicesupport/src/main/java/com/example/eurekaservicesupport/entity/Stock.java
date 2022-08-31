package com.example.eurekaservicesupport.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Stock {
    private Integer stockId;

    private String ric;

    private String ticker;

    private String issuerSectorId;

    private String currency;

    private BigDecimal price;

    private BigDecimal nationalUsd;

    private Integer totalCount;

    private Date updateTime;

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public String getRic() {
        return ric;
    }

    public void setRic(String ric) {
        this.ric = ric == null ? null : ric.trim();
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker == null ? null : ticker.trim();
    }

    public String getIssuerSectorId() {
        return issuerSectorId;
    }

    public void setIssuerSectorId(String issuerSectorId) {
        this.issuerSectorId = issuerSectorId == null ? null : issuerSectorId.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getNationalUsd() {
        return nationalUsd;
    }

    public void setNationalUsd(BigDecimal nationalUsd) {
        this.nationalUsd = nationalUsd;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}