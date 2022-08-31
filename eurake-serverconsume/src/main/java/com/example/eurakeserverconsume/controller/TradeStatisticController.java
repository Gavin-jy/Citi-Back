package com.example.eurakeserverconsume.controller;


import com.example.eurakeserverconsume.res.SUCCESS;
import com.example.eurakeserverconsume.service.ConsumeService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tradeStatistc")
public class TradeStatisticController {

    @Autowired
    private ConsumeService consumeService;
    @GetMapping("/search")
    @HystrixCommand(fallbackMethod = "error_code")
    @CrossOrigin
    public Object getChart(String fre){
        return new SUCCESS(consumeService.getChart(fre));
    }

    public Object error_code(String s){
        Map<String,Object> tp = new HashMap<>();
        tp.put("false","服务器异常");
        return tp;
    }

}
