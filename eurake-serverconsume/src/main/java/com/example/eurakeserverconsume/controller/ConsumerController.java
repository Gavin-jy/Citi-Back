package com.example.eurakeserverconsume.controller;

import com.example.eurakeserverconsume.service.ConsumeService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping( "/Hello")
public class ConsumerController {
    @Autowired
    private ConsumeService consumeService;
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/Consumer")
    @HystrixCommand(fallbackMethod = "error_code")
    public Object haha() {
        return consumeService.hello();
    }
    public Object error_code(String s){
        Map<String,Object> tp = new HashMap<>();
        tp.put("false","服务器异常");
        return tp;
    }

}

