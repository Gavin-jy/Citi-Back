package com.example.eurekaservicesupport.entity;

import java.util.Date;

public class SalesPerson {
    private Integer salesPersonId;

    private String jobNumber;

    private String salesPersonName;

    private String password;

    private Date registerTime;

    public Integer getSalesPersonId() {
        return salesPersonId;
    }

    public void setSalesPersonId(Integer salesPersonId) {
        this.salesPersonId = salesPersonId;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber == null ? null : jobNumber.trim();
    }

    public String getSalesPersonName() {
        return salesPersonName;
    }

    public void setSalesPersonName(String salesPersonName) {
        this.salesPersonName = salesPersonName == null ? null : salesPersonName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }
}