package com.example.app.controller;

import com.example.app.model.Admin;
import com.example.app.model.Tarif;
import com.example.app.service.AdminService;
import com.example.app.service.TarifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AdminAuthorization {

    @Autowired
    private AdminService adminService;

    @Autowired
    private TarifService tarifService;

    @Transactional
    @RequestMapping(value = {"/adminauthor"},method = RequestMethod.GET)
    public String getAdminAuthorization() {

        return "adminAuthor";
    }

    @Transactional
    @RequestMapping(value = {"/adminauthor"},method = RequestMethod.POST)
    public String postAdminAuthorization(@RequestParam("login") String login, @RequestParam("password") String password, Model model) {

        Admin admin =  adminService.findUser(login,password);

        List<Tarif> tarifs = tarifService.findAll();

        model.addAttribute("list",tarifs);

        return "adminOffice";
    }
    }
