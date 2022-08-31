package com.example.eurekaservicesupport.entity;

import java.util.Date;

public class Rate {
    private Integer rateId;

    private String currency;

    private Double rate;

    private Date updateTime;

    public Integer getRateId() {
        return rateId;
    }

    public void setRateId(Integer rateId) {
        this.rateId = rateId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}