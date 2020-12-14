package com.example.app.service;

import com.example.app.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ClientService {

    Client findUser(String login, String password);

    List<Client> findAll();

    Client create(Client entity);

    Client update(Client entity);


    void deleteById(int entityId);
}