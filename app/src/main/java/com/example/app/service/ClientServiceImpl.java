package com.example.app.service;

import com.example.app.model.Client;
import com.example.app.repo.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepo dao;

    @Override
    public Client findUser(String login, String password) {
        return dao.findUser(login,password);
    }

    @Override
    public List<Client> findAll() {
        return dao.findAll();
    }

    @Override
    public Client create(Client entity) {
        return dao.saveAndFlush(entity);
    }

    @Override
    public Client update(Client entity) {
        return dao.saveAndFlush(entity);
    }

    @Override
    public void deleteById(int entityId) {
        dao.deleteById(entityId);
    }
}
