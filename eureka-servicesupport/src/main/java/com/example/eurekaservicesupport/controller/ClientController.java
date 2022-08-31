package com.example.eurekaservicesupport.controller;



import com.example.eurekaservicesupport.entity.Client;
import com.example.eurekaservicesupport.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import javax.annotation.Resource;

@RestController
@RequestMapping("/client")

public class ClientController {
    @Resource
    ClientService clientService;

    @PostMapping("/register")
    @CrossOrigin
    public int register(@RequestBody Client client){
        int temp = clientService.insert(client);
        return temp;
    }

    @PostMapping("/login")
    @CrossOrigin
    public Client login(@RequestBody Client loginRequest){
        Client clientInfo = clientService.login(loginRequest);
        return clientInfo;
    }

    @PostMapping("/changePassword")
    @CrossOrigin
    public Boolean changePassword(@RequestBody Map<String, Object> changePasswordRequest){
        try {
            Integer clientId = (Integer)changePasswordRequest.get("clientId");
            String originalPassword = (String)changePasswordRequest.get("originalPassword");
            String newPassword = (String)changePasswordRequest.get("newPassword");
            System.out.println(clientId);
            System.out.println(originalPassword);
            System.out.println(newPassword);
            clientService.changePassword(clientId,originalPassword,newPassword);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }

}
