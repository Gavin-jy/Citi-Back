package com.example.eurakeserverconsume.controller;



import com.example.eurakeserverconsume.service.ConsumeService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/client")

public class ClientController {
    @Autowired
    private ConsumeService consumeService;

    @GetMapping("/insert")
    @HystrixCommand(fallbackMethod = "error_code")
    @CrossOrigin
    public Object mailSizeSend(@RequestParam("client_id")Integer id, @RequestParam("client_name")String name, @RequestParam("password")String password){

        int temp = consumeService.mailSizeSend(id,name,password);
        return temp;
    }
    public Object error_code(@RequestParam("client_id")Integer id, @RequestParam("client_name")String name, @RequestParam("password")String password){
        Map<String,Object> tp = new HashMap<>();
        tp.put("false","服务器异常");
        return tp;
    }

}
