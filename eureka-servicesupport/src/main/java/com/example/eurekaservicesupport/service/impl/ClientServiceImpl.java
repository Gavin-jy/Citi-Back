package com.example.eurekaservicesupport.service.impl;



import com.example.eurekaservicesupport.dao.ClientMapper;
import com.example.eurekaservicesupport.entity.Client;
import com.example.eurekaservicesupport.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.Date;

import javax.annotation.Resource;
@Service
public class ClientServiceImpl implements ClientService {
    @Resource
    private ClientMapper clientMapper;

    @Override
    public int insert(Client client){
        Date date = new Date();
        client.setRegisterTime(date);
        return clientMapper.insert(client);
    }

    @Override
    public Client login(Client loginRequest) {
        Client clientInfo = clientMapper.selectClientByRequest(loginRequest);
        return clientInfo;
    }

    @Override
    public void changePassword(Integer clientId, String originalPassword, String newPassword) {
        clientMapper.changePassword(clientId,originalPassword,newPassword);
    }
}
