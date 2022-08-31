package com.example.eurekaservicesupport.query;

public class TradeQuery {
    private int clientId;
    private String startTime;
    private String endTime;
    private int order;
    private String clientSide;
    private String type;
    private int startIndex;
    private int pageSize;
    
    public int getClientId() {
        return clientId;
    }
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
    public String getStartTime() {
        return startTime;
    }
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    public String getEndTime() {
        return endTime;
    }
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    public int getOrder() {
        return order;
    }
    public void setOrder(int order) {
        this.order = order;
    }
    public String getClientSide() {
        return clientSide;
    }
    public void setClientSide(String clientSide) {
        this.clientSide = clientSide;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getStartIndex() {
        return startIndex;
    }
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }
    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
