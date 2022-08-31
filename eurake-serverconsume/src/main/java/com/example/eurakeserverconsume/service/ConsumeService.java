package com.example.eurakeserverconsume.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient("servicesuppot")
@Service
public interface ConsumeService {
        @GetMapping("/HEL/WOR")
        public String hello();
        @GetMapping("/tradeStatistc/search")
        public List<Map<String,Object>> getChart(@RequestParam("fre")String fre);

        @GetMapping("/insert")
        public int mailSizeSend(@RequestParam("client_id")Integer id, @RequestParam("client_name")String name, @RequestParam("password")String password);
        @GetMapping("/getTableData")
        public List<Object> getTableData(@RequestParam("queryInfo") Map<String, Object> queryInfo);//
        @PostMapping("/buyStock")
        public boolean buyStock(@RequestBody Map<String, Object> tradeInfo);
        @GetMapping("/getStockHold")
        public List<Object> getStockHold(@RequestParam("clientId")int clientId);
}


