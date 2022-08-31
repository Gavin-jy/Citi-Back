package com.example.eurekaservicesupport.service.impl;

import com.example.eurekaservicesupport.dao.TradeStatisticMapper;
import com.example.eurekaservicesupport.enums.FrequencyEnum;
import com.example.eurekaservicesupport.service.TradeStatisticService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class TradeStatisticImpl implements TradeStatisticService {
    @Resource
    private TradeStatisticMapper tradeStatisticMapper;

    @Override
    public List<Map<String,Object>> getChart(FrequencyEnum fre) {

        Date dateNow = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateNow);
        calendar.add(Calendar.DATE, +1);
        Date dateTo = calendar.getTime();

        calendar.setTime(dateNow);
        calendar.add(fre.getUnit(), fre.getDuration());
        Date dateFrom = calendar.getTime();


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<Map<String,Object>> tradeStatisticByTime = tradeStatisticMapper.selectByDate(sdf.format(dateFrom), sdf.format(dateTo));
        return tradeStatisticByTime;
    }
}
