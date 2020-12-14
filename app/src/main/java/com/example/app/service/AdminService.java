package com.example.app.service;

import com.example.app.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AdminService {

    Admin findUser(String login, String password);

    List<Admin> findAll();

    Admin create(Admin entity);

    Admin update(Admin entity);


    void deleteById(int entityId);
}