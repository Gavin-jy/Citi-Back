package com.example.eurekaservicesupport.service;

import com.example.eurekaservicesupport.entity.Client;

public interface ClientService {
    int insert(Client client);
    Client login(Client loginRequest);
    void changePassword(Integer clientId, String originalPassword, String newPassword);
}
