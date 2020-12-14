package com.example.app.service;

import com.example.app.model.Admin;
import com.example.app.repo.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepo dao;

    @Override
    public Admin findUser(String login, String password) {
        return dao.findUser(login,password);
    }

    @Override
    public List<Admin> findAll() {
        return dao.findAll();
    }

    @Override
    public Admin create(Admin entity) {
        return dao.saveAndFlush(entity);
    }

    @Override
    public Admin update(Admin entity) {
        return dao.saveAndFlush(entity);
    }

    @Override
    public void deleteById(int entityId) {
        dao.deleteById(entityId);
    }
}

