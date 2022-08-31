package com.example.eurakeserverconsume.controller;

import com.example.eurakeserverconsume.res.SUCCESS;
import com.example.eurakeserverconsume.service.ConsumeService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StockHoldController {

    @Autowired
    private ConsumeService consumeService;

    @GetMapping("/getStockHold")
    @HystrixCommand(fallbackMethod = "error_code")
    @CrossOrigin
    public Object getStockHold(int clientId){
        return new SUCCESS(consumeService.getStockHold(clientId));
    }

    public Object error_code(int clientId){
        Map<String,Object> tp = new HashMap<>();
        tp.put("false","服务器异常");
        return tp;
    }
}
