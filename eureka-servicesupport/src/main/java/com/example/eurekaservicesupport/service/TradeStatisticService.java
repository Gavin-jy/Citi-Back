package com.example.eurekaservicesupport.service;


import com.example.eurekaservicesupport.enums.FrequencyEnum;

import java.util.List;
import java.util.Map;

public interface TradeStatisticService {
    List<Map<String,Object>> getChart(FrequencyEnum fre);
}
